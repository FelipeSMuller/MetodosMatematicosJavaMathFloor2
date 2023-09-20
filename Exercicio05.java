package MetodosMatematicos;

import javax.swing.JOptionPane;

public class Exercicio05 {

	public static void main(String[] args) {

		/*
		 * Altura da Parede: Solicite ao usuário que insira a altura de uma parede em
		 * metros com casas decimais. Use Math.floor(x) para arredondar a altura para o
		 * número inteiro mais próximo, representando os metros completos da parede.
		 */

		double alturaParede;

		while (true) {
			try {

				// Captura a entrada do usuário, armazenando em uma variavel.
				alturaParede = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite a altura da parede"));

				if (alturaParede <= 0) {
					JOptionPane.showMessageDialog(null,

							" Você não pode inserir um número zero(0) ou um número negativo \n ERRO");

				} else {
					double umaCasaDecimal = Math.floor(alturaParede) * 100 / 100;

					JOptionPane.showMessageDialog(null, " Valor da altura da parede fornecida pelo usuário = "
							+ alturaParede + " \n Valor Arredondado  = " + umaCasaDecimal);
					break;
				}

				// Faz a verificação de um bloco através do Try Catch, verificando se a entrada
				// fornecida pelo usuário, armazenada em inputUsuario é um número inteiro
			} catch (NumberFormatException e) {
				JOptionPane.showMessageDialog(null, " Você não inseriu um dado correto no campo, tente novamente");
			}

		}

	}

}
