package Entidades;

public class Debito {
	private int user;
	private int CPF;
	private String name;
	private String banco;
	private int agencia;
	private int conta;
	
	
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public int getCPF() {
		return CPF;
	}
	public void setCPF(int cPF) {
		CPF = cPF;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBanco() {
		return banco;
	}
	public void setBanco(String banco) {
		this.banco = banco;
	}
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getConta() {
		return conta;
	}
	public void setConta(int conta) {
		this.conta = conta;
	}
	
}
