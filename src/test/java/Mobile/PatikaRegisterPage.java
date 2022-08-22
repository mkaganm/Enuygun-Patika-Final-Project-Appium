package Mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class PatikaRegisterPage extends PatikaAPK{

    @AndroidFindBy(id = "username")
    private MobileElement usernameInput;

    @AndroidFindBy(id = "password1")
    private MobileElement passwordInput;

    @AndroidFindBy(id = "sign")
    private MobileElement signUpButton;

    @AndroidFindBy(id = "signin")
    private MobileElement signInButton;


}
