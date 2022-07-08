// SUBSET OF ARRAY

/*package com.company;

import java.util.*;

public class Revision {

    public static int decimalToBinary(int k){

        int ans=0;
        int power=1;

        while(k!=0){

            int remainder=k%2;
            ans=ans+(remainder*power);
            power=power*10;
            k=k/2;
        }
        return ans;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        int ts=(int)Math.pow(2,n);

        for(int i=0;i<ts;i++){

            int bn=decimalToBinary(i);
            int pwr=(int)Math.pow(10,n-1);

            for(int j=0;j<arr.length;j++){

                int qt=bn/pwr;

                if(qt==1){

                    System.out.print(arr[j]+"\t");
                }
                else{

                    System.out.print("-\t");
                }
                bn=bn%pwr;
                pwr=pwr/10;
            }
            System.out.println();
        }

    }

}*/

//--------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Revision{

    public static int findMax(int arr[]){

        int max=arr[0];
        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){

                max=arr[i];
            }
        }
        return max;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        int maximum=findMax(arr);

        for(int j=maximum;j>=1;j--){

            for(int i=0;i<arr.length;i++){

                if(j>arr[i]){

                    System.out.print("\t");
                }

                else{

                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }

}*/

//-----------------------------------------------------------------------------------------------------

// SUM OF TWO ARRAYS

/*package com.company;

import java.util.*;

public class Revision{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);

        int n1=scn.nextInt();
        int arr1[]=new int[n1];
        for(int i=0;i<n1;i++){

            arr1[i]=scn.nextInt();
        }

        int n2=scn.nextInt();
        int arr2[]=new int[n2];
        for(int j=0;j<n2;j++){

            arr2[j]=scn.nextInt();
        }

        int n3=Math.max(n1,n2)+1;
        int arr3[]=new int[n3];
        int carry=0;
        int i=arr1.length-1;
        int j=arr2.length-1;
        int k=n3-1;

        while(k>=0){

            int sum=0;
            if(i>=0){

                sum=sum+arr1[i];
            }
            if(j>=0){

                sum=sum+arr2[j];
            }

            sum=sum+carry;

            int ans=sum%10;
            carry=sum/10;

            arr3[k]=ans;
            k--;
            i--;
            j--;

        }
        for(int m=0;m<n3;m++){

            if(m==0 && arr3[m]==0){
                // do nothing
            }
            else{
                System.out.print(arr3[m]+" ");
            }
        }
    }

}*/

//-----------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.*;

public class Revision {

    public static int binarySearch(int arr[],int data){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid]==data){
                return mid;
            }
            else if(arr[mid]<data){
                left=mid+1;
            }
            else{
                right=mid-1;
            }
        }

        return -1;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        int data=scn.nextInt();
        int bs=binarySearch(arr,data);
        System.out.println(bs);
    }

}*/

//----------------------------------------------------------------------------------------------------

package com.company;

import java.util.Scanner;

public class Revision{

    public static void floorCeil(int arr[],int data){

        int floor=-1;
        int ceil=-1;
        int left=0;
        int right= arr.length-1;

        while(left<=right){

            int mid=(left+right)/2;

            if(arr[mid]==data){
                System.out.println(arr[mid]);
            }
            else if(arr[mid]>data){
                right=mid-1;
                ceil=mid;
            }
            else{
                left=mid+1;
                floor=mid;
            }
        }
        if(floor>=0){
            System.out.println(arr[floor]);
        }
        if(ceil>=0){
            System.out.println(arr[ceil]);
        }
        if(floor==-1){
            System.out.println(floor);
        }
        if(ceil==-1){
            System.out.println(ceil);
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();

        int arr[]=new int[n];
        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        int data=scn.nextInt();
        floorCeil(arr,data);
    }

}

