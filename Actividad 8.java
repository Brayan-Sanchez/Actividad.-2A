import java.io.PrintStream;
import java.util.Scanner;

class Actividad1{
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
      
String date0fBirth = ""; 
String birthday = ""; 
int birthdayInt = 0; 
String zodiacSign = ""; 

System.out.println("Ingrese una fecha de nacimiento en formato AAMA-MI-0D:");
date0fBirth = keyboard.nextLine();
birthday = date0fBirth.substring(5,7) + date0fBirth.substring(8,10);
birthdayInt = Integer.parseInt (birthday);
if ((birthdayInt >= 120 && birthdayInt <= 131) || (birthdayInt >= 201 && birthdayInt <= 218))
zodiacSign = "Acuario";
else if ((birthdayInt >= 219 && birthdayInt <= 229) || (birthdayInt >= 301 && birthdayInt <= 320))
zodiacSign = "Piscis";
if (!zodiacSign. isEmpty())
System.out.println("Su signo del zodiaco es " + zodiacSign);
else
System.out.println("No se pudo determinar su signo del zodiaco");
    }
}