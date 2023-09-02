package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

	private List<Item> item;

	public CarrinhoDeCompra() {
		this.item = new ArrayList<>();
	}
	
	public void adicionarItem(String nome, double preco, int quantidade) {
		item.add(new Item(nome,preco,quantidade));
	}
	
	public void removerItem(String nome) {
		
		for(Item i : item) {
			if(i.getNome().equalsIgnoreCase(nome)) {
				i.setQuantidade(i.getQuantidade()-1);
			}
		}
		
	}
	
	public double calcularValorTotal() {
		double valorTotal=0.0;
		for(Item i : item) {
			valorTotal = valorTotal+i.getPreco()*i.getQuantidade();
		}
		
		return valorTotal;
	}
	
	public void exibirItens() {
		System.out.println(item);
	}
	
	public static void main(String[] args) {
		CarrinhoDeCompra item = new CarrinhoDeCompra();
		item.adicionarItem("Pão", 5.35, 5);
		item.adicionarItem("Leite", 4.40, 12);
		item.adicionarItem("Manteiga", 3.50, 10);
		
		System.out.println(item.calcularValorTotal());
		item.exibirItens();
		System.out.println("________________________");
		item.removerItem("Pão");
		item.removerItem("Pão");
		item.exibirItens();
		
	}
}

