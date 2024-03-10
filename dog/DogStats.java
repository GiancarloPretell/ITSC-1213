
import java.util.Scanner;
public class dogStats{

    public static void main(String[] args) {
        //Create the scanner
        Scanner scanner = new Scanner(System.in);

        //Ask for dog's name
        System.out.println("What is the name of your dog?");
        String dogName = scanner.nextLine();

        //Ask for dog's breed
        System.out.println("What type of dog is " + dogName + "?");
        String dogBreed = scanner.nextLine();

        //Create onbject for my dog
        Dog myDog = new Dog(dogName, dogBreed);

        //Display the output using the Dog class
        System.out.println("The dog's name is: " + myDog.getName());
        System.out.println("The dog's breed is: " + myDog.getBreed());
    }
}
