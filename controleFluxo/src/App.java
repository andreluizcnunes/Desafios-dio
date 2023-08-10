import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

            System.out.println("Digite o primeiro parâmetro");
            int parametro1 = sc.nextInt();

            System.out.println("Digite o segundo parâmetro");
            int parametro2 = sc.nextInt();
            
            try {

                contando(parametro1, parametro2);
                
            } catch (ParametrosInvalidosException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        sc.close();
    }

    static void contando(int paramentroFirst, int paramentroLast) throws ParametrosInvalidosException{

        if (paramentroLast <= paramentroFirst) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro.");
        }

            int n = paramentroLast - paramentroFirst;

            for(int i = 1; i < n; i++){
                System.out.println("Imprimindo o número " + i);
            }
    }

    public static class ParametrosInvalidosException extends Exception {
        public ParametrosInvalidosException(String message) {
            super(message);
        }
    }
}
