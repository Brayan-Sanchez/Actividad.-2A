import java.io.PrintStream;
import java.util.Scanner;

class Actividad1 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        double[] alturas = new double[4];
        double aux = 0;
        System.out.println("Ingrese las alturas de 4 personas:");
        alturas[0] = keyboard.nextDouble();
        alturas[1] = keyboard.nextDouble();
        alturas[2] = keyboard.nextDouble();
        alturas[3] = keyboard.nextDouble();

        if (alturas[0] > alturas[1]) {
            aux = alturas[0];
            alturas[0] = alturas[1];
            alturas[1] = aux;
        }
        if (alturas[1] > alturas[2]) {
            aux = alturas[1];
            alturas[1] = alturas[2];
            alturas[2] = aux;
        }
        if (alturas[2] > alturas[3]) {
            aux = alturas[2];
            alturas[2] = alturas[3];
            alturas[3] = aux;
        }

        if (alturas[0] > alturas[1]) {
            aux = alturas[0];
            alturas[0] = alturas[1];
            alturas[1] = aux;
        }
        if (alturas[1] > alturas[2]) {
            aux = alturas[1];
            alturas[1] = alturas[2];
            alturas[2] = aux;
        }

        System.out.println("Alturas ordenadas.");
        for (int i = 0; i < 4; i++) {
            System.out.println("Persona " + (i + 1) + ": " + alturas[i]);
        }
    }
}




        

    
 