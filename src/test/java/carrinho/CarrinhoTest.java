package carrinho;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import produto.Produto;

public class CarrinhoTest {

    Carrinho carrinho;

    @BeforeEach
    public void inicializa() {
        carrinho = new Carrinho();

        Produto p1 = new Produto("Introdução ao Teste de Software", 100.00);
        Produto p2 = new Produto("Produto 2", 200.00);
        Produto p3 = new Produto("Produto 3", 1500.00);

        carrinho.addItem(p1);
        carrinho.addItem(p2);
        carrinho.addItem(p3);
    }

    @Test
    public void testValorTotal() {
        assertEquals(1800.00, carrinho.getValorTotal());
    }

    @Test
    public void testQtdeItems() {
        assertEquals(3, carrinho.getQtdeItems());
    }

    @Test
    public void testEsvazia() {
        carrinho.esvazia();
        assertEquals(0.0, carrinho.getValorTotal());
    }
}
