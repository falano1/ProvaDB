import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProvaDB {

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
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();

        // Aguarda 2 segundos
        Thread.sleep(2000);

        //Verificar se o produto está no carrinho
        driver.getPageSource().contains("//*[@id=\"layer_cart\"]/div[1]/div[1]/h2");
        Thread.sleep(5000);

        //Proceder para o Chekout
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p[2]/a[1]/span")).click();
        Thread.sleep(500);

        // Criar uma Conta
        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).click();
        Thread.sleep(500);

        driver.findElement(By.xpath("//*[@id=\"email_create\"]")).sendKeys("franalano@gmail.com");
       Thread.sleep(500);

       driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();


       driver.close();
    }
}
