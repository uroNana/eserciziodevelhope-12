//Use a for-loop to print all the number from 5 to 25 (including the upper and lower bound)


import java.util.ArrayList;
import java.util.stream.IntStream;

public class esercizio {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
        IntStream.range(5, 26).forEach(numbers::add);

        Integer[] numbersArr = numbers.toArray(new Integer[0]);


        for (int i = 0; i < numbersArr.length; i++) {
            System.out.print(numbersArr[i] + " ");

        }

    }
}
