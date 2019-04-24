import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Good day. What is your problem? Enter your response here or Q to quit:");
        boolean running = true;

        while (running){
            String response =  keyboard.nextLine();
            if (response.equalsIgnoreCase("q") || response.equalsIgnoreCase("i am feeling great") ){
                running = false;
            }else{
                System.out.println(response);
                System.out.println("Enter your response here or Q to quit:");
            }
        }
    }
}
