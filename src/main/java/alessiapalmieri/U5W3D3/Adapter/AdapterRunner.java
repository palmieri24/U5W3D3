package alessiapalmieri.U5W3D3.Adapter;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Locale;

@Component
public class AdapterRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Faker fk = new Faker(Locale.ITALY);
        Info info = new Info();
        info.setName(fk.name().firstName());
        info.setLastname(fk.name().lastName());
        info.setDateOfBirth(LocalDate.of(2000,04,20));

        InfoAdapter infoAdapter = new InfoAdapter(info);

        UserData userData = new UserData();
        userData.getData(infoAdapter);

        System.out.println(userData.getFullName());
        System.out.println(userData.getAge());
    }

}
