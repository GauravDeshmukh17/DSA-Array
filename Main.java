/*package com.company;

public class Main {

    public static void main(String[] args) {

        int arr[]=new int[5];

        arr[0]=12;
        arr[1]=23;
        arr[2]=45;
        arr[3]=10;
        arr[4]=-15;

        for(int i=0;i<5;i++){

            System.out.print(arr[i]+" ");
        }
    }
}*/

//-------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        System.out.println("Enter the size of Array");
        int n=scn.nextInt();

        int arr[]=new int[n];

        System.out.println("Enter the elements of Array");
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        System.out.println("Elements of Array are :");
        for(int i=0;i<n;i++){

            System.out.print(arr[i]+"  ");
        }

    }

}*/

//--------------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int max=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        int min=arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
        }

        int diff=max-min;
        System.out.println(diff);
    }
}*/

//---------------------------------------------------------------------------------

package com.company;

import java.util.*;

public class Main{

    public static void searchElement(int[] arr, int n, int d){

        int temp=-1;
        for(int i=0;i<n;i++){
            if(arr[i]==d){
                System.out.println(i);
                temp=0;
            }
        }
        if(temp==-1){
            System.out.println(temp);
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }
        int d=scn.nextInt();

        searchElement(arr,n,d);
    }
}

//------------------------------------------------------------------------------

