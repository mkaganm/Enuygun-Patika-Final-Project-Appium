package Mobile;

import MobileTest.MobileTest;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;


public class PatikaAPK {

    public PatikaAPK(){
        PageFactory.initElements(new AppiumFieldDecorator(MobileTest.driver), this);
    }

}
