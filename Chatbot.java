import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Hi, I'm a chatbot. How can I help you today?");

        while (true) {
            String userInput = input.nextLine();

            if (userInput.equals("bye")) {
                System.out.println("Goodbye! Have a great day.");
                break;
            } else if (userInput.equals("hi")) {
                System.out.println("Hello! How are you?");
            } else if (userInput.equals("how are you")) {
                System.out.println("I'm just a computer program, so I don't have feelings. But I'm here to help!");
            } else {
                System.out.println("I'm sorry, I don't understand what you're saying. Can you rephrase?");
            }
        }

        input.close();
    }
}
