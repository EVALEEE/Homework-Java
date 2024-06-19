package comp1110.homework.O04;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author EVA LEE
 * @version 1.0
 * @time 27/2/2024 4:51 pm
 */
public class Sum extends ArrayList<Integer> {
    public int sum;// Public instance field to store the sum

    public Sum() {
        sum = 0;// Initialize sum to 0
    }

    // Constructor
    public Sum(int sum) {
        this.sum = sum;
    }


    // Overriding add methods to adjust the sum field:
    public Sum(Collection<? extends Integer> c, int sum) {
        super(c);
        this.sum = sum;
    }

    @Override
    public boolean add(Integer integer) {
        sum += integer;
        return super.add(integer);
    }

    @Override
    public void add(int index, Integer element) {
        sum += element;
        super.add(index, element);
    }

    @Override
    public boolean addAll(Collection<? extends Integer> c) {
        for (Integer i : c) {
            sum += i;
        }
        return super.addAll(c);
    }

    @Override
    public boolean addAll(int index, Collection<? extends Integer> c) {
        for (Integer i : c) {
            sum += i;
        }
        return super.addAll(index, c);
    }

    // Method to return the sum field
    public int sum() {
//        // returns the sum of all elements in the list of Integers
//        // (add the elements up each time the method is called)
//        int sum = 0;
//        for (int i : this) {
//            sum += i;
//        }
        return sum;
    }

    public static void main(String[] args) {
        Sum sum = new Sum();
        sum.add(1);
        sum.add(2);
        sum.add(3);
//        System.out.println(sum.sum());//6
        System.out.println("Sum of elements: " + sum.sum);

        sum.add(4);
        sum.add(5);
        sum.add(6);
//        System.out.println(sum.sum());//21
        System.out.println("Sum of elements: " + sum.sum);

    }
}
