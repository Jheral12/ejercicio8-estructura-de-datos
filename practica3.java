import java.util.Scanner;

public class practica3 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        int edad[];
        int edad_max;
        int indice;
        String nombre[];
        int tam_vector;
        edad = new int[30];
        nombre = new String[30];
        indice = 0;
        tam_vector = 30;

        do {
            System.out.println("Dime el nombre de un alumno:");
            nombre[indice] = reader.next();
            if (!nombre[indice].equals("*") ) {
                System.out.print("Dime su edad:");
                edad[indice] =reader.nextInt();
            }
            indice = indice+1;
        } while (!(nombre[indice-1].equals("*") || indice==tam_vector));
        indice = 0;

        edad_max = edad[0];
        while (indice<tam_vector && !nombre[indice].equals("*") ){
            if (edad[indice]>edad_max) {
                edad_max = edad[indice];
            }
            indice = indice+1;
        }
        // Alumnos mayores de edad
        indice = 0;
        System.out.println("Lista de alumnos mayores de edad");
        System.out.println("=======================");
        while (indice<tam_vector && !nombre[indice].equals("*")) {
            if (edad[indice]>=18) {
                System.out.println(nombre[indice]);
            }
            indice = indice+1;
        }
        // Alumnos mayores
        indice = 0;
        System.out.println("Alumno con la maxima edad ");
        System.out.println("===============");
        while (indice<tam_vector && !nombre[indice].equals("*")) {
            if (edad[indice]==edad_max) {
                System.out.println(nombre[indice]);
            }
            indice = indice+1;
        }
    }



}
