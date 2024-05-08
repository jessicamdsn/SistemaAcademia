package br.com.sistemaAcademia.view;

import javax.swing.JOptionPane;

public class LoginScreem {
	
	public void showScreen() {
		
		String login = JOptionPane.showInputDialog("Digite o seu login");
		System.out.println("Usuario: " + login);
		
	}

}
