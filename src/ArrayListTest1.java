package src;

import java.util.ArrayList;

public class ArrayListTest1<B> {
    public static void main(String[] args)
    {
        ArrayList<String> flowers = new ArrayList<>();
flowers.add("Rose");
flowers.add("Jasmine");
flowers.add("Lilly");
flowers.add("Sunflower");
        System.out.println("ArrayList of Flowers: "+flowers);
        System.out.println("Arraylist of second flower: " +flowers.get(2));
        System.out.println("Arraylist of First flower: "+flowers.get(0) );
        flowers.remove(2);
        System.out.println("After removing second element: " +flowers);
        System.out.println("The size of Arraylist is: " +flowers.size());
if (flowers.contains("Rose"));
{
        System.out.println("Rose is in the list: " +flowers);
    }
        System.out.println("looping the list");
        for(String flower: flowers)
        {
            System.out.println(flower);
        }
        flowers.clear();
        System.out.println(" after clearing the ArrayList: " +flowers);
    }
}


