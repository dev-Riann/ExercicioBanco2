package banco2;
public class ContaPoupanca extends Conta {
    //Atributos
    private int numConta;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    //Métodos Especiais
    public ContaPoupanca(int numConta, String dono){
        this.numConta = numConta;
        this.dono = dono;
        this.status = false;
        this.saldo = 0;
    }

    private int getNumConta() {
        return numConta;
    }

    private void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    private String getTipo() {
        return tipo;
    }

    private void setTipo(String tipo) {
        this.tipo = "Conta Poupanca";
    }

    private String getDono() {
        return dono;
    }

    private void setDono(String dono) {
        this.dono = dono;
    }

    private float getSaldo() {
        return saldo;
    }

    private void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    private boolean getStatus() {
        return status;
    }

    private void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public void mostrarSaldo() {
        System.out.println("Saldo atual: " + this.getSaldo());
    }

    @Override
    public void mostrarDono() {
        System.out.println("Dono: " + this.getDono());
    }

    @Override
    public void mostrarTipo() {
        System.out.println("Tipo: " + this.getTipo());
    }

    @Override
    public void mostrarStatus() {
        if (this.getStatus() == false) {
            System.out.println("Conta inexistente/fechada");
        } else {
            System.out.println("Conta aberta.");
        }
    }

    @Override
    public void mostrarConta() {
        System.out.println("Num conta: " + this.getNumConta());
    }

    @Override
    public void abrirConta() {
        this.setSaldo(150f);
        this.setStatus(true);
        System.out.println("Conta abrida! kkkkk");
    }

    @Override
    public void fecharConta() {
        this.setStatus(false);
        System.out.println("Conta fechada.");
    }

    @Override
    public void depositar(float v) {
      this.setSaldo(this.getSaldo() + v);
      System.out.println("Novo saldo atual: " + this.saldo);
    }

    @Override
    public void sacar(float v) {
        if (this.getStatus() == true) {
            if (v <= this.getSaldo()){
                this.setSaldo(getSaldo() - v);
                System.out.println("Saldo atua: " + this.getSaldo());
            } else {
                System.out.println("ERRO! Saldo Insuficiente");
            }
        } else {
            System.out.println("ERRO! Conta Inexistente.");
        }
    }

    @Override
    public void pagarMensal(float v) {
        v = 150;
        if (this.getStatus() == true) {
            if (this.getSaldo() >= v){
                this.setSaldo(this.getSaldo() - v);
            } else {
                System.out.println("ERRO! Saldo insuficiente");
            }
        } else {
            System.out.println("ERRO! Conta fechada/inexistente");
        }
    }
    
    
    
    
}
