package Fibonacci;
import java.util.ArrayList;

public class Fibonaccis {

    public class variables {
        int firstValue = 0;
        int secondValue = 1;
        int thirdValue;
    }

    public ArrayList<Integer> Fibonacci(int value)  {
        //calling an inner class containing three primitive variables
        Fibonaccis.variables variables = new Fibonaccis.variables();

        //array to store Fibonacci values
        ArrayList<Integer> Fibonacci = new ArrayList<Integer>();

        //adding first and second value to Fib array list
        Fibonacci.add(variables.firstValue);
        Fibonacci.add(variables.secondValue);

        for(int i = 2; i < value;i++){

            //adding first and second value
            variables.thirdValue = variables.firstValue + variables.secondValue;

            //pushing/adding values in an array
            Fibonacci.add(variables.thirdValue);

            //method to reassign new values
            variables.firstValue = variables.secondValue;
            variables.secondValue = variables.thirdValue;
        }
        return Fibonacci;
    }
}
