public class ContaBancaria {
    
    private double saldo;

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public  void depositar(double valor){

        if(valor > 0){

            saldo += valor;
            //saldo = saldo + valor

            
        }
    }

    //Encapusalamento proteger os detalhes da classe, deixar a classe mais coes e limpa, para que nenhuma outra classe tenha acesso a essa clase.
}
