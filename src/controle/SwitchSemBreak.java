package controle;

public class SwitchSemBreak {
    public static void main(String[] args) {
        String range = "black";

        switch (range.toLowerCase()){
            case "black":
                System.out.println("I know the Bassai-Dai...");
            case "brown":
                System.out.println("I know the Tekki Shodan...");
            case "purple":
                System.out.println("I know the Heian Godan...");
            case "green":
                System.out.println("I know the Heian Godan...");
            case "red":
                System.out.println("I know the Heian Godan...");
            case "yellow":
                System.out.println("I know the Heian Godan...");
            default:
                System.out.println("I don't know what to do...");

        }
        System.out.println("End!");
    }
}
