package fundamentals;

import java.util.Scanner;

public class DesafioConversao {
    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);

        System.out.print("Write the first salary:" );
        String value1 = entry.next().replace(",", ".");

        System.out.print("\nWrite the second salary:" );
        String value2 = entry.next().replace(",", ".");

        System.out.print("\nWrite the third salary:" );
        String value3 = entry.next().replace(",", ".");

        double salary1 = Double.parseDouble(value1);
        double salary2 = Double.parseDouble(value2);
        double salary3 = Double.parseDouble(value3);

        double average = (salary1 + salary2 + salary3) / 3;
        System.out.println("The average is: " + average);

        entry.close();
    }
}
