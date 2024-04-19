package Entity;

public class Cliente {
    short idCliente;
    String nombreCliente;
    String apelidoCliente;
    String telefonoCliente;
    String correoCliente;

    //constructor//


    public Cliente(short idCliente, String nombreCliente, String apelidoCliente, String telefonoCliente, String correoCliente) {
        this.idCliente = idCliente;
        this.nombreCliente = nombreCliente;
        this.apelidoCliente = apelidoCliente;
        this.telefonoCliente = telefonoCliente;
        this.correoCliente = correoCliente;
    }

    //Getters and Setters//


    public short getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(short idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getApelidoCliente() {
        return apelidoCliente;
    }

    public void setApelidoCliente(String apelidoCliente) {
        this.apelidoCliente = apelidoCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public void setTelefonoCliente(String telefonoCliente) {
        this.telefonoCliente = telefonoCliente;
    }

    public String getCorreoCliente() {
        return correoCliente;
    }

    public void setCorreoCliente(String correoCliente) {
        this.correoCliente = correoCliente;
    }
}
