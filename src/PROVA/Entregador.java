package PROVA;

public class Entregador extends AbsUsuario {
	Entregador(){
		this.CPF = "564";
		this.DataNascimento = "12/05/2000";
		this.Endereco = "Rui Barbosa";
		this.Nome = "Juscelino Kubitschek";
	}
	
	public void Entregar(AbsProduto produto, String EndEntrega) {
		System.out.println(produto.Nome + " coletado. A caminho do endereço: " + EndEntrega + ".");
		System.out.println(produto.Nome + " entregue.");
	}
}
