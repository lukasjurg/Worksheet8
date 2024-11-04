import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PublicUrlTest {
    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        // Inicializa o ChromeDriver
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void testJsonPlaceholderHomePageTitle() {
        // Acessa a página principal do JSONPlaceholder
        driver.get("https://jsonplaceholder.typicode.com/");

        // Verifica se o título da página está correto
        String expectedTitle = "JSONPlaceholder - Free Fake REST API";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle, "O título da página não está correto.");
    }

    @AfterEach
    public void tearDown() {
        // Fecha o navegador
        if (driver != null) {
            driver.quit();
        }
    }
}
