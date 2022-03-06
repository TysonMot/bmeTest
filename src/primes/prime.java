package primes;
import java.util.ArrayList;

public class prime {
//a method to calculate prime numbers
    public ArrayList<Integer> values(int value){
        //new array to contain prime numbers
        ArrayList<Integer> primeList = new ArrayList<Integer>();

        for(int i = 0; i < value + 2;i++){
            ///mod to calculate values and push items inside arraylist
            if(i % 2 == 0){
                primeList.add(i + 1);
            }
        }

        return primeList;
    }
}
