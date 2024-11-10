package classe;

public class DataTeste {
    public static void main(String[] args) {
        Data d1 = new Data(7, 11,2021);
        var d2 = new Data(31, 12, 2020);


        String formattedDate1 = d1.getFormattedDate();
        String formattedDate2 = d2.getFormattedDate();

        System.out.printf(formattedDate1);
        System.out.printf(formattedDate2);

        d1.writeFormattedDate();
        d2.writeFormattedDate();


    }
}