package Entidades;

public class Credito {
	private int user;
	private String NomeCarto;
	private String codigo;
	private String bandeira;
	private String dataVencimento;
	
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getNomeCarto() {
		return NomeCarto;
	}
	public void setNomeCarto(String nomeCarto) {
		NomeCarto = nomeCarto;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getBandeira() {
		return bandeira;
	}
	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}
	public String getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	
	
}
