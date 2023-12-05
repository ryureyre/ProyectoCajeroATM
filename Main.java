import java.util.Scanner;

public class Main {
	
    public static void main(String[] args) {
        iniciar();
    }

    public static void iniciar(){
        Scanner scan = new Scanner(System.in);
        Transaccion tran = null;
        Cajero cajero1 = new Cajero("Soriana", "BBVA");
        Cliente cliente1 = new Cliente("1111", "Gilberto Maldonado", "Enrique Segoviano");
        Cuenta cuentaAhorros = new Cuenta(1,cliente1,"11101101", 20000.00);
        TarjetaDebito tj1 = new TarjetaDebito(cuentaAhorros,cliente1);
        String aux;

        Cliente cliente2 = new Cliente("2222", "Eloi", "amlo");
        Cuenta cuentaCheques = new Cuenta(2,cliente2,"10101101", 2000.00);
        TarjetaDebito tj2 = new TarjetaDebito(cuentaCheques,cliente2);


        int op;
        String opcion;
        do {
            System.out.println("Bienvenido al cajero\n\n");
            System.out.println("Ingrese Tarjeta\n");
            System.out.println("Se ingreso tarjeta tj1\n");
            System.out.println("Cliente: " + tj1.getCliente().getNombre());
            aux = cuentaAhorros.getTipo() == 1 ? "Ahorros" : "Cheques";
            System.out.println("Cuenta: " + aux);
            System.out.println("Saldo: " + tj1.getCuenta().getSaldo());
            System.out.println("\nOperaciones a realizar:");
            System.out.println("1.Retiro");
            System.out.println("2.Transferir");
            System.out.println("3.Salir");
            System.out.println("Ingrese una opcion:");
            op = scan.nextInt();
            

            switch (op) {
                case 1:
                    //retirar();
                    tran = cajero1.retirar(tj1.getCuenta(), 1, ingresarmonto());
                    break;
                case 2:
                    //transferir()
                    tran = cajero1.transferir(tj1.getCuenta(), tj2.getCuenta(), 2, ingresarmonto());
                    break;
                case 3:
                    System.out.println("Saliendo del cajero. ¡Hasta luego!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, ingrese una opción válida.");
                    break;
            }

            if (tran != null) {
                cajero1.imprimirTicket(cliente1, tran);
            } else {
                System.out.println("No se pudo realizar la transacción");
            }

            System.out.println("\n¿Desea realizar otra operación? (Sí/No): ");
            opcion = scan.next().toLowerCase();
        } while (opcion.equals("si"));
    }
    public static double ingresarmonto(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese monto a retirar");
        double monto = scan.nextDouble();
        return monto;
    }
}

