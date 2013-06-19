package com.jpnouchi.app.base.util;

import org.apache.commons.lang.StringUtils;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 19/06/13
 * Time: 17:33
 * To change this template use File | Settings | File Templates.
 */
public class GenericUtil {

    public static BigDecimal getDefaultBigDecimal(Object objValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return BigDecimal.valueOf(Double.valueOf(objValue.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static BigDecimal getDefaultBigDecimal(Object objValue, double dblDefault){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return BigDecimal.valueOf(Double.valueOf(objValue.toString()));
        } catch (Exception e) {
            e.printStackTrace();
            return new BigDecimal(dblDefault);
        }
        return new BigDecimal(dblDefault);
    }

    public static Integer getDefaultInt(Object objValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return Integer.valueOf(objValue.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return -1;
        }
        return -1;
    }

    public static Integer getDefaultInt(Object objValue, Integer defaultInt){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return Integer.valueOf(objValue.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return defaultInt;
        }
        return defaultInt;
    }


    public static Integer getDefaultNullInt(Object objValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return Integer.valueOf(objValue.toString());
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Long getDefaultLong(Object objValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()) && !objValue.toString().equals("null"))
                return Long.valueOf(objValue.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    public static Long getDefaultLong(BigDecimal bigDecimalValue){
        try {
            if(bigDecimalValue!=null )
                return bigDecimalValue.longValue();
        } catch (Exception e) {
            e.printStackTrace();
            return 0L;
        }
        return 0L;
    }

    public static Long getDefaultLong(Object objValue, Long defaultValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return Long.valueOf(objValue.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return defaultValue;
        }
        return defaultValue;
    }

    public static String getDefaultString(Object objValue){
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return objValue.toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return null;
    }

    /**
     * @author Mayer Horna
     * @param objValue Cadena que contiene la fecha
     * @param dateFormat formato de objValue
     * @return Timestamp
     */
    public static Timestamp getDefaultTimeStamp(Object objValue, String dateFormat){
        if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
                java.util.Date date = sdf.parse(objValue.toString());//new Date(objValue.toString());
                return new java.sql.Timestamp(date.getTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }

    /**
     * @author Mayer Horna
     * @param objValue Cadena que contiene la fecha
     * @param dateFormat formato de objValue
     * @return Timestamp
     */
    public static Date getDefaultDate(Object objValue, String dateFormat){
        if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
            try {
                SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
                java.util.Date date = sdf.parse(objValue.toString());//new Date(objValue.toString());
                return new Timestamp(date.getTime());
            } catch (Exception e) {
                e.printStackTrace();
            }
        return null;
    }

    /**
     * @author Mayer Horna
     * @param dateFormat formato en que la fecha debe ser devuelta
     * @return Fecha actual con el formato dateFormat
     * */
    public static String getCurrentStringDate(String dateFormat){
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat);
            java.util.Date date = new Date();
            return sdf.format(date).toString();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * devuelve la fecha actual en formato Timestamp
     * */
    public static Timestamp getCurrentTimestamp(){
        try {
            return new Timestamp(new Date().getTime());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static double getDefaultDouble(BigDecimal value) {
        if(value == null) return 0;
        return value.doubleValue();
    }

    public static double getDefaultDouble(Object objValue, double defaultValue) {
        try {
            if(objValue!=null && StringUtils.isNotBlank(objValue.toString()))
                return Double.parseDouble(objValue.toString());
        } catch (Exception e) {
            e.printStackTrace();
            return defaultValue;
        }
        return defaultValue;
    }


    public static boolean getDefaultBoolean(Object value) {
        if(value == null) {return false;}
        return new Boolean(value.toString());
    }

    public static void validateInputWithPattern(String str, String pattern) {
        RuntimeException re = null;
        Pattern $pattern = Pattern.compile(pattern);
        Matcher matcher = $pattern.matcher(str);
        if(matcher.matches() == false){
            re = new RuntimeException("Entradas Incorrectas");
            re.printStackTrace();
            throw re;
        }
    }

}

