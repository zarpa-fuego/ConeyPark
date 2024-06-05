import java.time.LocalDate;
import java.time.Period;
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

    public static class datos_usuario {

        public void datosUsuario() {
            Scanner usuario = new Scanner(System.in);
            String opcion;
            int monto = 0;
            System.out.println("¿Quiere ver su saldo de su tarjeta?");
            System.out.println("Si/No");
            opcion = usuario.nextLine();
            switch (opcion){

            }
            String nombre, apellido,numerot,correo, datos;
            int año, mes, dia;
            System.out.println("Introduzca sus datos:");
            datos = usuario.nextLine();
            System.out.println("Ingrese su nombre: ");
            nombre = usuario.nextLine();
            System.out.println("Ingrese su apellido: ");
            apellido = usuario.nextLine();
            System.out.println("Ingrese su numero telefonico");
            numerot = usuario.nextLine();
            System.out.println("Ingrese su correo");
            correo = usuario.nextLine();
            System.out.println("Ingrese el día de su nacimiento (DD): ");
            dia = usuario.nextInt();
            System.out.println("Ingrese el mes de su nacimiento (MM): ");
            mes = usuario.nextInt();
            System.out.println("Ingrese el año de su nacimiento (YYYY): ");
            año = usuario.nextInt();
            LocalDate fechaNacimiento = LocalDate.of(año, mes, dia);
            LocalDate fechaActual = LocalDate.now();
            int edad = Period.between(fechaNacimiento, fechaActual).getYears();
            if (edad >= 18) {
                System.out.println("Proceda a llenar sus datos");
            } else {
                System.out.println("Lo siento, debe ser mayor de edad para ingresar.");
            }

        }
        public void main(String[] args) {
            datos_usuario datosusuario =new datos_usuario();
            datosusuario.datosUsuario();
        }
    }
}