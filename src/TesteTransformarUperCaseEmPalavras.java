import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TesteTransformarUperCaseEmPalavras {
	private ConverterPalavras converter;
	
	@Before
	public void inicializar() {
		converter = new ConverterPalavras();
	}

	@Test
	public void testeListaPalavrasVazia() {
		ConverterPalavras converter = new ConverterPalavras();
		assertEquals(0, converter.quantidade());
	}

	@Test
	public void testeAdicionarPalavras() {
		converter.adicionar("PrimeiroNome");
		converter.adicionar("SegundoNome");
		assertEquals(2, converter.quantidade());
	}
	
	@Test
	public void separarPalavraEmPalavras(){
		converter.separar("CaiuaGomesFrancaCasa");
		assertEquals(4, converter.quantidade());
	}
}
