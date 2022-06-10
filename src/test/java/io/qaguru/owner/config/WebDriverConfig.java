package io.qaguru.owner.config;

import org.aeonbits.owner.Config;

import java.net.URL;

@Config.Sources("classpath:${env}.properties")
public interface WebDriverConfig extends Config {

    @Key("baseUrl")
    @DefaultValue("https://github.com/")
    String getBaseUrl();

    @Key("browser")
    @DefaultValue("CHROME")
    String getBrowser();

    @Key("browserVersion")
    @DefaultValue("102.0")
    String getBrowserVersion();

    @Key("remoteUrl")
    URL getRemoteUrl();

    @Key("remoteWebDriver")
    String getRemoteWebDriver();

}
