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

        boolean t = true;
        while (t){
            System.out.println("\nSELECCIONE UNA OPCION:");
            System.out.println("1. Traducir de alfabeto a morse: ");
            System.out.println("2. Traducir de morse a alfabeto: ");
            System.out.println("3. Salir");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    sc.nextLine();
                    System.out.println("*** TRADUCTOR DE ASCII A CODIGO MORSE ***");
                    System.out.println("Introducir una palabra/frase:");
                    String frase = sc.nextLine().toUpperCase();

                    for (char ch : frase.toCharArray()) {
                        if (!(ch == ' ')){
                            convertiMorse(ch);
                        } else {
                            System.out.print("/");
                        }
                    }
                    break;
                case 2:
                    //Codigo de jers

                case 3:
                    System.out.println("Gracias por usar mi programa");
                    t = false;
                default:
                    System.out.println("Opción no válida.");
            }
        }

        sc.close();
    }
}
