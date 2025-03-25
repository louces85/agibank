package br.com.agibank;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;

public class App {
	public WebDriver driver;

	public App() {
		iniciarDriver();
	}

	public void iniciarDriver() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}

	public void acessarSite(String url) {
		driver.get(url);
	}

	public String getNameSite() {
		return driver.getTitle();
	}

	public Boolean campoPesquisa(String campoId, String texto) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		WebElement searchButton = wait.until(ExpectedConditions.elementToBeClickable(
				By.xpath("/html/body/div[1]/header/div[1]/div/div/div/div/div[3]/div[2]/div/div/a/span[1]")));
		((JavascriptExecutor) driver).executeScript("arguments[0].click();", searchButton);
		WebElement campo = driver.findElement(By.id(campoId));
		campo.sendKeys(texto);
		campo.sendKeys(Keys.ENTER);

		WebElement textoSpan = driver.findElement(By.xpath(
				"//h1[@class='page-title ast-archive-title' and contains(text(), 'Resultados encontrados para:')]/span"));
		String textoDentroDoSpan = textoSpan.getText();
		return textoDentroDoSpan.equals(texto);

	}


	public void clicarBotaoPesquisa(String botaoId) {
		WebElement botao = driver.findElement(By.id(botaoId));
		botao.click();
	}

	public void fecharNavegador() {
		if (driver != null) {
			driver.close();
			driver = null;
		}
	}

}
