import java.io.PrintStream;
import java.util.Scanner;

class Actividad2{
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args){
        int num = 0;
        screen.println("ingrese un numero entero");
        num = keyboard.nextInt();
        if(num>0){
        System.out.println(" el " + num + " es positivo");
        }else{
            if(num==0){
                System.out.println(" el " + num + " es 0 ");
            }else{
                System.out.println(" el " + num + " es negativo");
            }
        }
    }
}