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
    }
}
