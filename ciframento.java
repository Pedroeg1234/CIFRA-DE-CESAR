import java.util.Scanner;

public class ciframento {
    public static void main(String[] args) {

        System.out.println ("Digite qual vai ser o deslocamento:");
        int deslocamento = scanner.nextInt();

        Scanner scanner = new Scanner(System.in);

        System.out.println ("Digite o texto que deseja criptografar: ");
        String frase = scanner.nextLine();
      

        String cripto = deciframento(frase, deslocamento);  

        System.out.println("String antes da criptografia: " + frase);
        System.out.println("String pós criptografia: " + cripto); 
    }

    public static String deciframento(String frase, int deslocamento) {
        StringBuilder stringDeslocada = new StringBuilder();


        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (Character.isLowerCase(c)){
            char caracterDeslocado = (char) (((c - 'a' + deslocamento) % 26) + 'a');
            stringDeslocada.append(caracterDeslocado);
            }

            else if (Character.isUpperCase(c)){
                char caracterDeslocado = (char) (((c - 'A' + deslocamento) % 26) + 'A');
            stringDeslocada.append(caracterDeslocado);
            }
            else {
                stringDeslocada.append(c);
            }
        }

        return stringDeslocada.toString();
    }
}
