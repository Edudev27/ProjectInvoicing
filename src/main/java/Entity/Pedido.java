package Entity;

import java.util.Date;

public class Pedido {

    short idPedido;
    String nombreProducto;
    Date fechaPedido;
    String estadoPedido;
    int precioPedido;

    //Constructor//


    public Pedido(short idPedido, String nombreProducto, Date fechaPedido, String estadoPedido, int precioPedido) {
        this.idPedido = idPedido;
        this.nombreProducto = nombreProducto;
        this.fechaPedido = fechaPedido;
        this.estadoPedido = estadoPedido;
        this.precioPedido = precioPedido;
    }

    //Getters and Setters//


    public short getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(short idPedido) {
        this.idPedido = idPedido;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public Date getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(Date fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public int getPrecioPedido() {
        return precioPedido;
    }

    public void setPrecioPedido(int precioPedido) {
        this.precioPedido = precioPedido;
    }
}
