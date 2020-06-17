package PROVA;

public class Teste {

	public static void main(String[] args) {	
		MaquinaProd maquina = new MaquinaProd();
		AbsProduto produto = maquina.Maquina("Carro");

		Parceiro parceiro = new Parceiro();
		parceiro.Registrar(produto);
		
		Cliente cliente = new Cliente();
		cliente.Comprar(produto);
	}

}
