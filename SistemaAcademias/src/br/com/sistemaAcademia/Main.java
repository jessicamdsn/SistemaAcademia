package br.com.sistemaAcademia;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import br.com.sistemaAcademia.domain.Cliente;
import br.com.sistemaAcademia.domain.Instrutor;
import br.com.sistemaAcademia.domain.Treino;
import br.com.sistemaAcademia.domain.Usuario;
import br.com.sistemaAcademia.view.LoginScreem;

public class Main {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Sistema de Academias - ON");
		
		LoginScreem app = new LoginScreem();
		app.showScreen();
		
		///
		
		
		
		
		Usuario user1 = new Usuario();
		user1.setNome("Fulano de tal");
		user1.setLogin("fulano");
		user1.setTipo("CLIENTE");
		user1.setCpf("111.111.111-11");
		
		Cliente cliente1 = new Cliente();
		cliente1.setObsSaude("Precisa de acompanhamento. Fez cirurgia de quadril.");
		cliente1.setPcd(false);		
		cliente1.setUser(user1);
		
		

		Usuario user2 = new Usuario();
		user2.setNome("Fulano de tal");
		user2.setLogin("Cicrano");
		user2.setTipo("INSTRUTOR");
		user2.setCpf("111.111.111-12");
		
		Instrutor inst1 = new Instrutor();
		inst1.setUser(user2);
		
		Date hoje = new Date();
		Date ate = new Date();
		ate.setMonth( hoje.getMonth() + 2);
		
		Treino treino1 = new Treino();
		treino1.setDataCriacao( hoje );
		treino1.setDataValidade( ate );
		
		treino1.setResponsavel(inst1);
		treino1.setCliente(cliente1);
		
		treino1.setTipoTreino("AB");
		
		List<String> exercicios = new ArrayList<String>();
		
		exercicios.add("(Agachamento, 3 x 10 repetições, 20kg, A)");
		exercicios.add("(Terra, 3 x 10 repetições, 20kg, A)");
		exercicios.add("(Flexora, 3 x 10 repetições, 20kg, A)");
		exercicios.add("(Extensora, 3 x 10 repetições, 20kg, A)");
		
		
		exercicios.add("(Supino reto, 3 x 10 repetições, 20kg, B)");
		exercicios.add("(Supino enclinado, 3 x 10 repetições, 20kg, B)");
		exercicios.add("(Puxada alta, 3 x 10 repetições, 20kg, B)");
		exercicios.add("(Puxada horizontal, 3 x 10 repetições, 20kg, B)");
		
		
		
		
		treino1.setExercicios( exercicios );
		
		
		
		
		
		
		
		
		System.out.println( cliente1.getUser() );
		System.out.println( treino1 );
		System.out.println( inst1.getUser() );
		
	}

}
