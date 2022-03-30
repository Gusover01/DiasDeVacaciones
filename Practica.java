import java.util.Scanner;

public class Practica {
    public static void main(String[] args) {

                String nombre = "";
        int clave = 0, tiempo = 0;
        Scanner datos = new Scanner(System.in);

        System.out.println("¿Cuál es tu nombre? ");
        nombre = datos.nextLine();
        System.out.println("¿A cuál departamento perteneces? (1, 2 o 3)");
        System.out.println("\t( 1 ) Atención al cliente. \n\t( 2 ) Logística. \n\t( 3 ) Gerencia.");
        clave = datos.nextInt();
        System.out.println("¿Cuántos meses llevas laborando en el Corporativo?");
        tiempo = datos.nextInt();

        int meses = (tiempo % 12);
        int year =  tiempo / 12;

        if((clave == 1 || clave == 2 || clave == 3) && tiempo<12){
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Aún no tienes días de vacaciones disponibles.");
        } else if (clave == 1 && tiempo >= 12 && tiempo < 24) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 7 días de vacaciones disponibles.");
        } else if (clave == 1 && tiempo >= 24 && tiempo < 84) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 14 días de vacaciones disponibles.");
        } else if (clave == 1 && tiempo >= 84) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 20 días de vacaciones disponibles.");
        } else if(clave == 2 && tiempo >= 12 && tiempo < 24){
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 7 días de vacaciones disponibles.");
        } else if (clave == 2 && tiempo >= 24 && tiempo < 84) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 15 días de vacaciones disponibles.");
        } else if (clave == 2 && tiempo >= 72) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 22 días de vacaciones disponibles.");
        } else if(clave == 3 && tiempo >= 12 && tiempo < 24){
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 10 días de vacaciones disponibles.");
        } else if (clave == 3 && tiempo >= 24 && tiempo < 84) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 20 días de vacaciones disponibles.");
        } else if (clave == 3 && tiempo >= 84) {
            System.out.println("Cuentas con " + year + " año(s), " + meses + " meses.");
            System.out.println(nombre + ", Cuentas con 30 días de vacaciones disponibles.");
        }
        else {
            System.out.println("\t¡Error! El valor ingresado es inválido.");
        }
    }
}



