
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

/*package com.company;

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
}*/

//------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Main{

    public static void barChart(int arr[],int n,int max){

        for(int j=max;j>=1;j--){

            for(int i=0;i<n;i++){

                if(j<=arr[i]){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n= size of array

        int arr[]=new int[n];
        // Enter elements of array
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        // Find max of array
        int max=arr[0];
        for(int i=0;i<n;i++){

            if(arr[i]>max){
                max=arr[i];
            }
        }

        barChart(arr,n,max);
    }
}*/

//------------------------------------------------------------------------------------------------------

// SUM OF ARRAY

/*package com.company;

import java.util.*;

public class Main{

    public static int arraySum(int arr1[],int arr2[],int n1,int n2){

        int ans=0;
        int carry=0;
        int power=1;
        int i=n1-1;
        int j=n2-1;

        while(i>=0 || j>=0 || carry!=0){

            if(i==-1){
                i=0;
                arr1[0]=0;
            }
            if(j==-1){
                j=0;
                arr2[0]=0;
            }
            int sum=arr1[i]+arr2[j]+carry;
            carry=sum/10;
            int temp=sum%10;
            ans+=(temp*power);
            power*=10;
            i--;
            j--;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt(); // n1=size of first array
        int n2=scn.nextInt(); // n2 =size of second array

        int arr1[]=new int[n1];
        int arr2[]=new int[n2];

        // input of first array
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        //input of second array
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int add=arraySum(arr1,arr2,n1,n2);
        System.out.println(add);
    }

}*/

//----------------------------------------------------------------------------------------

// sum of array

/*package com.company;

import java.util.*;

public class Main{

    public static void arraySum(int arr1[],int arr2[],int n1,int n2,int n3){

        int ans[]=new int[n3];
        int carry=0;
        int i=n1-1;
        int j=n2-1;
        int k=n3-1;

        while(i>=0 || j>=0 || carry!=0){

            if(i==-1){
                i=0;
                arr1[i]=0;
            }
            if(j==-1){
                j=0;
                arr2[j]=0;
            }

            int sum=arr1[i]+arr2[j]+carry;
            carry=sum/10;
            int temp=sum%10;
            ans[k]=temp;

            i--;
            j--;
            k--;
        }
        for(i=0;i<n3;i++){

            System.out.println(ans[i]);
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();  // n1 = size of first array
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt(); // n2 = size of second array
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        int n3=0;
        if(n1>n2){
            n3=n1+1;
        }
        if(n2>n1){
            n3=n2+1;
        }
        arraySum(arr1,arr2,n1,n2,n3);
    }
}*/

//---------------------------------------------------------------------------------

// SUBTRACTION OF ARRAYS

/*package com.company;

import java.util.*;

public class Main{

    public static void ararySubtraction(int arr1[],int arr2[],int n1,int n2){

        //  n2>n1
        int i=n1-1;
        int j=n2-1;
        int k=n2-1;
        int carry=0;
        int ans[]=new int[n2];

        while(carry!=0 || i>=0 || j>=0 ){

            if(i==-1){
                i=0;
                arr1[i]=0;
            }

            int sub=arr2[j]-arr1[i]+carry;
            carry=0;

            if(sub<0){
                sub=sub+10;
                ans[k]=sub;
                carry--;
            }
            else{
                ans[k]=sub;
            }

            i--;
            j--;
            k--;

        }

        for(int p=0;p<n2;p++){

            if(p==0 && ans[p]==0){
                // do nothing
            }
            else{
                System.out.println(ans[p]);
            }
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n1=scn.nextInt();  // n1 = size of 1st array
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){
            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();  // n2 = size of 2nd array
        int arr2[]=new int[n2];
        for(int i=0;i<n2;i++){
            arr2[i]=scn.nextInt();
        }

        ararySubtraction(arr1,arr2,n1,n2);
    }
}*/

//----------------------------------------------------------------------------

// REVERSEING AN ARRAY

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void reverse(int arr[],int n){

        int j=n-1;
        for(int i=0;i<n/2;i++){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j--;
        }
        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        reverse(arr,n);
    }
}*/

//---------------------------------------------------------------------------------------------

// FINDING ELELMENT IN AN ARRAY

package com.company;

import java.util.*;

public class Main{

    public static int findElement(int a[],int d){

        int temp=-1;
        for(int i=0;i<a.length;i++){
            if(a[i]==d){
                temp=i;
            }
        }
        if(temp==-1){

           temp=-1;
        }
        return temp;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int a[]=new int[size];
        for(int i=0;i<size;i++){
            a[i]=scn.nextInt();
        }
        int d=scn.nextInt();

        System.out.println(findElement(a,d));
    }

}



