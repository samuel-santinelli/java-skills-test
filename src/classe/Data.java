package classe;

public class Data {
    int day;
    int month;
    int year;

    // Construtor com parâmetros
    public Data(int initialDay, int initialMonth, int initialYear) {
        this.day = initialDay;
        this.month = initialMonth;
        this.year = initialYear;
    }

    // Construtor sem parâmetros que define valores padrão
    public Data() {
        this(1, 1, 1970);  // Valores padrão para a data
    }

    // Método para formatar a data
    String getFormattedDate() {
        final String format = "%d/%d/%d";
        return String.format(format, day, month, year);
    }

    // Método para imprimir a data formatada
    void writeFormattedDate() {
        System.out.printf("Write Formatted Date method - %d/%d/%d\n", day, month, year);
    }

    public static void main(String[] args) {
        Data data1 = new Data(5, 12, 2024);
        Data data2 = new Data(); // Usando o construtor sem parâmetros

        System.out.println(data1.getFormattedDate());
        data1.writeFormattedDate();

        System.out.println(data2.getFormattedDate());
        data2.writeFormattedDate();
    }
}
