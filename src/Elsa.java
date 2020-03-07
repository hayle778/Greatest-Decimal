import java.util.Scanner;

public class Elsa {
public static void main(String[]args) {
   
   Scanner input = new Scanner (System.in);
  int a, b, c;
    System.out.println("Enter number 1:");
    a = input.nextInt();

    System.out.println("Enter number 2:");
    b = input.nextInt();

    System.out.println("Enter number 3:");
    c = input.nextInt();
    if(a > b&& a > c){
        System.out.println("the greatest number is A:");
    }
else if(b > a && b > c){
    System.out.println("The greatest number is B");
    }
else
    {
        System.out.println("The greatest number is C");
    }
}
}
