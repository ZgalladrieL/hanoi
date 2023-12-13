import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TorreHanoiTeste {
    @Test
    public void testResolverTorreHanoi() {
        TorreHanoi torreHanoi = new TorreHanoi();

        int teste = torreHanoi.resolverTorreHanoi(3);
        assertEquals(7, teste);

    }

    @Test
    public void testResolverTorreHanoi2() {
        TorreHanoi torreHanoi = new TorreHanoi();

        int teste = torreHanoi.resolverTorreHanoi(-4);
        assertEquals(15, teste);

        try {
            torreHanoi.resolverTorreHanoi(-3);
        } catch (IllegalArgumentException e) {
            assertEquals("Número de discos não pode ser negativo", e.getMessage());
        }

    }

}
