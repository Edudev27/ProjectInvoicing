package Entity;

import com.fasterxml.jackson.databind.DatabindException;

import java.util.Date;

public class Factura {
    short idFactura;
    Date fechaFactura;
    int cantidadProductos;
    int precioUnitario;
    float iva;
    float precioTotal;

    //Constructor//
    public Factura(short idFactura, Date fechaFactura, int cantidadProductos, int precioUnitario, float iva, float precioTotal) {
        this.idFactura = idFactura;
        this.fechaFactura = fechaFactura;
        this.cantidadProductos = cantidadProductos;
        this.precioUnitario = precioUnitario;
        this.iva = iva;
        this.precioTotal = precioTotal;
    }

    //Getters and Setters


    public short getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(short idFactura) {
        this.idFactura = idFactura;
    }

    public Date getFechaFactura() {
        return fechaFactura;
    }

    public void setFechaFactura(Date fechaFactura) {
        this.fechaFactura = fechaFactura;
    }

    public int getCantidadProductos() {
        return cantidadProductos;
    }

    public void setCantidadProductos(int cantidadProductos) {
        this.cantidadProductos = cantidadProductos;
    }

    public int getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(int precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public float getIva() {
        return iva;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }
}








