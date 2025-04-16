public class Main{

    public static void main(String[] args){

        Aluno aluno = new Aluno("Thauanny", 18, 1.70, "thauthau@gmail.com", 89576425); //Criei um novo objeto, só posso passar esses atributos, porque eles herdam
        Professor professor = new Professor("Danilo", 39, 1.80, "danilo.professor@gmail.com", 789654123);

        aluno.exibirDados();
        professor.exibirDados();


    }
}