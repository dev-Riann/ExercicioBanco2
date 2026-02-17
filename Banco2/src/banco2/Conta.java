package banco2;
public abstract class Conta {
    //Métodos Abstratos
    public abstract void mostrarSaldo();
    public abstract void mostrarDono();
    public abstract void mostrarTipo();
    public abstract void mostrarStatus();
    public abstract void mostrarConta();
    public abstract void abrirConta();
    public abstract void fecharConta();
    public abstract void depositar(float v);
    public abstract void sacar(float v);
    public abstract void pagarMensal(float v);
}
