import java.util.HashMap;
import java.util.Scanner;
import java.io.PrintStream;
 class Actividad7 {
    public static PrintStream screen = System.out;
    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        
        HashMap<String, String> operadores = new HashMap<>();
        operadores.put("300", "Claro");
        operadores.put("310", "Movistar");
        operadores.put("321", "Tigo");
        operadores.put("350", "Virgin Mobile");
        operadores.put("360", "Uff Móvil");
        operadores.put("366", "Móvil Éxito");
        String numeroLinea = "";
        numeroLinea = keyboard.nextLine();
        
        String prefijo = numeroLinea.substring(0, 3);

        if (operadores.containsKey(prefijo)) {
            String operador = operadores.get(prefijo);
            String tipoOperador = esOperadorConRed(operador);
            String infraestructura = obtenerInfraestructuraRed(operador);

            System.out.println("Prefijo: " + prefijo);
            System.out.println("Operador: " + operador);
            System.out.println("Tipo de Operador: " + tipoOperador);
            System.out.println("Infraestructura de Red: " + infraestructura);
        } else {
            System.out.println("El prefijo no corresponde a un operador móvil conocido en Colombia.");
        }
    }

    public static String esOperadorConRed(String operador) {
        
        return "Operador Móvil con Red";
    }

  
    public static String obtenerInfraestructuraRed(String operador) {
      
        return "Infraestructura de Red de " + operador;
    }
}
