public abstract class Conta implements IMetodo{
    private static  int Agencia_padrao = 0;
    private  static int sequencial = 1;
    protected  int agencia;
    protected  int numero ;
    public double saldo;


    public Conta() {
        this.agencia = Agencia_padrao;
        this.numero = sequencial++;
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor){
       saldo -= valor;
    }
    public void depositar(double valor){
       saldo += valor;
    }
    public void transferir(double valor,Conta contadestino){
        this.sacar(valor);
        contadestino.depositar(valor);

    }

     protected void ImprimirExtratos() {
        System.out.println(String.format(" Agencia : %d" , this.agencia));
        System.out.println(String.format(" Numero : %d" , this.numero));
        System.out.println(String.format(" Saldo : %.2f" , this.saldo));
    }



}
