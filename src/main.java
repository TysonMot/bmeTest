
import Fibonacci.Fibonaccis;
import primes.prime;
import userinterface.form;

import java.util.Scanner;

public class main {

    int number;

    public static void main(String[] args){

        Scanner value = new Scanner(System.in);

        form form = new form();
        form.userGui();
        main bme = new main();

        System.out.println("Please enter your value to calculate primes and Fibonacci ");
        bme.setNumber(Integer.parseInt(value.nextLine()));

        //method to call constructor classes
        prime items = new prime();
        Fibonaccis Fibo = new Fibonaccis();

        //displaying methods and passing arguments
        //this is for console testing
        System.out.println("Prime values " + items.values(bme.getNumber()));
        System.out.println("Fibonacci values " + Fibo.Fibonacci(bme.getNumber()));
    }

    //just showing that I can implement setters and getters methods, these can be done in a separate package.
    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }
}
