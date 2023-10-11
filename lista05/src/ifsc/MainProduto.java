package ifsc;

import java.util.ArrayList;

public class MainProduto {
	public static void main(String[] args) {
		Produto Suco = new Produto();
		Produto Refrigerante = new Produto();
		Produto Agua = new Produto();
		Suco.setNome("Limonada");
		Suco.setFornecedor("Tang");
		Suco.setCodBarras(123452345l);
		Suco.setPreco(4.50);
		Refrigerante.setNome("Fanta Maracujá");
		Refrigerante.setFornecedor("Fanta");
		Refrigerante.setCodBarras(654363456l);
		Refrigerante.setPreco(7.00);
		Agua.setNome("Agua Mineral");
		Agua.setFornecedor("Gatorade");
		Agua.setCodBarras(6516516513213l);
		Agua.setPreco(2.75);
		
		ArrayList<Produto> lista = new ArrayList<>(3);
		lista.add(Suco);
		lista.add(Refrigerante);
		lista.add(Agua);
		for (Produto produto : lista) {
			System.out.println("Nome: " + produto.getNome());
			System.out.println("Fornecedor: " + produto.getFornecedor());
			System.out.println("Codigo de Barras: " + produto.getCodBarras());
			System.out.println("Preço: " + produto.getPreco());
			System.out.println("");
		}
	}
}
