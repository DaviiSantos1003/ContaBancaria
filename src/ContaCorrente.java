public class ContaCorrente {

    private String titular;
    private double saldo;
    private double limite;


    public void sacar(double valor) {
        if (valor <= 0) {
            IO.println("você está sem dinheiro para poder sacar");
        } else if (valor > saldo + limite) {
            IO.println("se tá sem dinheiro");
        } else {
            saldo = saldo - valor;

            if (saldo < 0) {
                limite = limite + saldo;
                saldo = 0;
            }
        }
    }


    public String MostrarSaldo() {
        return "O saldo é: " + saldo;
    }


    public double getSaldo() {
        return saldo;
    }


    public void depositar(double valor) {
        if (valor > 0) {
            saldo = saldo + valor;
        } else {
            IO.println("para depositar o valor precisa ser maior que 0");
        }
    }


    public String getTitular() {
        return titular;
    }


    public void setTitular(String titular) {
        this.titular = titular;
    }


    public double getLimite() {
        return limite;
    }


    public void setLimite(double limite) {
        this.limite = limite;
    }


    @Override
    public String toString() {
        return "ContaCorrente{" +
                "titular='" + titular + '\'' +
                ", saldo=" + saldo +
                ", limite=" + limite +
                '}';
    }
}