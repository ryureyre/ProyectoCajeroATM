public class Cuenta {
    private int tipo; //1: Ahorros, 2: Cheques
    private Cliente cliente;
    private String numeroDeCuenta;
    private double saldo;

    public Cuenta(int tipo, Cliente cliente, String numeroDeCuenta, double saldo) {
        this.tipo = tipo;
        this.cliente = cliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public int getTipo() {
        return tipo;
    }
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }
    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
