package executa;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import driver.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends Drivers{
	
	public static void abrirnavegador(boolean headless) {
		String ambiente = "https://rockcontent.com/br/blog/google-forms/";
		
		WebDriverManager.chromedriver().setup();
		ChromeOptions chromeOptions = new ChromeOptions();
		
		if(!headless) {
			chromeOptions.addArguments("--headles");
			
		}
		chromeOptions.addArguments("--start-maximized");
		driver = new ChromeDriver(chromeOptions);
		driver.get(ambiente);
		
	}
	
	public static void fecharNavegador() {
		driver.quit();
	}

}
