package ChatBot;
import java.util.Scanner;
public class ChatBot {
    public static void main(String[] args){
//        ChatBot 1
        System.out.println("Hello! My name is Java_bot\nI was created in 2022");
//        ChatBot 2
        Scanner scan = new Scanner(System.in);
        System.out.println("Please, remind me your name.");
        String name = scan.nextLine();
        System.out.println("What a great name you have, " + name);

//        ChatBot 3
        Scanner number = new Scanner(System.in);
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7\n");
        int remainder3 = scan.nextInt();
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7\n");
        int remainder5 = scan.nextInt();
        System.out.print("Enter remainders of dividing your age by 3, 5 and 7\n");
        int remainder7 = scan.nextInt();

        int age = (remainder3 * 70 + remainder5 * 21 + remainder7 * 15) % 105;
        System.out.println(age);
    }
}
