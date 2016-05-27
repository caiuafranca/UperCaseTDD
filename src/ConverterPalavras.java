import java.util.ArrayList;
import java.util.List;

public class ConverterPalavras {
	private List<String> listadePalavras = new ArrayList<>();

	public ConverterPalavras() {

	}

	public int quantidade() {
		return listadePalavras.size();
	}

	public void adicionar(String palavra) {
		listadePalavras.add(palavra);
	}

	public void separar(String lista) {
		String cadeiadePalavras = "";
		for (int i = 0; i < lista.length(); i++) {
			char c = lista.charAt(i);
			if (Character.isUpperCase(c) && i != 0 && i != lista.length()) {
				listadePalavras.add(cadeiadePalavras.toLowerCase());
				cadeiadePalavras = "";
			}
			cadeiadePalavras = cadeiadePalavras + c;
		}
		listadePalavras.add(cadeiadePalavras.toLowerCase());

	}
}
