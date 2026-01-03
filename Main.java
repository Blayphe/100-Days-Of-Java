import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Band Name Generator.");
        System.out.println("What's the name of the city you grew up in?");
        String city = scanner.nextLine();
        System.out.println("What's your pet's name?");
        String pet = scanner.nextLine();
        System.out.println("Your band name could be " + city + " " + pet);
    }
}