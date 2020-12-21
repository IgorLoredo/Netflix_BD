package Entidades;

public class Usuario {
	private String name;
	private String cpf;
	private String email;
	private String  dataNasci;
	
	public Usuario(String name,String cpf, String email, String dataNasci) {
		this.name = name;
		this.cpf = cpf;
		this.email = email;
		this.dataNasci = dataNasci;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCpf() {
		return this.cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDataNasci() {
		return dataNasci;
	}
	public void setDataNasci(String dataNasci) {
		this.dataNasci = dataNasci;
	}
	
	
}
