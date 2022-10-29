public class MercadoLivre extends Pesquisa {

    public MercadoLivre(float valorTotalConta){
        super(valorTotalConta);
    }

    public float calcularTotal(){
        return this.valorTotalConta;
    }
}
