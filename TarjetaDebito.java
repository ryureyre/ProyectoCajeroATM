public class TarjetaDebito {
    private Cuenta cuenta;
    private Cliente cliente;

    public TarjetaDebito(Cuenta cuenta, Cliente cliente) {
        this.cuenta = cuenta;
        this.cliente = cliente;
    }
    
    public Cuenta getCuenta() {
        return cuenta;
    }
    public void setCuenta(Cuenta cuenta) {
        this.cuenta = cuenta;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

}
