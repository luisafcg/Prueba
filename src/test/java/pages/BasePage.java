package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebElement;

public class BasePage {

    protected static WebDriver driver;
    private static WebDriverWait wait;

     public static void main(String[] args) {     
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\luiyi\\OneDrive\\Escritorio\\Automation\\chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        driver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        wait = new WebDriverWait(driver, 10);
    }

    public static void navigateTo(String url) {
        driver.get(url);
    }

    private WebElement findId(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.id(locator)));
    }

    private WebElement findName(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.name(locator)));
    }

    private WebElement findXpath(String locator) {
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(locator)));
    }

    public void clicElementoPorId(String locator){
        findId(locator).click();
    }

    public void clicElementoPorName(String locator){
        findName(locator).click();
    }

    public void clicElementoPorXpath(String locator){
        findXpath(locator).click();
    }

    public void ingresarValorPorName(String locator, String texto){
        findName(locator).clear();
        findName(locator).sendKeys(texto);
    }

    public void validarVisualizacionElementoPorId(String locator){
        findId(locator).isEnabled();
    }
  
}
