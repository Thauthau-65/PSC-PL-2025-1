public class Aluno extends Pessoa{ //Esse extends é a herança na prática

    // A classe filho é uma extensão da classe pai, os recursos são os atributos e métodos

    //Porque pode chamar o construtor do professor na classe aluno, só posso chamar porque aluno herda. Porque a uma herança

    private  int ra;
    private  double nota; 

    public Aluno(String nome, int idade, double altura, String email, int ra){ // São atributos obrigatórios

    super(nome, idade, altura, email);  //Construtor da classe pessoa, construtor da classe que você vai herda. Chamo a classe principal, estou herdando os atributos

    this.ra = ra;
    this.nota = 0.0;
    }

    public int getRa(){
        return ra;
    }
    
    public void setRa(int ra) {
        this.ra = ra;
    }
      public Double getNota() { 
        return nota; 
    }
    public void setNota(double nota) {
        this.nota = nota;
    }


    public void exibirDados(){
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Altura: " + getAltura());
        System.out.println("Email: " + getEmail());
        System.out.println("RA: " + ra);
        System.out.println("Nota: " + nota);

    }

    
  
    
}



//Sobrecarga é quando você consegue utilizar o mesmo método mais de uma vez

    

    //para acessar os atributos eu preciso utlizar os modificadores de acesso

    //por conta da herança, porque eu coloco o getNome direto

    //Sobrecarganão pode usar o mesmo nome, então se vc consegue usar de alguma forma o nome do método mais de uma vez, vc vai estar sobrecarregando ele.

    // Você pode fazer isso mudando a ordem do parametro, o tipo ou a quantidade

  






