package modDojava;

import javax.swing.JOptionPane;

public class ModoJava {

	public static void main(String[] args) {
		/* Modolo resto da divis�o */

		String carros = JOptionPane.showInputDialog("Informe a quantidade de carros");
		String pessoas = JOptionPane.showInputDialog("Informe a quantidade de pessoas");
		double carroNumero = Double.parseDouble(carros);
		double pessoaNumero = Double.parseDouble(pessoas);
		int divisao = (int) (carroNumero / pessoaNumero);
		
		double resto = carroNumero % pessoaNumero;
		JOptionPane.showMessageDialog(null, "Divisao para pessoas deu " + divisao + " carros e sobrou " + resto +" carros");



	}
}