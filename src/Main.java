import java.util.*;

public class Main {

    //Crear mapa con los valores de Morse
    private static final Map<Character, String> mapaMorse = new HashMap<>();
    static {
        mapaMorse.put('A', ".-");
        mapaMorse.put('B', "-...");
        mapaMorse.put('C', "-.-.");
        mapaMorse.put('D', "-..");
        mapaMorse.put('E', ".");
        mapaMorse.put('F', "..-.");
        mapaMorse.put('G', "--.");
        mapaMorse.put('H', "....");
        mapaMorse.put('I', "..");
        mapaMorse.put('J', ".---");
        mapaMorse.put('K', "-.-");
        mapaMorse.put('L', ".-..");
        mapaMorse.put('M', "--");
        mapaMorse.put('N', "-.");
        mapaMorse.put('O', "---");
        mapaMorse.put('P', ".--.");
        mapaMorse.put('Q', "--.-");
        mapaMorse.put('R', ".-.");
        mapaMorse.put('S', "...");
        mapaMorse.put('T', "-");
        mapaMorse.put('U', "..-");
        mapaMorse.put('V', "...-");
        mapaMorse.put('W', ".--");
        mapaMorse.put('X', "-..-");
        mapaMorse.put('Y', "-.--");
        mapaMorse.put('Z', "--..");
    }
    private static <Char> void convertiMorse(Char ch){
        String morse = mapaMorse.get(ch);
        System.out.print(morse + " ");
    }


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("*** TRADUCTOR DE ASCII A CODIGO MORSE ***");
        System.out.println("Introducir una palabra:");
        String frase = sc.nextLine().toUpperCase();

        for (char ch : frase.toCharArray()) {
            if (!(ch == ' ')){
                convertiMorse(ch);
            } else {
                System.out.print("/");
            }
        }
    }
}
