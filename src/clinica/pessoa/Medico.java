package clinica.pessoa;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Medico {
    private static final Logger logger = Logger.getLogger(Funcionario.class.getName());
    private static final List<String> names = Arrays.asList(
            "Alice", "Bob", "Charlie", "Diana", "Edward",
            "Fiona", "George", "Hannah", "Ivan", "Jasmine");

    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.logRandomNames(5);
    }

    public void logRandomNames(int numberOfNames) {
        Random random = new Random();

        for (int i = 0; i < numberOfNames; i++) {
            String randomName = names.get(random.nextInt(names.size()));
            logger.log(Level.INFO, "Random name {0}: {1}", new Object[] { i + 1, randomName });
        }
    }

}
