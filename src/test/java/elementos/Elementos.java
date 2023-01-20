package elementos;

import org.openqa.selenium.By;

public class Elementos {
	
	public By btnTesteGratis = By.xpath("//span[@class='elementor-button-text']");
	public By btn14dias = By.xpath("//section[@class='elementor-section elementor-top-section elementor-element elementor-element-53133fe elementor-section-content-middle elementor-section-boxed elementor-section-height-default elementor-section-height-default']//a[@class='elementor-button-link elementor-button elementor-size-sm']");
	public By nomePrimeiro = By.xpath("//input[@id='first-wa-lead-form']");
	public By nomeSegundo = By.xpath("//input[@id='last-wa-lead-form']");
	public By empresa = By.xpath("//input[@id='company-wa-lead-form']");
	public By email = By.xpath("//input[@id='email-wa-lead-form']");
	public By telefone = By.xpath("//input[@id='phone-wa-lead-form']");
	public By btnComecar = By.xpath("//input[@class='form-wa-lead-form-submit hs-button primary large']");
	
	public By validarMsg = By.xpath("//*[text()='Cancele antes do período de avaliação acabar para evitar ser cobrado.']");
	
	
	

}
