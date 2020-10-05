package CursoJavaCLoiane;

public class Agenda {
	
	private Contato[] contatos;
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Contato[] getContatos() {
		return contatos;
	}

	public void setContatos(Contato[] contatos) {
		this.contatos = contatos;
	}
	 public String obterInfo() {
		 String info = "Nome " + nome + "\n";
		 
		 if(contatos != null) {
			 for(Contato c : contatos) {
				 info += c.obterInfo();
			 }
		 }
		 
		 return info;
	 }

}
