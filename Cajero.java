public class Cajero implements Transacciones {
    private String localizacion;
    private String banco;
    private int contadorID;

    public Cajero(String localizacion, String banco) {
        this.localizacion = localizacion;
        this.banco = banco;
        this.contadorID = 0;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getContadorID() {
        return contadorID;
    }

    public void setContadorID(int contadorID) {
        this.contadorID = contadorID;
    }

}
