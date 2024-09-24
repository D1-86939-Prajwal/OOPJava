
import java.util.Scanner;

public class Question_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        int totalBill = 0;

        int priceDosa = 50;
        int priceSamosa = 30;
        int priceIdli = 30;

        int qDosa = 0;
        int qSamosa = 0;
        int qIdli = 0;

        do {
            System.out.println("-------Taj Food Menu-------");
            System.out.println("1. Dosa - Rs. 50");
            System.out.println("2. Samosa - Rs. 30");
            System.out.println("3. Idli - Rs. 30");
            System.out.println("4. Generate Bill");
            System.out.println("5  Exit the Menu");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter quantity of Dosa: ");
                    qDosa += sc.nextInt();
                    break;
                case 2:
                    System.out.print("Enter quantity of Samosa: ");
                    qSamosa += sc.nextInt();
                    break;
                case 3:
                    System.out.print("Enter quantity of Idli: ");
                    qIdli += sc.nextInt();
                    break;
                case 4:
                    totalBill = (qDosa * priceDosa) + (qSamosa * priceSamosa) + (qIdli * priceIdli);
                    System.out.println("Total Bill: Rs. " + totalBill);
                    break;
                case 5:
                    System.out.println("Exiting Thank You For Using");
                    break;
            }
        } while (choice != 5);

        sc.close();
    }
}

