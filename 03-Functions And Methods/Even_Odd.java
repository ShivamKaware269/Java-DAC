import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
      
        System.out.print("Enter the number : ");
        int num = sc.nextInt();

        int x = check(num);
        if (x == 1) {
            System.out.println("Number is Even");
        } else { 
            System.out.println("Number is Odd");
        }
        sc.close();
    }
   
    static int check(int a) {

        if (a % 2 == 0) {
            return 1;
        } else { 
            return 0;
        }
    }
    
}

