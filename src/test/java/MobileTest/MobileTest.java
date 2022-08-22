package MobileTest;


import MKagan.DeviceSetup;
import MKagan.FindPath;
import Mobile.*;
import Mobile.Model.Customer;
import Mobile.Model.User;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

@Slf4j
public class MobileTest {

    public static AppiumDriver<?> driver;
    DesiredCapabilities capabilities;
    PatikaHomePage homePage;
    PatikaLoginPage loginPage;
    PatikaRegisterPage registerPage;
    PatikaAddPage addPage;
    PatikaSearchPage searchPage;

    User user;
    Customer customer;

    public MobileTest() throws MalformedURLException {
        capabilities = new DesiredCapabilities();
        capabilities = DeviceSetup.DeviceCapabilitites(FindPath.returnOreoJsonPath());
        capabilities.setCapability("app", FindPath.returnAppPath());

        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"),capabilities);
    }

    @BeforeClass
    public void setMobileDriver() {

        homePage = new PatikaHomePage();
        loginPage = new PatikaLoginPage();
        registerPage = new PatikaRegisterPage();
        addPage = new PatikaAddPage();
        user = new User();
        customer = new Customer();
        searchPage = new PatikaSearchPage();
    }

    @Test(priority = 1)
    @Description("open app")
    @Severity(SeverityLevel.CRITICAL)
    public void openAppTest(){

        String appTitle = loginPage.getAppTitle().getText();
        String loginTitle = loginPage.getLoginTitle().getText();
        String emailTitle = loginPage.getEmailTitle().getText();
        String passwordTitle = loginPage.getPasswordTitle().getText();
        String emailInput = loginPage.getEmailInput().getText();
        String passwordInput = loginPage.getPasswordInput().getText();
        log.info("TEST : open app");

        Assert.assertEquals(appTitle,"Appium Patika Tutorial");
        Assert.assertEquals(loginTitle,"Giriş Yap");
        Assert.assertEquals(emailTitle,"Email");
        Assert.assertEquals(passwordTitle,"Password");
        Assert.assertEquals(emailInput,"user@domain.com");
        Assert.assertEquals(passwordInput,"Password");
    }

    @Test(priority = 2)
    @Description("empty email field")
    @Severity(SeverityLevel.NORMAL)
    public void emptyEmailLoginTest(){

        loginPage.getSignInButton().click();
        String errorText = loginPage.getErrorView().getText();
        log.info("TEST : empty email field");

        Assert.assertEquals(errorText,"Email boş olamaz");
    }

    @Test(priority = 3)
    @Description("empty password field")
    @Severity(SeverityLevel.NORMAL)
    public void emptyPasswordLoginTest(){

        loginPage.getEmailInput().sendKeys("xyz@xyz.com");
        loginPage.getSignInButton().click();
        String errorText = loginPage.getErrorView().getText();
        log.info("TEST : empty password field");

        Assert.assertEquals(errorText,"Password cant be empty");
    }

    @Test(priority = 4)
    @Description("register page")
    @Severity(SeverityLevel.CRITICAL)
    public void registerPageTest(){

        loginPage.getSignUpButton().click();

        String emailInput = registerPage.getUsernameInput().getText();
        String passwordInput = registerPage.getPasswordInput().getText();
        String signUpButton = registerPage.getSignUpButton().getText();
        String signInButton = registerPage.getSignInButton().getText();
        log.info("TEST : register page check");

        Assert.assertEquals(emailInput,"Username");
        Assert.assertEquals(passwordInput,"Password");
        Assert.assertEquals(signUpButton,"SIGN UP");
        Assert.assertEquals(signInButton,"SIGN IN");
    }

    @Test(priority = 5)
    @Description("register")
    @Severity(SeverityLevel.CRITICAL)
    public void registerTest(){

        registerPage.getUsernameInput().click();
        registerPage.getUsernameInput().sendKeys(user.getEmail());

        String emailText = registerPage.getUsernameInput().getText();

        registerPage.getPasswordInput().click();
        registerPage.getPasswordInput().sendKeys(user.getPassword());


        Assert.assertEquals(emailText, user.getEmail());

        registerPage.getSignUpButton().click();
        driver.hideKeyboard();

        log.info("TEST : register");

    }

    @Test(priority = 6)
    @Description("login")
    @Severity(SeverityLevel.CRITICAL)
    public void loginTest(){

        registerPage.getSignInButton().click();

        loginPage.getEmailInput().click();
        loginPage.getEmailInput().sendKeys(user.getEmail());
        loginPage.getPasswordInput().click();
        loginPage.getPasswordInput().sendKeys(user.getPassword());

        log.info("TEST : login");

        String email = loginPage.getEmailInput().getText();

        Assert.assertEquals(email, user.getEmail());

    }

    @Test(priority = 7)
    @Description("check home page")
    @Severity(SeverityLevel.CRITICAL)
    public void homePageTest(){

        loginPage.getSignInButton().click();

        String addCustomer = homePage.getAddCustomerButton().getText();
        String searchCustomer = homePage.getSearchCustomerButton().getText();
        Boolean addButton = Boolean.valueOf(homePage.getAddCustomerButton().getAttribute("clickable"));
        Boolean searchButton = Boolean.valueOf(homePage.getSearchCustomerButton().getAttribute("clickable"));
        log.info("TEST : check home page");

        Assert.assertEquals(addCustomer,"YENI MÜŞTERI GIR");
        Assert.assertEquals(searchCustomer, "MÜŞTERI ARAMA");
        Assert.assertEquals(addButton, true);
        Assert.assertEquals(searchButton, true);
    }

    @Test(priority = 8)
    @Description("add customer page")
    @Severity(SeverityLevel.CRITICAL)
    public void addCustomerPageTest(){

        homePage.getAddCustomerButton().click();
        driver.hideKeyboard();

        String customerName = addPage.getNameInput().getText();
        String carpetNumber = addPage.getCarpetNumberInput().getText();
        String address = addPage.getAddressInput().getText();
        String deliveryDate = addPage.getDeliveryDateInput().getText();
        log.info("TEST : check add customer page");

        Assert.assertEquals(customerName,"Müşteri Adı Soyadı");
        Assert.assertEquals(carpetNumber,"Kaç Adet Halı Alındı");
        Assert.assertEquals(address,"Adres Gir");
        Assert.assertEquals(deliveryDate,"Teslim Tarihi");
    }

    @Test(priority = 9)
    @Description("add customer")
    @Severity(SeverityLevel.CRITICAL)
    public void addCustomerTest(){

        addPage.getPhoneInput().click();
        addPage.getPhoneInput().sendKeys(customer.getPhoneNumber());
        addPage.getNameInput().click();
        addPage.getNameInput().sendKeys(customer.getFullName());
        addPage.getCarpetNumberInput().click();
        addPage.getCarpetNumberInput().sendKeys(customer.getCarpetNumber());
        addPage.getAddressInput().click();
        addPage.getAddressInput().sendKeys(customer.getAddress());

        driver.hideKeyboard();
        addPage.getSaveButton().click();
        log.info("TEST : add customer");
    }

    @Test(priority = 10)
    @Description("search customer")
    @Severity(SeverityLevel.CRITICAL)
    public void searchTest(){

        homePage.getSearchCustomerButton().click();
        searchPage.getSearchButton().click();
        searchPage.getSearchInput().sendKeys(customer.getPhoneNumber());
        log.info("TEST : search customer");

        String phoneNumber = searchPage.getSearchResult().getText();

        Assert.assertEquals(phoneNumber, customer.getPhoneNumber());
    }
}
