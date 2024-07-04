import java.util.Scanner;
public class Contador {
    public static void main(String[] args) {
        //criando scanners
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digite o primeiro parâmetro :");
        int parametro1 = terminal.nextInt();
        System.out.println("Digite o parâmetro dois :");
        int parametro2 = terminal.nextInt();

        //metodo com logica de contagem
        try{
            contar(parametro1, parametro2);

        }catch (ParametrosInvalidosException exception){
            System.out.println(exception.getMessage());
        }
        
    }
        static void contar(int parametro1, int parametro2) throws ParametrosInvalidosException {

            if (parametro1 > parametro2) throw new ParametrosInvalidosException();

            int contagem = parametro2 - parametro1;

            for (int i = 1; i<=contagem; i++){
                System.out.println(" Imprimindo o número " + i);
            } 

        } 

    }

