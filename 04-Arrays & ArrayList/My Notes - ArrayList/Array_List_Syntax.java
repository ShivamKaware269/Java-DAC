// Arrays have fixed size and it takes fixed amount of inputs, to over come this we use arraylist
// We can store as much elements as we want in Arraylist according to our will

import java.util.ArrayList;

public class Array_List_Syntax {
    public static void main(String[] args) {

        // Syntax ->
        ArrayList<Integer> list = new ArrayList<>(5);

        // ArrayList initial Capacity is 5 but we can store more than 5 elements and as much as we want

        list.add(61);
        list.add(62);
        list.add(63);
        list.add(64);
        list.add(65);
        list.add(66);
        list.add(67);
        list.add(71);
        list.add(72);
        list.add(73);
        list.add(74);
        list.add(75);
        list.add(76);
        list.add(77);

        System.out.println(list);

    }
}