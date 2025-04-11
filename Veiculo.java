public class Veiculo { // Método sempre com letra maiúscula

    private String marca;
    private String modelo;
    private int ano;
    private double velocidadeAtual;  //Encapsulamento é proteger os etalhes de emplementação da sua classe, e nós utilizamos o private para isso
    private boolean motorLigado;
    private boolean desligarMotor;
    private double combustivel;
    private int marcha;

    public String getMarca() { //
        return marca; // o returne Ele armazena o valor, o system você imprime a mensagem e não consegue usar, ele é temporário.
                     // Usamso o return quando queremos trabalhar com esse valor, pois ele armazena
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAno() {                       
     return ano;
    }
         public void setAno(int ano) {                             //Se eu quiser pegar esse valor eu uso o GET                                         // Se eu quiser atribuir um valor eu uso o SET return ano;                         public void setAno(int ano) {
        this.ano = ano;
    }
    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }
    public void setVelocidadeAtual(double velocidadeAtual) {
        this.velocidadeAtual = velocidadeAtual;
    }
    public boolean isMotorLigado() {
        return motorLigado;
    }
    public void setMotorLigado(boolean motorLigado) {
        this.motorLigado = motorLigado;
    }
    public boolean isDesligarMotor() {
        return desligarMotor;
    }
    public void setDesligarMotor(boolean desligarMotor) {
        this.desligarMotor = desligarMotor;
    }
    public double getCombustivel() {
        return combustivel;
    }
    public void setCombustivel(double combustivel) {
        this.combustivel = combustivel;
    }
    public int getMarcha() {
        return marcha;
    }
    public void setMarcha(int marcha) {
        this.marcha = marcha;
    }
 
    public void ligarMotor(){

        if(!motorLigado){ //Esse ponto de exclamação é negação, está vendo se o motor não está ligado
            motorLigado = true;
            System.out.println("Motor ligado");
        }
            else{
                System.out.println("O motor já está ligado");
            }

        }

        public void desligarMotor(){
            if(motorLigado){
                motorLigado = false;
                System.out.println("Motor desligado");
            }
            else{
                System.out.println("O motor já está desligado");
            }

        }

        public void acelerar(double incremento){

            if(motorLigado){
                if(combustivel > 0){
                    velocidadeAtual += incremento;
                    combustivel -= incremento * 0.1; // Consome combustível proporcionalmente a aceleração
                    System.out.println("Acelerando. Velocidade atual: " +  velocidadeAtual + "km/h. Combustível restante: "+ combustivel + "litro");
                }
                else{
                System.out.println("Combustível insuficiente para acelerar.");
                }
                } else{
                    System.out.println("O motor está desligado. Ligue o motor para acelerar.");
                }
            }

            public void frear(double decremento){
                if(motorLigado){
                    if(velocidadeAtual > 0){
                        velocidadeAtual -= decremento;
                        if(velocidadeAtual < 0){
                            velocidadeAtual = 0;
                        }

                        System.out.println("Freando. Velocidade atua: " + velocidadeAtual+ "km/h");
                    }

                    else{
                        System.out.println("O veículo já está parado.");
            }
        }else{
                    System.out.println("O motor está Desligado. Ligue o motor para frear.");
                }
            }

            public void exibirInfomações(){
                System.out.println("Marca: " + marca);
                System.out.println("Modelo: " + modelo);
                System.out.println("Ano: " + ano);
                System.out.println("Velocidade Atual: " + velocidadeAtual);
                System.out.println("Seu motor está ligado?" + motorLigado);
                System.out.println("Você tem: " + combustivel + "de combustível no seu veículo.");


            }
        }

    
        
    

    



       
    


   