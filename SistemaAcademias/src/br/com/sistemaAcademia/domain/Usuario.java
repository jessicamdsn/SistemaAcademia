package br.com.sistemaAcademia.domain;

import java.util.Date;

public class Usuario {
	
	String login;
	
	String senha;
	
	String tipo; // adm - cliente - instrut

	String nome;
	
	String email;
	
	String telefone;
	
	String cpf;
	
	Date dataNascimento;
	
	boolean isHabilitado;
	
	boolean comAcesso;

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) throws Exception {
		if(cpf.length() != 14) {
			throw new Exception("CPF inválido");
		}
		this.cpf = cpf;
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	

	public boolean isHabilitado() {
		return isHabilitado;
	}

	public void setHabilitado(boolean isHabilitado) {
		this.isHabilitado = isHabilitado;
	}

	public boolean isComAcesso() {
		return comAcesso;
	}

	public void setComAcesso(boolean comAcesso) {
		this.comAcesso = comAcesso;
	}

	@Override
	public String toString() {
		return "Usuario [login=" + login + ", senha=" + senha + ", tipo=" + tipo + ", nome=" + nome + ", email=" + email
				+ ", telefone=" + telefone + ", cpf=" + cpf + ", dataNascimento=" + dataNascimento + ", isHabilitado="
				+ isHabilitado + ", comAcesso=" + comAcesso + "]";
	}

	
	
	
	
	
}
