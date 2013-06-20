package org.jpnouchi.MonitorCliente.error.model;

import org.jpnouchi.MonitorCliente.base.model.BaseObject;

/**
 * Created with IntelliJ IDEA.
 * User: jperalta
 * Date: 20/06/13
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class MensajeError extends BaseObject {

    private String cliente ;
    private String codigoAccion ;
    private String rucSociedad ;
    private String numeroDocumento;
    private String rucProveedor;
    private String codigoError;
    private String descripcion;
    private String fechaError;
    private String integracion;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getCodigoAccion() {
        return codigoAccion;
    }

    public void setCodigoAccion(String codigoAccion) {
        this.codigoAccion = codigoAccion;
    }

    public String getRucSociedad() {
        return rucSociedad;
    }

    public void setRucSociedad(String rucSociedad) {
        this.rucSociedad = rucSociedad;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public String getRucProveedor() {
        return rucProveedor;
    }

    public void setRucProveedor(String rucProveedor) {
        this.rucProveedor = rucProveedor;
    }

    public String getCodigoError() {
        return codigoError;
    }

    public void setCodigoError(String codigoError) {
        this.codigoError = codigoError;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFechaError() {
        return fechaError;
    }

    public void setFechaError(String fechaError) {
        this.fechaError = fechaError;
    }

    public String getIntegracion() {
        return integracion;
    }

    public void setIntegracion(String integracion) {
        this.integracion = integracion;
    }
}
