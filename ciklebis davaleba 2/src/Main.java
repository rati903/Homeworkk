import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //სავარჯიშო 1
        Scanner scanner = new Scanner(System.in);
        System.out.print("შეიყვანეთ n რაოდენობა რიცხვების: ");
        int n = scanner.nextInt();
        double mean = (n + 1) / 2.0;

        System.out.println("საშალო არითმეტიკული პირველი  " + n + " რიცხვის არის: " + mean);
        //სავარჯიშო 2
        Scanner sc = new Scanner(System.in);
        System.out.print("შემოიყვანეთ რიცხვი n1: ");
        int n1 = sc.nextInt(); //n უკვე გამოყენებული მქონდა
        System.out.print("წარმოდგენა " + n1 + " რიცხვის როგორც ორის ხარისხების ჯამი : ");

        for (int i = 1; n1 > 0; i *= 2) {
            if ((n1 & i) != 0) {
                System.out.print(i + " ");
                n1 -= i;
            }
        }
        //სავარჯიშო 3
        for (int i = 1; i <= 15; i += 2) {
            if (i == 5 || i == 7 || i == 11) continue;
            System.out.println(i + " ");
        }
        // სავარჯიშო 4
        Scanner sco = new Scanner(System.in);
        System.out.print("შეიყვანეთ ორობითი რიცხვი: ");
        String binaryString = sco.nextLine();
        int decimalNumber = 0;
        int base = 1;
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char binaryChar = binaryString.charAt(i);
            int binaryDigit = binaryChar - '0';
            if (binaryDigit == 1) {
                decimalNumber += base;
            }
            base *= 2;
        }

        System.out.println("ათობითში წარმოდგინდება, როგორც: " + decimalNumber);
        //სავარჯიშო 5
        Scanner scann = new Scanner(System.in);

        System.out.print("შეიყვანეთ ათობითი რიცხვი: ");
        int decimalNum = scann.nextInt();


        String binary = "";

        if (decimalNum == 0) {
            binary = "0";
        } else {
            while (decimalNum > 0) {
                int remainder = decimalNum % 2;
                binary = remainder + binary;
                decimalNum /= 2;
            }
        }

        System.out.println("ორობითში ჩაიწერება როგორც: " + binary);
        //სავარჯიშო 6
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1;
        Scanner s = new Scanner(System.in);
        int guess = 0;

        System.out.println("გამოიცანი რიცხვი 1-დან 100-მდე:");

        while (guess != numberToGuess) {
            guess = s.nextInt();
            if (guess < numberToGuess) {
                System.out.println("უფრო დიდი რიცხვია. თავიდან ცადე!");
            } else if (guess > numberToGuess) {
                System.out.println("უფრო პატარა რიცხვია. თავიდან ცადე!");
            } else {
                System.out.println("გილოცავთ! თვენ გამოიცანით ჩაფიქრებული რიცხვი");
            }
        }
    }
}
