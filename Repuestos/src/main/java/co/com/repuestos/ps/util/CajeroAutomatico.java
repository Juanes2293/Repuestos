package co.com.repuestos.ps.util;
import java.util.Scanner;
public class CajeroAutomatico {
    String nombre;
    int cuenta;
    int clave;
    int saldo;
    int var;
    public void CrearCuenta () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        nombre = scanner.nextLine();
        System.out.println("Ingrese la clave: ");
        clave = scanner.nextInt();
        cuenta = cuenta + 1;
        System.out.println("Señor/a " + nombre + " Su cuenta es: " + cuenta + " y la clave es: " + clave + " recuerde que tiene un saldo de: " + saldo);
    }

    public void Consignar ( ) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto desea consignar: ");
        var = scanner.nextInt();
        if (var < 0) {
            System.out.println("El valor a consignar no es valido");
        } else {
            saldo = saldo + var;
            System.out.println("Su nuevo saldo es: " + saldo);
        }

    }

    public void Retirar () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Cuanto desea retirar: ");
        var = scanner.nextInt();
        saldo = saldo - var;
        if (saldo < 0) {
            System.out.println("No existen fondos suficientes");
        } else {
            System.out.println("Su nuevo saldo es: " + saldo);
        }
    }

    public void ConsultarSaldo () {
        System.out.println("Su saldo actual es de: " + saldo);
    }

    public void CambioClave () {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dijite la clave actual: ");
        var = scanner.nextInt();
        if (var == clave) {
            System.out.println("Dijite la nueva clave: ");
            clave = scanner.nextInt();
        }
        else {
            System.out.println("Clave no valida: ");

        }
    }



    public static void main(String[] args) {
        CajeroAutomatico cajero = new CajeroAutomatico ();
        Scanner scanner = new Scanner(System.in);
        cajero.cuenta = 1000;
        cajero.saldo = 1000000;
        int opcion;
        do {
            System.out.println("\n ------MENU------");
            System.out.println("1. Crear Cuenta");
            System.out.println("2. Consignar");
            System.out.println("3. Retirar");
            System.out.println("4. Cambiar Clave");
            System.out.println("5. Consultar Saldo");
            System.out.println("6. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    cajero.CrearCuenta();
                    break;
                case 2:
                    cajero.Consignar();
                    break;
                case 3:
                    cajero.Retirar();
                    break;
                case 4:
                    cajero.CambioClave();
                    break;
                case 5:
                    cajero.ConsultarSaldo();
                    break;
                case 6:
                    System.out.println("Cerrando sesión...");
                    break;
            }
        } while (opcion != 6);
    }
}
