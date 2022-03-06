import Fibonacci.Fibonaccis;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import primes.prime;
import java.util.ArrayList;
import java.util.Arrays;


class bmeTest {

    @Test
    void primes() {
        prime items = new prime();
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(1,3,5,7,9,11));
        Assertions.assertEquals(items.values(10), results);
    }

    @Test
    void fibonacci() {
        Fibonaccis Fibo = new Fibonaccis();
        ArrayList<Integer> results = new ArrayList<Integer>(Arrays.asList(0, 1, 1, 2, 3, 5, 8, 13, 21, 34));
        Assertions.assertEquals( Fibo.Fibonacci(10), results);
    }
}