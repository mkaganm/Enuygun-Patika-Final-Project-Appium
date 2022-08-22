package Mobile.Model;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class Customer {

    private String phoneNumber;
    private String fullName;
    private String trackNumber;
    private String carpetNumber;
    private String address;
    private String deliveryDate;
    private String receivedDate;

    public Customer(){

        Faker faker = new Faker();

        this.phoneNumber = faker.phoneNumber().cellPhone();
        this.fullName = faker.name().fullName();
        this.trackNumber = faker.bothify("#####");
        this.carpetNumber = faker.bothify("##");
        this.address = faker.address().fullAddress();

    }

}
