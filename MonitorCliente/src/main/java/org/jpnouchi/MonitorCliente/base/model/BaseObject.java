package org.jpnouchi.MonitorCliente.base.model;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 19/06/13
 * Time: 17:18
 * To change this template use File | Settings | File Templates.
 */
public class BaseObject implements Serializable {

    public String toString(){
        return ReflectionToStringBuilder.toString(this, ToStringStyle.MULTI_LINE_STYLE);
    }

}
