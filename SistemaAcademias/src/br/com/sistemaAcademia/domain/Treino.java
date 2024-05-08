package br.com.sistemaAcademia.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Treino {
	
	List<String> exercicios = new ArrayList<String>();
	
	Date dataCriacao;
	
	Date dataValidade;
	
	String tipoTreino; // A - B
	
	Instrutor responsavel;
	
	Cliente cliente;

	public List<String> getExercicios() {
		return exercicios;
	}

	public void setExercicios(List<String> exercicios) {
		this.exercicios = exercicios;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Date getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(Date dataValidade) {
		this.dataValidade = dataValidade;
	}

	public String getTipoTreino() {
		return tipoTreino;
	}

	public void setTipoTreino(String tipoTreino) {
		this.tipoTreino = tipoTreino;
	}

	public Instrutor getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Instrutor responsavel) {
		this.responsavel = responsavel;
	}
	
	

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		
		String exer = "";
		
		for (String e : exercicios) {
			exer += e + "\n";	
		}
		
		String retorno =  "Treino [exercicios:" + exer +"dataCriacao=" + dataCriacao + ", dataValidade=" + dataValidade
				+ ", tipoTreino=" + tipoTreino + ", responsavel=" + responsavel + "]";
		
		return retorno;
	}
	
	
	

}
