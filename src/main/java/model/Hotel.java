package model;

public class Hotel {
	private int id;
	private String nome;
	private String endereco;
	private String resumo;
	private String classificacao;
	private String linkSite;
	
    public Hotel(int id, String nome, String endereco, 
                String string, String classificacao, String linkSite) {
    	this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.resumo = string;
        this.classificacao = classificacao;
        this.linkSite = linkSite;
    }

	public Hotel() {
		// TODO Auto-generated constructor stub
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getResumo() {
		return resumo;
	}

	public void setResumo(String resumo) {
		this.resumo = resumo;
	}
	public String getClassificacao() {
		return classificacao;
	}
	public void setClassificacao(String classificacao) {
		this.classificacao = classificacao;
	}
	public String getLinkSite() {
		return linkSite;
	}
	public void setLinkSite(String linkSite) {
		this.linkSite = linkSite;
	}
}