import java.util.ArrayList;

public class Operations_On_ArrayList {
    public static void main(String[] args) {
        
        ArrayList<Integer> demo = new ArrayList<>(5);

        demo.add(11); // Adding elements to ArrayList
        demo.add(21);
        demo.add(31);
        demo.add(41);
        demo.add(51);
        demo.add(61);
        demo.add(71);

        System.out.println(demo);

        demo.set(0, 99); // Changing the value of the elssement in Arraylist according to index

        System.out.println(demo);

        System.out.println(demo.contains(99)); // Checks if element is present or not (Boolean Value)

        demo.remove(6); // Removes the element at entered index
        System.out.println(demo);

        demo.get(5); // To get the valu at the entered index

        /* Working of array list -> When the array list is initilized with a size and with this all the elements 
        are entered till arraylist is full, here if we add a element after arraylist gets full (internally) a 
        new arraylist (of doubled size) is generated along with this step the previous arraylist elements gets copied 
        into the new arraylist with extra size for upcoming elements */
    }
}
