import java.util.Date;

public class Cajero implements Transacciones {
    private String localizacion;
    private String banco;
    private int contadorID;

    public Cajero(String localizacion, String banco) {
        this.localizacion = localizacion;
        this.banco = banco;
        this.contadorID = 0;
    }

    @Override
    public Transaccion transferir(Cuenta cuentaOrigen, Cuenta cuentaDestino, int tipo, double monto) {
        Transaccion tran;
        if (cuentaOrigen.getSaldo() < monto) {
            System.out.println("No tienes suficiente dinero en la cuenta");
            tran = null;
        } else {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - monto);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + monto);
            tran = new Transferencia(contadorID, new Date(), tipo, monto, cuentaDestino);
        }
        return tran;
    }

    @Override
    public Transaccion retirar(Cuenta cuenta, int tipo, double monto) {
        Transaccion tran;
        if (cuenta.getSaldo() < monto) {
            System.out.println("No tienes suficiente dinero en la cuenta");
            tran = null;
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - monto);
            tran = new Retiro(contadorID, new Date(), tipo, monto);
        }
        return tran;
    }

    public void imprimirTicket(Cliente cliente, Transaccion tran) {
        String tipo;
        if (tran.getTipo() == 1) {
            tipo = "Retiro";
        } else {
            tipo = "Transferencia";
        }

        System.out.println("\n===============TICKET===============");
        System.out.println("=======Banco: " + banco + "========");
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Transaccion: " + tipo);
        System.out.println("Monto: " + tran.getMonto());
        System.out.println("====================================");
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
