package edgar.org;

import java.util.stream.Stream;
import java.util.Scanner;

public class javafundamentals
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad:");
        int edad = sc.nextInt();

        System.out.println("\nResultado:");
        System.out.println("Tu nombre es: "+ nombre + "y tu edad es: " + edad);

        sc.close();
    }
}
