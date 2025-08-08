package view;

import controller.OperacoesController;
import java.util.Scanner;

public class Principal {
	
	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		OperacoesController op = new OperacoesController();

		
		int opc = 0;
		
		while(opc != 9) {
			System.out.println("1- NOVO TEXTO\n9- SAIR");
			opc = dados.nextInt();
			dados.nextLine();
			
			switch(opc) {
				case 1:
					String texto = op.recebeTexto(dados);
					int nPalavras = op.contaPalavras(texto);
					System.out.println("O numero de palavras é: " + nPalavras);
					break;
				case 9:
					System.out.println("FIM");
					break;
				default:
					System.out.println("Digite uma opção válida");
			}
		}
		dados.close();
	}
	
	
	
}


