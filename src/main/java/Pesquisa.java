public abstract class Pesquisa {

    protected Procura procura;

    protected float valorTotalConta;

    public Pesquisa(float valorTotalConta){
        this.valorTotalConta = valorTotalConta;
    }

    public void definirPesquisa(Procura procura){
        this.procura = procura;
    }

    public void definirValorTotalConta(float valorTotalConta){
        this.valorTotalConta = valorTotalConta;
    }

    public abstract float calcularTotal();
}
