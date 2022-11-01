import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numberArray = new ArrayList<>();
        numberArray.add(1);
        numberArray.add(2);
        numberArray.add(3);
        numberArray.add(4);
        numberArray.add(5);
        numberArray.add(6);
        numberArray.add(7);
        numberArray.add(8);
        numberArray.add(9);
        numberArray.add(10);
        numberArray.add(11);
        numberArray.add(12);
        numberArray.add(13);
        numberArray.add(14);
        numberArray.add(15);

        for (int i = 0; i <= numberArray.size()-1; i++) {
            if(isDivisibleByThree(numberArray, i) && (isDivisibleByFive(numberArray, i))) {
                System.out.println("FizzBuzz");
            } else if(isDivisibleByThree(numberArray, i)) {
                System.out.println("Fizz");
            } else if(isDivisibleByFive(numberArray, i)){
                System.out.println("Buzz");
            } else {
                System.out.println(numberArray.get(i));
            }
        }

        // refactored loop
        for (int i = 1; i <= 15; i++) {
            if(isDivisibleByFiveAndThree(i)) {
                System.out.println("FizzBuzz");
            } else if(isDivisibleByThree(i)) {
                System.out.println("Fizz");
            } else if(isDivisibleByFive(i)){
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }

    private static boolean isDivisibleByFiveAndThree(int i) {
        return i % 5 == 0 && i % 3 == 0;
    }

    private static boolean isDivisibleByThree(int i) {
        return i % 3 == 0;
    }

    private static boolean isDivisibleByFive(int i) {
        return i % 5 == 0;
    }

    private static boolean isDivisibleByThree(List<Integer> numberArray, int i) {
        return numberArray.get(i) % 3 == 0;
    }

    private static boolean isDivisibleByFive(List<Integer> numberArray, int i) {
        return numberArray.get(i) % 5 == 0;
    }
}