package org.jpnouchi.MonitorCliente.error.model;

import org.jpnouchi.MonitorCliente.base.model.BaseObject;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 20/06/13
 * Time: 12:31
 * To change this template use File | Settings | File Templates.
 */
public class Control extends BaseObject {

    private int idControl;
    private int idError;
    private String rucProveedor;
    private String numeroDocumento;
    private String descripcionError;
    private String rucSociedad;
    private String codigoAccion;
    private String flagProcesado;
    private Date fechaError;



}
