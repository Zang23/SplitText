package controller;

import java.util.Scanner;

public class OperacoesController {

	public OperacoesController(){
		super();
	}
	
	public String recebeTexto() {
		Scanner dadosTexto = new Scanner(System.in);
		
		System.out.println("Insira um texto");
		String texto = dadosTexto.nextLine();
		
		return texto;
	}
	
	public int contaPalavras(String texto) {
		String[] vetorPalavras = texto.split(";");
		return vetorPalavras.length;
	}
}
