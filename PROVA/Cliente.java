package PROVA;

public class Cliente extends AbsUsuario {
	Cliente(){
		this.CPF = "888";
		this.DataNascimento = "31/12/1997";
		this.Endereco = "Rua Josevaldo dos Santos, 666";
		this.Nome = "Lukas da Quebrada";
	}
	
	public void Comprar(AbsProduto produto) {
		System.out.println("Pedido efetuado.");
		System.out.println("Produto: " +produto.Nome + ".");
		
		Parceiro parceiro = new Parceiro();
		parceiro.Pedido(produto);
		
		Entregador entregador = new Entregador();
		entregador.Entregar(produto, this.Endereco);
		
	}
}
