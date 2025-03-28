public class Main {

    

    public static void main(String[] args) {

        //Orientação a objeto se baseia no objeto, a ideia é criar um conjunto e reaproveitar esse conjunto. Se eu quiser criar uma nova pessoa, eu vou estar instanciando a classe pessoa
        
        Pessoa p1 = new Pessoa();  // O objeto vai ser criado a partir da classe pessoa. Isso é uma instancia da classe pessoa

        p1.nome = "Danilo";

        p1. idade = 39;

        p1.apresentar(); //Porque o metodo apresentar foi definido para aprsentar as iformações.

        //Só executa a classe main, ela olha para a classe pessoa vê os atributos e executa eles.

        // A classe pessoa só realiza o que foi pedido


        ContaBancaria cb = new ContaBancaria();

        //Modificadores de acesso get e setters
        
        cb.setSaldo(0);
        
        System.out.println(cb.getSaldo());
    }
}
