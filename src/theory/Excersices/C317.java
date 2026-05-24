package theory.Excersices;

import java.util.HashSet;

public class C317 {
    public static void main(String[] args){
        HashSet<String> cars = new HashSet<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Aa");
        cars.add("BMW");  // Duplicate
        cars.add("Mazda");
        System.out.println(cars);

    }
}
