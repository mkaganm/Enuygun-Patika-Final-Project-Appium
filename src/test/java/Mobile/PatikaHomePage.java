package Mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class PatikaHomePage extends PatikaAPK{

    @AndroidFindBy(id = "com.appium.patika:id/signUpPageTitle")
    private MobileElement title;

    @AndroidFindBy(id = "searchCustomerInfo")
    private MobileElement searchCustomerButton;

    @AndroidFindBy(id = "newCustomerInfo")
    private MobileElement addCustomerButton;

    @AndroidFindBy(id = "oldCustomerInfo")
    private MobileElement updateCustomerButton;

}
