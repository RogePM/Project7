package guilford.edu;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class AnimalList {
    public static void main(String[] args) {
        // declare a constant for the number of elements in the list and set it equal to
        // 1000
        final int NUM_ANIMALS = 100000;
        // declare an array of Animal objects a
        ArrayList<String> arrayAnimal = new ArrayList<String>();
        LinkedList<String> linkedAnimal = new LinkedList<String>();

        // add 1000 ramdomly generated Animal objects to the lists //algorith is O(n) 
        for (int i = 0; i < NUM_ANIMALS; i++) {
            Animal animal = new Animal();
            arrayAnimal.add(animal.getName());
            linkedAnimal.add(animal.getName());
            // print the name and species of the Animal object
            System.out.println(animal.getName() + " " + animal.getSpecies());
        }


        // time 1,000,000 gets from list
        long startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            arrayAnimal.get(i);
        }
        long endTime = System.nanoTime();
        long duration = endTime - startTime;
        System.out.println("ArrayList get() time: " + duration / 1000000.0 + " mili seconds");

        //
       
        //time random add method
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            arrayAnimal.add(i, "new animal");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList random add() time: " + duration / 1000000.0 + " mili seconds");

        //add random add method to linked list
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            linkedAnimal.add(i, "new animal");
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList random add() time: " + duration / 1000000.0 + " mili seconds");
        

        // time 1,000,000 gets from list
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            linkedAnimal.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList get() time: " + duration / 1000000.0 + " mili seconds");

        // time sorting the array list
        startTime = System.nanoTime();
        arrayAnimal.sort(null);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList sort() time: " + duration / 1000000.0 + " mili seconds");

        // time sorting the linked list
        startTime = System.nanoTime();
        linkedAnimal.sort(null);
        endTime = System.nanoTime();
        duration = endTime - startTime;
        // print in miliseconds with decimals
        System.out.println("LinkedList sort() time: " + duration / 1000000.0 + " mili seconds");

        // add shuffle method to array list
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            arrayAnimal.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("ArrayList shuffle() time: " + duration / 1000000.0 + " mili seconds");

        // add shuffle method to linked list
        startTime = System.nanoTime();
        for (int i = 0; i < NUM_ANIMALS; i++) {
            linkedAnimal.get(i);
        }
        endTime = System.nanoTime();
        duration = endTime - startTime;
        System.out.println("LinkedList shuffle() time: " + duration / 1000000.0 + " mili seconds");

    }
}
