public class ContaTerminal {
    private int numeroConta;
    private String agencia;
    private String nomeCliente;
    private double saldo;
 
    public ContaTerminal(int numeroConta, String agencia, String nomeCliente) {   
            this.numeroConta = numeroConta;
            this.agencia = agencia;
            this.saldo = 500;

            if(nomeCliente == null || nomeCliente.trim().isEmpty()){
                throw new IllegalArgumentException("O nome do cliente não pode ser nulo ou vazio.");
            }
            this.nomeCliente = nomeCliente; 

        }
   
    @Override
    public String toString() {
        return "Olá " + this.nomeCliente + ", Obrigado por criar uma conta em nosso banco, sua agência é " + this.agencia + " conta " + this.numeroConta + " e seu saldo de R$" + this.saldo + " já está disponível para saque.";
    }

    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }
    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    
}
