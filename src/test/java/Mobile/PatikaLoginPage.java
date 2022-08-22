package Mobile;




import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class PatikaLoginPage extends PatikaAPK{

    @AndroidFindBy(id = "Title")
    private MobileElement appTitle;

    @AndroidFindBy(id = "signUpPageTitle")
    private MobileElement loginTitle;

    @AndroidFindBy(id = "signInEmailTitle")
    private MobileElement emailTitle;

    @AndroidFindBy(id = "SignInPasswordTitle")
    private MobileElement passwordTitle;

    @AndroidFindBy(id = "signInEmailTextInput")
    private MobileElement emailInput;

    @AndroidFindBy(id = "signInPasswordTextInput")
    private MobileElement passwordInput;

    @AndroidFindBy(id = "signInButton")
    private MobileElement signInButton;

    @AndroidFindBy(id = "signInErrorView")
    private MobileElement errorView;

    @AndroidFindBy(id = "signUpBtn")
    private MobileElement signUpButton;

}
