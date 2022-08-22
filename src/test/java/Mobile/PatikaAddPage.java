package Mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class PatikaAddPage extends PatikaAPK{

    @AndroidFindBy(id = "customertelnumber")
    private MobileElement phoneInput;

    @AndroidFindBy(id = "customernamesurname")
    private MobileElement nameInput;

    @AndroidFindBy(id = "customerworktracknumber")
    private MobileElement trackNumberInput;

    @AndroidFindBy(id = "customernotes")
    private MobileElement carpetNumberInput;

    @AndroidFindBy(id = "customeraddress")
    private MobileElement addressInput;

    @AndroidFindBy(id = "in_date")
    private MobileElement deliveryDateInput;

    @AndroidFindBy(id = "in_received_date")
    private MobileElement reveivedDateInput;

    @AndroidFindBy(id = "customerInfoSave")
    private MobileElement saveButton;

}
