package Mobile.Model;

import com.github.javafaker.Faker;
import lombok.Data;

@Data
public class User {

    private String email;
    private String password;

    public User(){

        Faker faker = new Faker();

        this.email = faker.internet().emailAddress() ;
        this.password = faker.internet().password();

    }
}
