package alessiapalmieri.U5W3D3.Composite;

import com.github.javafaker.Faker;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Locale;

@Component
public class CompositeRunner implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        Faker faker = new Faker(Locale.ITALY);
        Book book = new Book();
        book.addAuthor(faker.book().author());
        book.addAuthor(faker.book().author());
        book.setPrice(faker.number().randomDouble(2,2,39));

        Page page1 = new Page("Page Content 1");
        Page page2 = new Page("Page Content 2");
        Page page3 = new Page("Page Content 3");

        Section section1 = new Section("Chapter 1");
        section1.addElement(page1);
        section1.addElement(page2);

        Section section2 = new Section("Chapter 2");
        section2.addElement(page3);

        Section mainSection = new Section("Book");
        mainSection.addElement(section1);
        mainSection.addElement(section2);

        book.addElement(mainSection);

        book.print();
        System.out.println("Total number of pages in the book: " + book.getTotalPages());
    }
    }
}
