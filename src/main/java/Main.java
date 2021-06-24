import com.github.javafaker.Faker;
import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVPrinter;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Faker faker = new Faker();
        List<Human> humans = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            Human human = new Human(faker.name().name()
                    ,faker.phoneNumber().phoneNumber()
                    ,faker.address().fullAddress());
            humans.add(human);
        }
        BufferedWriter writer = Files.newBufferedWriter(Paths.get("C:\\Users\\rafay\\Desktop\\userNew.csv"));

        CSVPrinter csvPrinter = new CSVPrinter(writer, CSVFormat.DEFAULT
                .withHeader("First Name","Last Name","E-mail","Number","Address"));
        humans.forEach(human->{
            try {
                csvPrinter.printRecord(human.getFirstName(),human.getLastName(),human.getEmail()
                ,human.getNumber(),human.getAge());
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

    }
}
