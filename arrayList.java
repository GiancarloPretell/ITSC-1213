import java.util.ArrayList;

public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(39);
        numbers.add(72);
        numbers.add(16);
        numbers.add(89);
        numbers.add(4);
        numbers.add(57);
        numbers.add(61);
        numbers.add(98);
        numbers.add(27);
        numbers.add(12);
        numbers.add(33);
        numbers.add(28);
        numbers.add(6);
        numbers.add(55);
        numbers.add(91);

        int target_number = 4;

        // Variable to hold the sum
        int sum = 0;

        for (int number : numbers) {
            if (number % target_number == 0) {
                sum += number; // Add the number to the sum
            }
        }

        // Print the sum
        System.out.println(sum);
    }
}

