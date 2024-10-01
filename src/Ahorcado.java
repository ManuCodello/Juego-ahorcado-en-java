import java.util.Scanner;

public class Ahorcado {
    public static void main(String[] args) throws Exception {
        
        //Clase scanner que nos permite que el user escriba 
        Scanner scanner = new Scanner(System.in);

        //Declaraciones y asignaciones

        String palabrasecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        //Arreglos:
        char [] letrasAdivinadas = new char [palabrasecreta.length()];  //Esto es un arrive de chars

        // Estructura de control: tipo iterativa (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas [i] = '_'; 

        }
        
        // Estructura de control: tipo iterativa (bucle)
       while (!palabraAdivinada && intentos < intentosMaximos ) {
            System.out.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + " (" + palabrasecreta.length() + " letras)");   //String valueOf es la palabra entera
                                                        //Esto de usa cuando tenemos una palabra de chars
            System.out.println("Introduce una letra, por favor: ");

            //Usamos la clase scanner para pedir una letra 
            char letra = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            // Estructura de control: tipo iterativa (bucle)
            for (int i = 0; i < palabrasecreta.length(); i++) {
                //Estructura de control condicional
                if (palabrasecreta.charAt(i) == letra) {
                    letrasAdivinadas [i] = letra;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos ++;
                System.out.println("Incorrecto te quedan " + (intentosMaximos - intentos) + " intentos");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabrasecreta)) {
                palabraAdivinada = true;
                System.out.println("FELICIDADES, HAS ADIVINADO LA PALABRA SECRETA: " + palabrasecreta);
            }
        }
        if (!palabraAdivinada) {
            System.out.println("Que pena te haz quedado sin intentos ¡GAME OVER!");
        }
        scanner.close();
       

    }
}
