package com.cloud.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.net.URL;
import java.time.Duration;

public class Driver {

    // with Selenium Grid execution and no parallel browsers ("remote-chrome" is specified in Maven-SGrid runner):

    static String browser;

    private Driver(){}

    private static WebDriver driver;

    public static WebDriver getDriver(){

        if (driver == null) {
            if (System.getProperty("BROWSER") == null) {
                browser = ConfigurationReader.getProperty("browser");
            } else {
                browser = System.getProperty("BROWSER");
            }
            System.out.println("Browser: " + browser);
            switch (browser) {
                case "remote-chrome":
                    try {
                        // assign your grid server address
                        String gridAddress = "34.228.156.78";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("chrome");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "remote-firefox":
                    try {
                        // assign your grid server address
                        String gridAddress = "174.129.57.20";
                        URL url = new URL("http://" + gridAddress + ":4444/wd/hub");
                        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
                        desiredCapabilities.setBrowserName("firefox");
                        driver = new RemoteWebDriver(url, desiredCapabilities);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "chrome-headless":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver(new ChromeOptions().setHeadless(true));
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "firefox-headless":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver(new FirefoxOptions().setHeadless(true));
                    break;

                case "ie":
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;

                case "edge":
                    if (System.getProperty("os.name").toLowerCase().contains("mac")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;

                case "safari":
                    if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                        throw new WebDriverException("Your operating system does not support the requested browser");
                    }
                    WebDriverManager.getInstance(SafariDriver.class).setup();
                    driver = new SafariDriver();
                    break;
            }
        }

        return driver;
    }

    public static void closeDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }

}




// with local execution and parallel browsers:

//public class Driver {
//
//    //create a private constructor to remove access to this object
//    private Driver(){}
//
//    /*
//    We make the WebDriver private, because we want to close access from outside the class.
//    We are making it static, because we will use it in a static method.
//     */
//    //private static WebDriver driver; // default value = null
//
//    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();
//
//    /*
//    Create a re-usable utility method which will return the same driver instance once we call it.
//    - If an instance doesn't exist, it will create first, and then it will always return same instance.
//     */
//    public static WebDriver getDriver(){
//
//        if(driverPool.get() == null){
//
//            /*
//            We will read our browserType from configuration.properties file.
//            This way, we can control which browser is opened from outside our code.
//             */
//            String browserType = ConfigurationReader.getProperty("browser");
//
//            /*
//            Depending on the browserType returned from the configuration.properties
//            switch statement will determine the "case", and open the matching browser.
//             */
//            switch (browserType){
//                case "chrome":
//                    ChromeOptions options = new ChromeOptions();
//                    options.addArguments("--remote-allow-origins=*");
//                    driverPool.set(new ChromeDriver(options));
//                    //WebDriverManager.chromedriver().setup();
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                    break;
//                case "firefox":
//                    //WebDriverManager.firefoxdriver().setup();
//                    driverPool.set(new FirefoxDriver());
//                    driverPool.get().manage().window().maximize();
//                    driverPool.get().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//                    break;
//            }
//
//        }
//
//        return driverPool.get();
//
//    }
//
//    /*
//    Create a new Driver.closeDriver(); it will use .quit() method to quit browsers, and then set the driver value back to null.
//     */
//    public static void closeDriver(){
//        if (driverPool.get()!=null){
//            /*
//            This line will terminate the currently existing driver completely. It will not exist going forward.
//             */
//            driverPool.get().quit();
//            /*
//            We assign the value back to "null" so that my "singleton" can create a newer one if needed.
//             */
//            driverPool.remove();
//        }
//    }
//
//}


