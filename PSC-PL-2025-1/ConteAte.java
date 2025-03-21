import java.util.Scanner;

public class ConteAte {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // O que permite que o usuário entre com a informação

        System.out.println("Digite um número");

        int n = sc.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(n * i);

        }



    }
}
