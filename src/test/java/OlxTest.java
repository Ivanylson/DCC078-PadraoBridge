import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OlxTest {
    @Test
    void retornaTotalPesquisaBasicaOlx(){
        Procura procura = new ProcuraBasica();
        Olx olx = new Olx(150f);
        olx.definirPesquisa(procura);
        assertEquals(150f, olx.calcularTotal(), 0.1f);
    }

    @Test
    void retornaTotalPesquisaPremiumOlx(){
        Procura procura = new ProcuraPremium();
        Olx olx = new Olx(150f);
        olx.definirPesquisa(procura);
        assertEquals(150f, olx.calcularTotal(), 0.4f);
    }
}