import java.util.Scanner;

public class Controledefluxo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro parâmetro: ");
        int parametro1 = scanner.nextInt();

        System.out.print("Digite o segundo parâmetro (deve ser maior que o primeiro): ");
        int parametro2 = scanner.nextInt();

        try {
        
            if (parametro2 <= parametro1) {
                throw new IllegalArgumentException("O segundo parâmetro deve ser maior que o primeiro.");
            }

            
            int diferenca = parametro2 - parametro1;

            System.out.println("Executando loop for com a diferença entre os parâmetros:");

            for (int i = 0; i < diferenca; i++) {
                System.out.println("Iteração " + (i + 1));
            }
        } catch (IllegalArgumentException e) {
            
            System.out.println("Erro: " + e.getMessage());
        } finally {
            
            scanner.close();
        }
    }
}



