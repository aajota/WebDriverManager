package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import driver.Drivers;

public class Metodos extends Drivers {

	public void escrever(By elemento, String texto) {
		driver.findElement(elemento).sendKeys(texto);
	}

	public void clicar(By elemento) {
		driver.findElement(elemento).click();
	}

	public void submit(By elemento) {
		driver.findElement(elemento).submit();
	}

	public void pausa() {
		try {

			Thread.sleep(4000);
		} catch (Exception e) {

		}

	}

	public void validarTexto(By elemento, String msgEsperada) {
		String msgCapturada = driver.findElement(elemento).getText();
		assertEquals(msgEsperada, msgCapturada);
	}

}
