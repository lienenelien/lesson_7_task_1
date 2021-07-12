import java.util.Scanner;

public class task_1 {
    public static void main(String[] args) {


        short day;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the day");
        day = scanner.nextShort();

        System.out.println("The day number is: " + day);

        if (day < 0) {
            System.out.println("Day cannot be negative");
        } else if (day > 365) {
            System.out.println("Day cannot be a larger number than 365");
        } else {
            short month = (short) (Math.ceil(day / 30) +1);
            switch (month) {
                case 1:
                    System.out.println("It is January");
                    break;

                case 2:
                    System.out.println("It is Febuary");
                    break;


            }


        }
    }
}
