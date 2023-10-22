import java.io.PrintStream;
import java.util.Scanner;

class Actividad1{
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        long llanta = 120000;
        long descuento = 108000;
        long total = 0;
        long llantas = 0;
        screen.println("ingrese la cantidad de llantas compradas");
        llantas = keyboard.nextInt();
        total  = llantas*llanta;
        if(llantas>=4){
            total = total-descuento*llantas;
            System.out.println("el valor final es " + total );
        }else{
            System.out.println("el valor total es " + total);
        }
    }
}