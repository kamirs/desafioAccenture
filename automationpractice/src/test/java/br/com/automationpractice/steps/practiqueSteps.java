package br.com.automationpractice.steps;

import static org.junit.Assert.assertEquals;

import br.com.automationpractice.Hooks;
import br.com.automationpractice.page.practiquePage;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class practiqueSteps {
	
	
//	@Dado("que eu esteja na pagina")
//	public void que_eu_esteja_na_pagina(String url) throws InterruptedException {
//		
//		practiquePage pp = new practiquePage();
//		pp.navegar();
//	}
	
	@Dado("que eu esteja na pagina {string}")
	public void que_eu_esteja_na_pagina(String url) throws InterruptedException {
		Hooks h = new Hooks();
		h.setup(url);
	}
	
	@Quando("realizo o clique em {string}")
	public void realizo_o_clique_em(String mapeamento) throws InterruptedException {
	   
		practiquePage pp = new practiquePage();
		pp.clicarElementoTitle(mapeamento);
		Thread.sleep(3000);
	}
	
	@Entao("recebo a categoria {string}")
	public void recebo_a_categoria(String Women) {
		
		practiquePage pp = new practiquePage();
		String esperada = pp.receberElemento();
		System.out.println(esperada);
		System.out.println(Women);
		assertEquals(esperada, Women);
		
		Hooks H = new Hooks();
		H.finalizar();
		
	}

}
