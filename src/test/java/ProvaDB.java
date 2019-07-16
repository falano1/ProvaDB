import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvaDB {

    //    WebDriver driver;
    //
    //    public ProvaDB() {
    //        System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProvaDB\\driver\\chromedriver.exe");
    //
    //        driver = new ChromeDriver();
    //        driver.manage().window().maximize();
    //    }
    //
    //    @Test
    //    public void acessaSite() {
    //        driver.get("http://www.automationpractice.com");
    //    }

    @Test
    public void entraProduto() throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "C:\\Projetos\\ProvaDB\\driver\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.automationpractice.com");

        // Realiza o click na descrição produto
        driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/h5/a")).click();

        // Aguarda 2 segundos
        Thread.sleep(2000);

        // Realiza o click no botão de adicionar ao carrinho
        //driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

        // Aguarda 2 segundos
        //Thread.sleep(2000);

        driver.findElement(By.xpath("//*[@id=\"search_query_top\"]")).sendKeys("meu teste de escrita....");

        // Aguarda 5 segundos
        //Thread.sleep(5000);

        driver.close();
    }
}
