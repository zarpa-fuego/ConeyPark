import java.util.Scanner;
public class Recarga_tarjeta {
    public String codigos_tarjeta() {
        Scanner usuario = new Scanner(System.in);
        int codigo;
        System.out.println("Bienvenido");
        boolean InicioSesion = false;
        while (!InicioSesion) {
            System.out.println("Ingrese su Codigo");
            codigo = usuario.nextInt();
            if (codigo == 1234) {
                System.out.println("Inicio de sesión exitoso");
                InicioSesion = true;
            } else {
                System.out.println("Codigo incorrecto, intente nuevamente");
            }
        }
        return "Sesión iniciada";
    }
    public static void main(String[] args) {
        Recarga_tarjeta recargatarjeta = new Recarga_tarjeta();
        recargatarjeta.codigos_tarjeta();
    }

    public static void datos_usuario() {
        Scanner usuario = new Scanner(System.in);
        String opcion;
        double monto;
        System.out.println("¿Quiere recargar su saldo de su tarjeta?");
        System.out.println("Si/No");
        opcion = usuario.nextLine();
        switch (opcion){
            case "Si":
                double saldo1 = 5.00;
                double saldo2 = 10.00;
                double saldo3 = 15.00;
                System.out.println("Elija sus opciones de compra");
                System.out.println("1. 5.00");
                System.out.println("2. 10.00");
                System.out.println("3. 15.00");
                opcion = usuario.nextLine();
                switch (opcion){
                    case "1":
                        monto = saldo1 * 2;
                        System.out.println("Su monto es: "+monto);
                        break;
                    case "2":
                        monto = saldo2 * 2;
                        System.out.println("Su monto es: "+monto);
                        break;
                    case "3":
                        monto = saldo3 * 2;
                        System.out.println("Su monto es: "+monto);
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }
                break;
            case "No":
                System.out.println("Gracias por visitarnos");
                break;
            default:
                System.out.println("Opción inválida");
                break;
        }
        usuario.close();
    }
}
