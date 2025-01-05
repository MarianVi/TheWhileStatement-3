import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //TO DO:

        String mesaj = scanner.nextLine();
        int upperLimit = scanner.nextInt();
        int decrementare = scanner.nextInt();

        System.out.println("Start counting...");
        while (upperLimit >= 0) {
            System.out.println(mesaj + "\t" + upperLimit);
            upperLimit -= decrementare;
        }
        System.out.println("End counting...");
    }
}
