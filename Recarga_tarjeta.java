import java.util.Scanner; //SE IMPORTA EL SCANNER
public class Recarga_tarjeta {
    public String codigos_tarjeta() {
        Scanner usuario = new Scanner(System.in);
        int codigo;
        System.out.println("Bienvenido");

        boolean InicioSesion = false; //AQUI SE INICIA EL PROCESO
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
        return "Sesión iniciada"; //PROCEDE A REENVIAR LA FUNCION
        //EN ESTA PRIMERA PARTE SE VERIFICA AL USUARIO
    }
    public static void main(String[] args) {
        Recarga_tarjeta recargatarjeta = new Recarga_tarjeta();
        recargatarjeta.codigos_tarjeta();
        //DEFINICION DE LA CLASE Y BASE PRINCIPAL DE LO ANTES DICHO
    }

    public static void datos_usuario() {
        //AQUI SE DECLARAN LAS VARIABLES
        Scanner usuario = new Scanner(System.in);
        String opcion;
        double monto;
        double saldo1 = 5.00;
        double saldo2 = 10.00;
        double saldo3 = 15.00;
        double descuento = 0.1;
        double premio = 20.00;

        System.out.println("Veo que no tienes suficiente saldo");
        System.out.println("¿Quiere recargar su saldo de su tarjeta?");
        System.out.println("Si/No");
        opcion = usuario.nextLine();

        switch (opcion) {
            case "Si":
                System.out.println("Elija sus opciones de compra");
                System.out.println("1. 5.00");
                System.out.println("2. 10.00");
                System.out.println("3. 15.00");
                System.out.println("Recuerde que por compra se gana su 10% de descuento");

                opcion = usuario.nextLine();

                switch (opcion) {
                    //AQUI SE INICIA EL CALCULO
                    case "1":
                        monto = saldo1 * 2;
                        System.out.println("Su monto es: " + monto);
                        monto = monto * (1 - descuento);
                        System.out.println("Su monto con descuento es: " + monto);

                        if (monto > premio) {
                            System.out.println("¡Felicidades Ha superado el número de pago y ha ganado su premio.");
                        }
                        System.out.println("GRACIAS POR SU COMPRA");
                        break;
                    case "2":
                        monto = saldo2 * 2;
                        System.out.println("Su monto es: " + monto);
                        monto = monto * (1 - descuento); // Aplicar descuento
                        System.out.println("Su monto con descuento es: " + monto);

                        if (monto > premio) {
                            System.out.println("¡Felicidades Ha superado el número de pago y ha ganado su premio.");
                        }
                        System.out.println("GRACIAS POR SU COMPRA");

                        break;
                    case "3":
                        monto = saldo3 * 2;
                        System.out.println("Su monto es: " + monto);
                        monto = monto * (1 - descuento); // Aplicar descuento
                        System.out.println("Su monto con descuento es: " + monto);

                        if (monto > premio) {
                            System.out.println("¡Felicidades Ha superado el número de pago y ha ganado su premio.");
                        }
                        System.out.println("GRACIAS POR SU COMPRA");
                        break;
                    default:
                        System.out.println("Opción inválida");
                        break;
                }

                usuario.close(); //FINALIZA LA FUNCION
        }
    }
}

