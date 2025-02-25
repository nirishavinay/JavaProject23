package src;

import java.util.ArrayList;

public class ArrayListTest2 {
    public static void main(String[] args)
    {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);

        System.out.println("ArrayList: " + numbers);
        System.out.println("Size of ArrayList: " + numbers.size());
        System.out.println("Element at index 2: " + numbers.get(2));

        numbers.remove(1);
        System.out.println("ArrayList after removal: " + numbers);

        System.out.println("Contains 300: " + numbers.contains(300));

        numbers.clear();
        System.out.println("ArrayList after clearing: " + numbers);
    }
}
