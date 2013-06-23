package com.jpnouchi.app.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 12:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class BaseObject implements Serializable {

    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
