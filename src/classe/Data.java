package classe;

public class Data {
    int day;
    int month;
    int year;


    Data(int initialDay, int initialMonth, int initialYear){
        this.day = initialDay;
        this.month = initialMonth;
        this.year = initialYear;
    }

     String getFormattedDate(){
        return String.format("%d/%d/%d\n", day, month, year);
    }

    void writeFormattedDate(){
         System.out.printf("Write Formatted Date method - %d/%d/%d\n", day, month, year);
    }
}