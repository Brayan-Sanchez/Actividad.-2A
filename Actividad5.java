import java.io.PrintStream;
import java.util.Scanner;
class Actividad1{
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
      double[] alt = {0,0,0};
      double aux = 0 ;
      double altmen = 0;
      double altmed = 0;
      double altmay = 0;
      System.out.println("ingrese las 3 alturas");
      alt[0] = keyboard.nextDouble();
      alt[1] = keyboard.nextDouble();
      alt[2] = keyboard.nextDouble();
      altmen = alt[0];
      altmed = alt[1];
      altmay = alt[2];
      if(altmen > altmed){
        aux = altmen;
        altmen = altmed;
        altmed = aux;
      }
      if(altmed > altmay){
        aux = altmed;
        altmed = altmay;
        altmay = aux;
      }
      if(altmen > altmed){
        aux = altmen;
        altmen = altmed;
        altmed = aux;
      }
      System.out.println(altmen + ", " + altmed + ", " + altmay);
    }
  }


        