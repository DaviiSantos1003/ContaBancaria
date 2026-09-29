void main() {
    ContaCorrente cc = new ContaCorrente();

    cc.setTitular("Davi");
    cc.setLimite(50000);

    cc.depositar(10000);
    cc.sacar(5000);

    IO.println(cc.MostrarSaldo());
    IO.println("Saldo pelo getSaldo: " + cc.getSaldo());
}