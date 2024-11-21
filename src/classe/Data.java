package classe;

public class Data {
    int day;
    int month;
    int year;


    Data(int initialDay, int initialMonth, int initialYear){
        this.day = initialDay;
        this.month = initialMonth;
        this.year = initialYear;

        // byte, short, int, long -> 0
        // float, double -> 0.0
        // boolean -> false
        // char -> '\u0000'

        this(1, 1, 1970);
    }

     String getFormattedDate(){
        final String format = "%d/%d/%d";
        return String.format(format, day, month, year);
    }

    void writeFormattedDate(){
         System.out.printf("Write Formatted Date method - %d/%d/%d\n", day, month, year);
    }
}