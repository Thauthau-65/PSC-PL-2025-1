import javax.swing.JOptionPane;

public class IfEncadeado {
    
        public static void main(String[] args){

        double a1;

        double a2;

        double a3;

        double soma;

        a1 = 22;
        
        a2 = 15;
        
        a3 = 40;

        soma = (a1 + a2+ a3);

        if(soma >= 70){

            System.out.println("Aprovado");
        }

        else if (soma > 60){

            System.out.println("Recuperação");
        }

        else{

            System.out.println("Reprovado");
        }



}


}