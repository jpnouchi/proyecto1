package com;

import org.apache.log4j.PropertyConfigurator;


import com.jdbc.Conexion;

public class Main {

	/**
	 * @param args
	 */
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conexion conexion= new Conexion();
//		conexion.actualizarRegistroCompPago2(1,"PRUEBA_SAP","JOSE");
		conexion.seleccionarRegistros(2, "PRUEBA_SAP");
	}

}
