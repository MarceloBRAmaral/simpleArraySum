import java.util.Scanner;

public class SimpleArraySum {

    public static void main(String[] args) {

        int quantity;
        int numbers[]; //array declaration
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the quantity of numbers you want in the array: ");
        quantity = input.nextInt();
        numbers = new int[quantity]; //array allocation; you could declare and allocate in the same line
                                     //like this: int numbers[] = new int[4];
        for(int i=0;i<quantity;i++){
            System.out.printf("Enter the %dth number: ", i+1);
            numbers[i] = input.nextInt();
            sum += numbers[i];
        }

        //System.out.printf(sum);//this is the single output line code for hackerrank to work
        //more beautiful output display below
        System.out.printf("The sum of all the %d numbers is: %d %n", quantity, sum);
    }
}