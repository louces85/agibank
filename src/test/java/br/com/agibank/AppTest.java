package br.com.agibank;

import org.junit.jupiter.api.*;
import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {

	static App agibank = new App();

	@BeforeAll
	static void setupClass() {
		agibank.iniciarDriver();
	}

	@Test
	public void testAcessarAgibank() {
		agibank.acessarSite("https://blog.agibank.com.br/");
		assertEquals("Agi Blog | Tudo sobre empréstimo e educação financeira", agibank.getNameSite());
	}

	@Test
	public void testPesquisar() {
		agibank.acessarSite("https://blog.agibank.com.br/");

		Boolean flag = agibank.campoPesquisa("search-field", "Últimas do Blog do Agi");
		Boolean flag_esperada = true;
		assertEquals(flag, flag_esperada);
	}

	@AfterAll
	void teardown() {
		agibank.fecharNavegador();
	}
}
