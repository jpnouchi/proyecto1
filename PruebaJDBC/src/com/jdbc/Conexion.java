package com.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;




public class Conexion {

	

    /**
     * Usuario de la conexion de la Base Datos
     */
   public static String user;
    /**
     * Password del usuario de la base de datos
     */
   public static String password;
    /**
     * Driver de la Base de Datos
     */
   public static String driver;
    /**
     * Url de la Base de Datos
     */
   public static String url;
    /**
     * Schema de la Base de Datos
     */
   public static String schema;
    /**
     * Determina si esta conectado o no a la base de datos
     */
   public static boolean isConnected = false;
   Statement st;
   PreparedStatement pst;
   ResultSet rs;
   static Logger log = Logger.getLogger(Conexion.class);
   static {
       try {
           user = "sa";
           password = "nouchi123";
           driver = "net.sourceforge.jtds.jdbc.Driver";
           //url = "jdbc:jtds:sqlserver://192.168.1.34:1433;DatabaseName=PRUEBA";
           url = "jdbc:jtds:sqlserver://192.168.1.34:1433/PRUEBA";
           schema = "dbo";
           Class.forName(driver);
       } catch (Exception e) {
           log.info("Error en conectar driver " + e.getMessage());
           e.printStackTrace();
           //Helper.print("Error en conectar driver "+e.getMessage());
       }
   }

    /**
     * Metodo statico que Cierra la conexion con la base de datos
     * @throws java.sql.SQLException Error al cerrar la conexion con la Base de Datos
     */
   public synchronized static void closeConnection() throws SQLException{
       Conexion.getConnection().close();
   }

    /**
     * Obtiene la conexion con la base de datos
     * @throws java.sql.SQLException Error al conectar con la base de datos
     * @return Objeto Connection con la conexion de la Base de Datos
     */
   public synchronized static Connection getConnection() throws SQLException {
       /**
       * The following lines try to resolve 'Address already in use: connect'
       * error by trying to re-connect after a few seconds
       */
       Connection connection = null;
       byte tryCount = 0;
       while (connection == null) {
           //log.info("user "+user+" password "+password+" driver "+driver+" url "+url);
           try {
               connection = DriverManager.getConnection(url, user, password);
               connection.setAutoCommit(false);
               isConnected=true;
               //Helper.print("*** Connection successful!");
           }
           catch (SQLException ex) {
               isConnected=false;
               if (++tryCount > 5) {
                   //Helper.print("Error en BDHelper.getConection "+ex.getMessage());
                //   log.info("Error "+ex.getMessage());
            	   System.out.println("Error "+ex.getMessage());
                   throw ex;
               }
               else {
                   connection = null;
                   ex.printStackTrace();
                   //log.info("Esperando 5 segundos para volver a conectar");
                   System.out.println("Esperando 5 segundos para volver a conectar");
                   try {
                       Thread.sleep(5000);
                   }
                   catch (InterruptedException iex) {
                       System.out.println("Error "+iex.getMessage());
                   } // try
               } // if (++tryCount > 5)
           } // try
       } // while
       return connection;
   }
   
   public  void seleccionarRegistros(int id,String tabla) {
       int update=0;
       CallableStatement prcProcedimientoAlmacenado=null;
       Connection con=null;
       System.out.println("inicio");
       try{
           con = Conexion.getConnection();
           prcProcedimientoAlmacenado = con.prepareCall("{ call dbo.sp_ebiz_select_prueba (?,?) }");
           prcProcedimientoAlmacenado.setInt(1,id);
           prcProcedimientoAlmacenado.setString(2,tabla );
           rs=prcProcedimientoAlmacenado.executeQuery();
  
           int i=0;
    	   System.out.println("IDSAPDOC_PROVISION||	ESTADO");
           while(rs.next()){
        	  // System.out.println("fila "+(++i));
              System.out.println((++i)+"       "+rs.getInt("IDSAPDOC_PROVISION")+"         "+"||"+"	"+rs.getString("ESTADO"));
              
              System.out.println("-------------------------------");
           }
           
//           update= prcProcedimientoAlmacenado.executeUpdate();
//           if(update>0)
//              con.commit();
//           else
//              con.rollback();

       }
       catch(Exception e){
           log.info("Error al actualizar la ejecucion de SAPDOC_PROVISION "+e,e);
       }
       finally{
           try{
               if(pst!=null){
                   pst.close();
                   pst=null;
               }
               if(con!=null)
               con.close();
           }
           catch(SQLException sql){
               log.info("Error al cerrar el statment "+sql.getMessage());
           }
       }
   }
   
   public  void actualizarRegistroCompPago2(int id,String tabla,String estado) {
       int update=0;
       CallableStatement prcProcedimientoAlmacenado=null;
       Connection con=null;
       System.out.println("inicio");
       try{
           con = Conexion.getConnection();
           prcProcedimientoAlmacenado = con.prepareCall("{ call dbo.sp_ebiz_update_state_sapdocprovision (?,?,?) }");
           prcProcedimientoAlmacenado.setInt(1,id);
           prcProcedimientoAlmacenado.setString(2,tabla );
           prcProcedimientoAlmacenado.setString(3, estado);
           update= prcProcedimientoAlmacenado.executeUpdate();
           if(update>0)
              con.commit();
           else
              con.rollback();

       }
       catch(Exception e){
           log.info("Error al actualizar la ejecucion de SAPDOC_PROVISION "+e,e);
       }
       finally{
           try{
               if(pst!=null){
                   pst.close();
                   pst=null;
               }
               if(con!=null)
               con.close();
           }
           catch(SQLException sql){
               log.info("Error al cerrar el statment "+sql.getMessage());
           }
       }
   }
   

}
