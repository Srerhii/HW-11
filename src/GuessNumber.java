import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int number = (int) (Math.random() * 10);
        int round = 1;

        int player;

        do {
            player = scanner.nextInt();
            if (player == number) {
                System.out.println("Угадали число");

            }
            if (player > number) {
                System.out.println("введенное число (больше) > загаданного");
            }
            if(player < number){

                System.out.println("Введенное чило (меньше) < загаданного");
            }
        }
        while (++round < 4 && player != number);
        if(player!=number){
            System.out.println("Число не отгадано");
        }
    }
}



