package PROVA;

public class MaquinaProd {
	public AbsProduto Maquina(String tipo) {
		AbsProduto produto = null;
		switch (tipo) {
		case "Carro":
			Carro carro = new Carro();
			produto = carro;
			break;

		default:
			throw new IllegalArgumentException("Produto " + tipo + " n�o encontrado.");
		}
		
		return produto;
	}
}
