import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MercadoLivreTest {
    @Test
    void retornaTotalPesquisaBasicaMercadoLivre(){
        Procura procura = new ProcuraBasica();
        MercadoLivre mercadoLivre = new MercadoLivre(150f);
        mercadoLivre.definirPesquisa(procura);
        assertEquals(150f, mercadoLivre.calcularTotal(), 0.1f);
    }

    @Test
    void retornaTotalPesquisaPremiumMercadoLivre(){
        Procura procura = new ProcuraPremium();
        MercadoLivre mercadoLivre = new MercadoLivre(150f);
        mercadoLivre.definirPesquisa(procura);
        assertEquals(150f, mercadoLivre.calcularTotal(), 0.4f);
    }
}