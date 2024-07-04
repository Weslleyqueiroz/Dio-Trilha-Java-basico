import java.util.Scanner;
public class ContaTerminal{
    public static void main(String[] args) throws Exception {
        
       
        //obter pela classe scanner os valores digitados no terminal
        //exibir a mensagem da conta criada
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do titular da conta :");
        String nomeTitular = scanner.nextLine();
        System.out.println("O titular da conta é :" + nomeTitular);


        //conhecer e implementar a classe scanner
        
        System.out.println("Digite o número da sua conta, por favor!!");
        int numeroInteiro = scanner.nextInt();
        System.out.println("O número da sua conta é : " + numeroInteiro);

        //exibir as mensagens para o usuario
        System.out.println("Digite o número da sua agência :");
        int numeroAgencia = scanner.nextInt();
        System.out.println("O número da sua agência é :" + numeroAgencia);

        System.out.println("Digite o seu saldo :");
        double contaSaldo = scanner.nextDouble();
        System.out.println("O saldo da sua conta é de :" + contaSaldo);

        System.out.println("Olá " + nomeTitular + " obrigado por criar uma conta em nosso banco ");
        System.out.println("sua agência é " + numeroAgencia +  " , conta " + numeroInteiro);
        System.out.println("e seu saldo de " + contaSaldo + " já está disponível para saque ");
        

    }
}
