package br.com.impacta.lab;

import static org.junit.Assert.assertEquals;
import br.com.impacta.models.*;

import java.util.ArrayList;
import org.junit.Test;

class JavaSpringTemplateApplicationTests {

	@Test
	public void shouldHavePFWithInterfacePessoa() {
		
  	Pessoa pf = new PessoaFisica("45875412575", "PF");
		//pf.setDocumento("45875412575");
		//pf.setTipo("PF");
		
		
		assertEquals("PF", pf.getTipo());
		
	}
	
	@Test
	public void shouldHavePJWithInterfacePessoa() {
		
		Pessoa pj = new PessoaJuridica("54309854389" , "PJ");
	//	pj.setDocumento("33293439000109");
	//	pj.setTipo("PJ");
		
		
		assertEquals("PJ", pj.getTipo());
		
	}
	
}
