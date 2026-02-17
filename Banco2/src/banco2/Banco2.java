package banco2;
public class Banco2 {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(2222, "Rian");
        ContaPoupanca cp = new ContaPoupanca(3333, "Julinha");
        cp.mostrarStatus();
        cp.abrirConta();
        cp.mostrarSaldo();
        cp.fecharConta();
        cp.mostrarStatus();
    }
    
}
