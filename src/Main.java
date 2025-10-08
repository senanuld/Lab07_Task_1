import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("loop 1:Count up by 1 from 0 to 30 ");
        for (int i = 1; i <= 30; i++) {
            System.out.println(i + " - " + input.nextLine());
            System.out.println(i + "");

        }
    }
}