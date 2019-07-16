package SeleniumTests;

import GeneralMethods.GeneralMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CelsiusToFahrenheit {
    private WebDriver driver;

    public CelsiusToFahrenheit(WebDriver driver){
        this.driver = driver ;

    }
    public String runAllTests() throws InterruptedException {

//        System.out.println("Run First Test Check Legal Values");
//        firstTest("99"," Ce");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("55","c ");
//        GeneralMethods.backToMainPage(driver);
//        firstTest("100","C");
//        GeneralMethods.backToMainPage(driver);
//        firstTest("7.5","C ");
//        GeneralMethods.backToMainPage(driver);
//        firstTest("1254","C");
//        GeneralMethods.backToMainPage(driver);
//        firstTest("69875","C");
//        GeneralMethods.backToMainPage(driver);
//        System.out.println("--------------");
//        System.out.println("Run Second Test Check Legal Values after press Temperature");
//        secondTest("66","c");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("165"," c");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("7.5","c ");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("999","C");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("99","celc");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("111","celcius");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("66"," celcius");
//        GeneralMethods.backToMainPage(driver);
//        secondTest("77","CelSius");
//        GeneralMethods.backToMainPage(driver);
//        System.out.println("--------------");
//        System.out.println("Run Third Test Check Legal Values after enter value no need to go back to the main page without the C ");
//        firstTest("88"," C");
//        thirdTest("789","");
//        thirdTest("7.69","");
//        thirdTest("1000","");
//        thirdTest("15978","");
//        thirdTest("164.98","");
//        GeneralMethods.backToMainPage(driver);
//        System.out.println("--------------");
//        System.out.println("Run Fifth Test Check ILLegal Values the search container should not appears do not needs to go back to main page");
//        firstTest("99"," C");
//        fifthTest("E+++"," C");
//        fifthTest("7.5----+++","C");
//        fifthTest("+++"," C ");
//        fifthTest("   "," C");
//        GeneralMethods.backToMainPage(driver);
//        System.out.println("Run First Test Check Legal Values with Table BTN");
//        sisxxthTest("99", "c");
//        GeneralMethods.backToMainPage(driver);

        return "1";

    }
    //check Legal Values
    public String firstTest( String checkValue , String symbol ) throws InterruptedException {
        System.out.println("Value is "+checkValue);

        Thread.sleep(2000);
        GeneralMethods.sendValueToInput("queryFrom",checkValue,symbol,driver);
        Thread.sleep(1000);
        GeneralMethods.ClickButton("//*[@id=\"results\"]/ol/li[2]/div/a[2]",driver);
        Thread.sleep(2000);
        String check =  GeneralMethods.checkTheExpectedResultAndActualResult(checkValue,symbol,driver);
        Thread.sleep(2000);

        return check ;
    }
    public String secondTest(String checkValue , String symbol) throws InterruptedException {
        System.out.println("Value is "+checkValue);
        Thread.sleep(2000);
        GeneralMethods.linkText("Temperature",driver);
        GeneralMethods.sendValueToInput("queryFrom",checkValue,symbol,driver);
        Thread.sleep(2000);
        GeneralMethods.ClickButton("//*[@id=\"results\"]/ol/li[1]/div/a[2]\n",driver);
        Thread.sleep(2000);
        String check_result =  GeneralMethods.checkTheExpectedResultAndActualResult(checkValue,symbol,driver);
        Thread.sleep(2000);
        return check_result ;


    }
    public String thirdTest(String checkValue , String symbol) throws InterruptedException {
        GeneralMethods.emptyTheinput(driver,"argumentConv");
        GeneralMethods.sendValueToInput("argumentConv",checkValue,"",driver);
        String check_result =  GeneralMethods.checkTheExpectedResultAndActualResult(checkValue,symbol,driver);

        return check_result ;

    }
    public void fourthTest(String checkValue , String symbol) throws InterruptedException {
        System.out.println("Value is "+checkValue);
        GeneralMethods.sendValueToInput("queryFrom",checkValue,symbol,driver);
        GeneralMethods.checkIfElementExistByXPAth("//*[@id=\"results\"]/ol",driver);
        GeneralMethods.emptyTheinputByXpath(driver," //*[@id=\"queryFrom\"]");

    }

    public String fifthTest(String checkValue,  String symbol ) throws InterruptedException {
        System.out.println("Illegal Value is "+checkValue);
        GeneralMethods.emptyTheinput(driver,"argumentConv");
        GeneralMethods.sendValueToInput("argumentConv",checkValue,"",driver);
        checkValue = "0";
        String check_result = GeneralMethods.checkTheExpectedResultAndActualResult(checkValue,symbol,driver);
        return check_result ;
    }
    public String sisxxthTest(String checkValue, String symbol) throws InterruptedException {
        System.out.println("Value is "+checkValue);
        GeneralMethods.sendValueToInput("queryFrom",checkValue,symbol,driver);
        GeneralMethods.ClickButton("//*[@id=\"results\"]/ol/li[2]/div/a[1]\n",driver);
        GeneralMethods.emptyTheinputByXpath(driver,"//*[@id=\"startval\"]");
        GeneralMethods.sendValueToInput("startval",checkValue,symbol,driver);
        String check_result =  GeneralMethods.checkTheExpectedResultAndActualResulCelciusToFahrenheitWithTablBtn(checkValue,symbol,driver);

        return check_result ;


    }


}
