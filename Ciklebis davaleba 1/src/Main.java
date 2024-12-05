public class Main {
    public static void main(String[] args) {
        //სავარჯიშო 1
        int sum = 0;
        for (int i = 10; i < 100; i += 5) {
            sum += i;
        }
        System.out.println("რიცხვების ჯამი 5-იდან 100-მდე არის: " + sum);
        // სავარჯიშო 2
        int number = 25;
        int count = 0;

        if (number == 0) {
            count = 1;
        } else {
            if (number < 0) {
                number = -number;
            }
            while (number > 0) {
                number /= 10;
                count++;
            }
        }
        System.out.println("მოცემული რიცხვის ციფრთა რაოდენობაა: " + count);
        // სავარჯიშო 3
        int num = 13;
        boolean isPrime = true;

        if (num < 2) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        System.out.println(" მოცემული რიცხვი არის " + (isPrime ? "მარტივი." : "არაა მარტივი."));
        //სავარჯიშო 4
        int num1 = 50;
        int num2 = 42;

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("უსგ: " + num1);
        // სავარჯიშო 5
        for (int n = 100; n <= 999; n++) {
            int aseuli = n / 100;
            int ateuli = (n / 10) % 10;
            int erteuli = n % 10;
            int digitSum = aseuli + ateuli + erteuli;
            if (digitSum > 0 && n % digitSum == 0) {
                System.out.println("სამნიშნა ციფრები, რომლებიც იყოფიან თავიანთ ციფრთა ჯამზე: "+ n);
            }
        }
        //სავარჯიშო 6
        int numb = 10;
        int first = 0, second = 1;
        System.out.println("ფიბონაჩის მიმდევრობის პირველი 10 რიცხვი:");
        System.out.print(first + ", " + second);
        for (int i = 3; i <= numb; i++) {
            int nextTerm = first + second;
            System.out.print(", " + nextTerm);
            first = second;
            second = nextTerm;
        }
    }
}