import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check whether it's Even or Odd");
        int a = sc.nextInt();

        if (a % 2 == 0)
            System.out.println(a + " is an even number.");
        else
            System.out.println(a + " is an odd number.");
        sc.close();
    }
}