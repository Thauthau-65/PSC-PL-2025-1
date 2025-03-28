public class Calculadora {
    
    public void saudacao(){

        System.out.println("Bem vindo(a) a calculadora");
    }

    public void somar( int a, int b){ //Métodos são as ações, podem ser simples ou mais complexos

        System.err.println("Soma: " + (a+b)); // Já o system é volátil, ele mostra e não armazena


    }

    public int multiplicar(int x, int y){ //Com void não quero retorno, sem void eu quero retorno

    return x * y; //o return armazena um valor

    }
}
