package ArrayCodes;

import java.util.Scanner;

public class LargestSmallestElement {
    Scanner sc=new Scanner(System.in);
    int n;
    int []arr;

    void input(){
        System.out.println("Enter Size of an array: ");
        n=sc.nextInt();
        System.out.println("Enter elements of Array: ");
        arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt();

        }
    }

    void LargestElement(){
        int big=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>big){
                big=arr[i];
            }
        }
        System.out.println("Largest Element : " + big);
    }

    void SmallestElement(){
        int small=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<small){
                small=arr[i];
            }
        }
        System.out.println("Smallest Element : " + small);
    }

    public static void main(String[] args) {
        LargestSmallestElement obj=new LargestSmallestElement();
        obj.input();
        obj.LargestElement();
        obj.SmallestElement();
    }

}
