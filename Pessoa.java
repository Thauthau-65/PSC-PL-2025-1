public class Pessoa{

   private String nome; // Só essa classe acessa os atributos
   private int idade;
   private double altura; 
   private String email;

   public String getNome() { //
        return nome; 
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setModelo(int idade) {
        this.idade =idade;
    }
    public double getAltura() {                       
     return altura;
    }
        public void setAltura(double altura) {                                                                                         
        this.altura = altura;
    }
    public String getEmail() {
        return email;
    }
         public void setEmail(String email) {                                                                                         
        this.email = email;
    }
 


   // Construtor incializar o objeto, quando eu criar o objeto pessoa eu tenho um construtor declarado ou não declarado. Esse pessoa depois do new é o construtor. Estou assumindo que esse objeto vai ter valores

    public Pessoa(String nome, int idade, double altura, String email){ // Constrtutor da classe com parametros
        this.nome = nome;
        this.email =  email;
        this.altura = altura; //This é contetxo, ele diz "é isso aqui", ele faz referência aos atributos da classe. Diferencia parametros de atributos da classe. Ele pega o contexto da classe
        this.email = email;
    }
}