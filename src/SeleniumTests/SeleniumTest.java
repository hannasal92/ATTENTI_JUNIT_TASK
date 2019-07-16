package SeleniumTests;

import Constant.Constant;
import GeneralMethods.GeneralMethods;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SeleniumTest {
    private static WebDriver driver;

    @Test
    public void weatherApi() throws Exception {
        String tempereture = null ;
        tempereture = GeneralMethods.sendGet();
        invokeBrowser(Constant.WEATHER_URL);
        ApiTemperature tester = new ApiTemperature(driver,tempereture);
        assertEquals("1", tester.getTempFromWeather(), "1");
        driver.quit();

    }
    @Test
    public void CelToFah() throws Exception {
        invokeBrowser(Constant.METRIC_URL);

        CelsiusToFahrenheit celToFah = new CelsiusToFahrenheit(driver);

        System.out.println("Run First Test Check Legal Values");
        assertEquals("1", celToFah.firstTest("99"," Ce"), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        assertEquals("1", celToFah.firstTest("55","c "), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        assertEquals("1", celToFah.firstTest("100","C"), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        assertEquals("1", celToFah.firstTest("7.5"," C"), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        assertEquals("1", celToFah.firstTest("1254","CE"), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        assertEquals("1", celToFah.firstTest("69875"," c"), "1");
        GeneralMethods.backToMainPage(driver);
        Thread.sleep(1000);
        System.out.println("--------------");


        System.out.println("Run Second Test Check Legal Values after press Temperature");
        assertEquals("1", celToFah.secondTest("66","c"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", celToFah.secondTest("165","c "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", celToFah.secondTest("7.5"," c"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", celToFah.secondTest("999","C"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", celToFah.secondTest("99","celc"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", celToFah.secondTest("111","celcius"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");


        System.out.println("Run Third Test Check Legal Values after enter value no need to go back to the main page without the C ");
        assertEquals("1", celToFah.firstTest("99"," Ce"), "1");
        assertEquals("1", celToFah.thirdTest("789",""), "1");
        assertEquals("1", celToFah.thirdTest("7.69",""), "1");
        assertEquals("1", celToFah.thirdTest("1000",""), "1");
        assertEquals("1", celToFah.thirdTest("15978",""), "1");
        assertEquals("1", celToFah.thirdTest("164.98",""), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");



        System.out.println("Run Fifth Test Check ILLegal Values the search container should not appears do not needs to go back to main page");
        assertEquals("1", celToFah.firstTest("99","C"), "1");
        assertEquals("1", celToFah.fifthTest("E+++",""), "1");
        assertEquals("1", celToFah.fifthTest("7.5----+++",""), "1");
        assertEquals("1", celToFah.fifthTest("+++",""), "1");
        assertEquals("1", celToFah.fifthTest("  ",""), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");


        System.out.println("Run First Test Check Legal Values with Table BTN");
        assertEquals("1", celToFah.sisxxthTest("99","C"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        driver.quit();

    }
    @Test
    public void MetersToFeets() throws Exception {

        invokeBrowser(Constant.METRIC_URL);

        MetersToFeets meterToFeets = new MetersToFeets(driver);

        System.out.println("Run First Test Check Legal Values with Convert BTN");
        assertEquals("1", meterToFeets.firstTest("99"," M"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("7.5","meters"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("789","M "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("5","m"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("14562"," m"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("88","m "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("77"," M"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("13","meters"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("111","meters "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("55"," meters"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.firstTest("124","M"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        System.out.println("Run Second Test Check Legal Values after press Length with Convert BTN");
        assertEquals("1", meterToFeets.secondTest("33"," M"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.secondTest("1","meters"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.secondTest("45687","M "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", meterToFeets.secondTest("7.5","m"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        System.out.println("Run Third Test Check Legal Values after enter value no need to go back to the main page without the M ");
        assertEquals("1", meterToFeets.firstTest("99"," M"), "1");
        assertEquals("1", meterToFeets.thirdTest("789",""), "1");
        assertEquals("1", meterToFeets.thirdTest("9.5",""), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        System.out.println("Run Fifth Test Check ILLegal Values the search container should not appears do not needs to go back to main page");
        assertEquals("1", meterToFeets.firstTest("99"," M"), "1");
        assertEquals("1", meterToFeets.fifthTest("E+++"," M"), "1");
        assertEquals("1", meterToFeets.fifthTest("7.5----+++"," M"), "1");
        assertEquals("1", meterToFeets.fifthTest("+++"," M"), "1");
        assertEquals("1", meterToFeets.fifthTest("  "," M"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");
        driver.quit();


    }
    @Test
    public void OuncesToGrams() throws Exception {

        invokeBrowser(Constant.METRIC_URL);

        OuncesToGrams ouncesToGrams = new OuncesToGrams(driver);

        System.out.println("Run First Test Check Legal Values");
        assertEquals("1", ouncesToGrams.firstTest("99"," OZ"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("7.5","oz"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("789","Oz "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("5"," oZ"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("123","O"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("55"," o"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("111"," o "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("123","o "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("88","O "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.firstTest("77"," O "), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");


        System.out.println("Run Second Test Check Legal Values after press Length");
        assertEquals("1", ouncesToGrams.secondTest("33","OZ"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.secondTest("1"," oz"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.secondTest("123"," o "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.secondTest("7.5","o "), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.secondTest("8.5"," O"), "1");
        GeneralMethods.backToMainPage(driver);
        assertEquals("1", ouncesToGrams.secondTest("9.5","O"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        System.out.println("Run Third Test Check Legal Values after enter value no need to go back to the main page without the Oz ");
        assertEquals("1", ouncesToGrams.firstTest("99"," OZ"), "1");
        assertEquals("1", ouncesToGrams.thirdTest("789",""), "1");
        assertEquals("1", ouncesToGrams.thirdTest("9.5",""), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        System.out.println("Run Fifth Test Check ILLegal Values the search container should not appears do not needs to go back to main page");
        assertEquals("1", ouncesToGrams.firstTest("99"," OZ"), "1");
        assertEquals("1", ouncesToGrams.fifthTest("E+++"," o"), "1");
        assertEquals("1", ouncesToGrams.fifthTest("7.5----+++","OZ"), "1");
        assertEquals("1", ouncesToGrams.fifthTest("+++"," oz "), "1");
        assertEquals("1", ouncesToGrams.fifthTest("  "," O"), "1");
        GeneralMethods.backToMainPage(driver);
        System.out.println("--------------");

        driver.quit();


    }
    //Open the specific URL
    public static void invokeBrowser(String URL) {
        try {
            ChromeOptions chromeOptions = new ChromeOptions();
            chromeOptions.addArguments("--kiosk");
            System.setProperty("webdriver.chrome.driver", "chromedriver");
            driver = new ChromeDriver(chromeOptions);
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
            driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
            driver.get(URL);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
