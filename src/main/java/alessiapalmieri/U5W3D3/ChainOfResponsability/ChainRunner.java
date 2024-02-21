package alessiapalmieri.U5W3D3.ChainOfResponsability;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ChainRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        General general = new General();
        Colonel colonel = new Colonel();
        Lieutenant lieutenant = new Lieutenant();
        Major major = new Major();
        Captain captain = new Captain();

        captain.setSuperior(major);
        major.setSuperior(lieutenant);
        lieutenant.setSuperior(colonel);
        colonel.setSuperior(general);

        captain.check(800);
    }
}
