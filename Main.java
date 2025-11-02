import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println( "Enter 7 numbers: ");
        System.out.print("Enter num 1:");
        int num1 = input.nextInt();
        System.out.print("Enter num 2:");
        int num2 = input.nextInt();
        System.out.print("Enter num 3:");
        int num3 = input.nextInt();
        System.out.print("Enter num 4:");
        int num4 = input.nextInt();
        System.out.print("Enter num 5:");
        int num5 = input.nextInt();
        System.out.print("Enter num 6:");
        int num6 = input.nextInt();
        System.out.print("Enter num 7:");
        int num7 = input.nextInt();



        int[] arr = {num1 ,num2 ,num3 ,num4 ,num5 ,num6 ,num7 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
        }

    }
}