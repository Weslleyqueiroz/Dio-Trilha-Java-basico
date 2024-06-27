public class TiposOperadores {
    public static void main(String[] args) throws Exception {
        //Concatenação de Strings
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        //testando concatenações diferentes
        String concatenacao = "?";
        concatenacao = 1+1+1+"1";
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+1;
        System.out.println(concatenacao);

        concatenacao = 1+"1"+1+"1";
        System.out.println(concatenacao);

        concatenacao = "1"+1+1+1;
        System.out.println(concatenacao);

        concatenacao = "1"+(1+1+1);
        System.out.println(concatenacao);

        //operadores unários
        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        //numero positivo
        numero = numero*-1;
        System.out.println(numero);

        //Incrementos (repetição) adicionar
        int numero2 =10;
        System.out.println(++numero2);

        //incremento (repetição) Reduzir
        System.out.println(--numero2);

        //Negando o boolean
        //aqui ela vai continuar True apesar de negar
        boolean variavel = true;
        System.out.println(!variavel);
        System.out.println(variavel);

        //Aqui ela vai virar false pra sempre
        variavel= !variavel;
        System.out.println(variavel);

        // Sem operador ternário (IF, else)
        int a, b;
        a = 5;
        b = 6;
        //exemplo de condicional
        String resultado =" ";
        if (a==b)
            resultado = "Resultado verdadeiro";
        else 
            resultado = "Resultado errado";
            System.out.println(resultado);

        //Com operador ternário
        //String resultado = a==b ? "verdadeiro" : "Errado";
        //System.out.println(resultado);


        //explorando o sinal de igual 
        int numero3= 1;
        int numero4 = 2;
        boolean simNao = numero3 == numero4;
        System.out.println("Numero um é igual ao numero dois?" + simNao);

        //explorando o sinal de diferente
        simNao = numero3 != numero4;
        System.out.println("Numero um é diferente do numero dois?" + simNao);

        //Operadores logicos
        boolean condicao1= true;
        boolean condicao2= false;
        if(condicao1 && condicao2){
            System.out.println("As duas condições são verdadeiras");
        }
        System.out.println("Fim");
    }
}
