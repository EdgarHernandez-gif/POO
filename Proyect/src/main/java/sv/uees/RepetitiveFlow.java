package sv.uees;
import java.util.Scanner;
public class RepetitiveFlow
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Cuantos numeros quiere ingresar?: ");
        int cantidad = sc.nextInt();

        int suma = 0;
        int i = 0;

        while (i< cantidad) {
        System.out.print("Ingrese numero: "+(i+1)+": ");
        int num = sc.nextInt();
        suma += num; // operacion de asignacion compuesto
            i++;

        }
        System.out.println("\nTotal de la suma: "+ suma);
        System.out.println("Contando hacia atras desde: "+ cantidad);
        for (int j = cantidad; j >=1;  j--){
            System.out.println(j);
        }
        sc.close();
    }
}