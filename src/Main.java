import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectWriter;
import org.json.simple.JSONArray;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Paths;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

public class Main {

    static void pojoToJson(BankClient[] bankClients) {
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.setVisibility(PropertyAccessor.FIELD, JsonAutoDetect.Visibility.ANY);
        ObjectWriter writer = objectMapper.writer(new DefaultPrettyPrinter());

        try {
            writer.writeValue(Paths.get("outPutFile.json").toFile(), bankClients);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper().findAndRegisterModules();
        ConsoleStrings consoleStr = new ConsoleStrings();
        File file = new File("C:\\Users\\taren\\IdeaProjects\\ParsingJSON\\BankClient.json");
        List<BankClient> bankClients;
        try {
            bankClients = objectMapper.readValue(file, new TypeReference<List<BankClient>>(){});
            consoleStr.successRead();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        consoleStr.printUpper();
        for(BankClient i:bankClients){
            i.printAll();
        }
        consoleStr.getGap();

        BankClient[] bankClientsMas = new BankClient[12];
        bankClientsMas[0] = new BankClient(0, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[1] = new BankClient(1, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[2] = new BankClient(2, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[3] = new BankClient(3, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[4] = new BankClient(4, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[5] = new BankClient(5, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[6] = new BankClient(6, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[7] = new BankClient(7, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[8] = new BankClient(8, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[9] = new BankClient(9, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[10] = new BankClient(10, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));
        bankClientsMas[11] = new BankClient(11, new PassData("Иван", "Иванов", "Иванович",
                new Date(2020, 4, 13), "Саратов", 789654,
                new Date(2020, 4, 13), "100-186"),
                new Bills("147852369854758", new Date(2020, 4, 13), new Date(2020, 4, 13)),
                new BankCard("Иван", "Иванов", new Date(2020, 4, 13),
                        "7893 5421 3548 1547", 789));

        consoleStr.successWrite();

        pojoToJson(bankClientsMas);
        consoleStr.printUpper();
        for(BankClient i:bankClientsMas){
            i.printAll();
        }
        consoleStr.getGap();
    }
}