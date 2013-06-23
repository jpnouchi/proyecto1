package com.jpnouchi.app.model;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Jose
 * Date: 23/06/13
 * Time: 12:18 PM
 * To change this template use File | Settings | File Templates.
 */
public class Control extends BaseObject{

    private int idControl;
    private int idError;
    private String rucProveedor;
    private String numeroDocumento;
    private String descripcionError;
    private String rucSociedad;
    private String codigoAccion;
    private String flagProcesado;
    private Date fechaError;

    public int getIdControl() {
        return idControl;
    }

    public void setIdControl(int idControl) {
        this.idControl = idControl;
    }

    public int getIdError() {
        return idError;
    }

    public void setIdError(int idError) {
        this.idError = idError;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getDescripcionError() {
        return descripcionError;
    }

    public void setDescripcionError(String descripcionError) {
        this.descripcionError = descripcionError;
    }

    public String getRucSociedad() {
        return rucSociedad;
    }

    public void setRucSociedad(String rucSociedad) {
        this.rucSociedad = rucSociedad;
    }

    public String getCodigoAccion() {
        return codigoAccion;
    }

    public void setCodigoAccion(String codigoAccion) {
        this.codigoAccion = codigoAccion;
    }

    public String getFlagProcesado() {
        return flagProcesado;
    }

    public void setFlagProcesado(String flagProcesado) {
        this.flagProcesado = flagProcesado;
    }

    public Date getFechaError() {
        return fechaError;
    }

    public void setFechaError(Date fechaError) {
        this.fechaError = fechaError;
    }
}
