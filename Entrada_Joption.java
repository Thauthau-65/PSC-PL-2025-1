import javax.swing.JOptionPane;

public class Entrada_Joption{

    public static void main (String[] args){

        String nome = JOptionPane.showInputDialog("Digite seu nome"); //JoptionPane é uma clase

        String idade = JOptionPane.showInputDialog("Digite a sua idade");

        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura")); // showInputDialog só aceita string

        int idadeStr = Integer.parseInt(idade); // Parse faz a conversão

        JOptionPane.showMessageDialog(null, "Meu nome é " + nome + "tenho " + idadeStr + " minha altura é" + altura );
    }
}