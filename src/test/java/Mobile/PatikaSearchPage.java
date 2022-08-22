package Mobile;

import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import lombok.Data;

@Data
public class PatikaSearchPage extends PatikaAPK{

    @AndroidFindBy(id = "search_button")
    private MobileElement searchButton;

    @AndroidFindBy(id = "search_src_text")
    private MobileElement searchInput;

    @AndroidFindBy(id = "android:id/text1")
    private MobileElement searchResult;

    @AndroidFindBy(id = "idTVtext")
    private MobileElement searchResult2;


}
