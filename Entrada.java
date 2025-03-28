import java.util.Scanner;


public interface Entrada{

    public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Digite sua idade");        

    int idade = sc.nextInt();

    sc.nextLine();

    System.out.println("Digite o seu nome");

    String nome = sc.nextLine();

    System.out.println("Olá " + nome + " sua idade é " + idade );

    sc.close();





        
    }

}