import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;

public class BaseTest {

    protected WebDriver driver;  // extend edilen parent class varsa protected kullanilir...
                                // If the extended parent class exists, protected is used

    @BeforeAll
    public static void setUp() {
        System.out.println("Setup method initiated");

    }

    @AfterAll
    public static void tearDown() {
        System.out.println("Test finished");
    }
}
