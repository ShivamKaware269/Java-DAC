// Utksrsh is allowed to go out with his friends only on the even days of the given month. Write a program to count the number of days he can go out in the month of August 

public class Month_Out_Count {
    public static void main(String[] args) {
        int August = 31;
        int DaysOut = 0;

        for (int i = 1; i <= August; i++) {
            if (i % 2 == 0) {
                DaysOut++;
            }
        }

        System.out.println("In the month of August Utkarsh can go out with his friends " + DaysOut + " times");

    }
}
