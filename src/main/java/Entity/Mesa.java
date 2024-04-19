package Entity;

public class Mesa {
    short idMesa;
    String numeroMesa;
    String estadoMesa;

    //Constructor//


    public Mesa(short idMesa, String numeroMesa, String estadoMesa) {
        this.idMesa = idMesa;
        this.numeroMesa = numeroMesa;
        this.estadoMesa = estadoMesa;
    }

    //Getters and Setters


    public short getIdMesa() {
        return idMesa;
    }

    public void setIdMesa(short idMesa) {
        this.idMesa = idMesa;
    }

    public String getNumeroMesa() {
        return numeroMesa;
    }

    public void setNumeroMesa(String numeroMesa) {
        this.numeroMesa = numeroMesa;
    }

    public String getEstadoMesa() {
        return estadoMesa;
    }

    public void setEstadoMesa(String estadoMesa) {
        this.estadoMesa = estadoMesa;
    }
}
