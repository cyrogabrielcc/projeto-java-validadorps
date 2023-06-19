package tech.model;

import java.util.Locale;
import java.util.Scanner;

import tech.exceptions.ParametrosInvalidosException;

public class ContModel {
    private int						parametroUm;
	private int						parametroDois;

	public void getDadosFromTerminal() {
		Scanner s = new Scanner(System.in).useLocale(Locale.US);

		System.out.println("Digite o primeiro parâmetro:");
		this.parametroUm = s.nextInt();

		System.out.println("Digite o segundo parâmetro:");
		this.parametroDois = s.nextInt();

        s.close();

	}

	public void contar() throws ParametrosInvalidosException {
		if (parametroUm > parametroDois)
			throw new ParametrosInvalidosException();

		int contagem = parametroDois - parametroUm;
		for (int i = 1; i <= contagem; i++) {
			System.out.println("Imprimindo o numero " + i);
		}
	}
    
}
