package br.com.impacta.lab;

import br.com.impacta.models.*;

public class JavaSpringTemplateApplication {

	public static void main(String[] args) {
		/*
		 * Crie duas classes diferentes no mesmo pacote:
		 * 
		 * 1-
		 * PessoaFisica
		 * Atributo			tipo do atributo
		 * documento		String
		 * tipo				String
		 * 
		 * 2-
		 * PessoaJuridica
		 * Atributo			tipo do atributo
		 * documento		String
		 * tipo				String
		 * 
		 * Faça as duas classes implementarem a interface Pessoa
		 * para poder implementarem os metodos:
		 * 
		 	public String falarDocumento();
			public String getTipo();
		 * 
		 * 
		 * 
		 * 
		 */
		
		Pessoa pf = new PessoaFisica("45875412575", "PF");
		//pf.setDocumento("45875412575");
		//pf.setTipo("PF");
		
		Pessoa pj = new PessoaJuridica("54309854389" , "PJ");
		//pj.setDocumento("54309854389");
		//pj.setTipo("PJ");

		System.out.println("Primeira pessoa: "+ pf.falarDocumento());
		System.out.println("Primeira pessoa: "+ pf.getTipo());

    System.out.println("Segunda pessoa: "+ pj.falarDocumento());
		System.out.println("Segunda pessoa: "+ pj.getTipo());
	}

}
