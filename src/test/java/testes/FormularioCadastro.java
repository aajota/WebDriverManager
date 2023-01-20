package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import elementos.Elementos;
import executa.Executa;
import metodos.Metodos;

public class FormularioCadastro {
	Metodos metodos = new Metodos();
	Elementos elementos = new Elementos();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirnavegador(true);
	}
	@After
	public void fecharTeste() {
		Executa.fecharNavegador();
	}
	
	@Test
	public void preencherFormularioCadastro() {
	
		metodos.clicar(elementos.btnTesteGratis);
		metodos.pausa();
		metodos.clicar(elementos.btn14dias);
		metodos.escrever(elementos.nomePrimeiro, "João");
		metodos.escrever(elementos.nomeSegundo, "Silva");
		metodos.escrever(elementos.empresa, "Audacia");
		metodos.escrever(elementos.email, "audacia@gmail.com");
		metodos.escrever(elementos.telefone, "32 959451578");
		metodos.clicar(elementos.btnComecar);
		metodos.validarTexto(elementos.validarMsg, "Cancele antes do período de avaliação acabar para evitar ser cobrado.");
	}
}
