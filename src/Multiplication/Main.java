package Multiplication;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static int getRandomNumberUsingInts(int min, int max) {
        Random random = new Random();
        return random.ints(min, max)
                .findFirst()
                .getAsInt();
    }


    public static void main(String[] args) {

        Set<Multiplication> multiplications = new HashSet<>();
        Random random = new Random();
        while (multiplications.size() < 15) {
            //Multiplication multiplication = new Multiplication(random.nextInt(10), random.nextInt(10));//нет возможности указать начальное значение диапазона-2
            Multiplication multiplication = new Multiplication(getRandomNumberUsingInts(2, 10), getRandomNumberUsingInts(2, 10));
            multiplications.add(multiplication);
            System.out.println(multiplications);
        }
    }


}
