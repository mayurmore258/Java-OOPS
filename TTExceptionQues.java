package Basics;

import java.util.*;

public class TTExceptionQues {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter 2 numbers and give size of array");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z=0;
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        try{
            z = x/y;
            System.out.println(arr[5]);
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        System.out.println("Value of z is "+z);
    }
}
