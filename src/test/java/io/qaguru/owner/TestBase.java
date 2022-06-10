package io.qaguru.owner;

import com.codeborne.selenide.Configuration;
import io.qaguru.owner.config.WebDriverConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.BeforeAll;

import java.util.Objects;

import static com.codeborne.selenide.Selenide.open;

public class TestBase {

    @BeforeAll
    public static void beforeTest() {
        WebDriverConfig webDriverConfig = ConfigFactory.create(WebDriverConfig.class, System.getProperties());

        Configuration.browser = webDriverConfig.getBrowser();
        Configuration.browserVersion = webDriverConfig.getBrowserVersion();
        if (!webDriverConfig.getRemoteWebDriver().equals("")) {
            Configuration.remote = webDriverConfig.getRemoteWebDriver();
        }
        String baseUrlString = System.getProperty("baseUrl");
        if (Objects.isNull(baseUrlString)) {
            baseUrlString = "https://github.com/";
        }
        open(baseUrlString);
    }
}
