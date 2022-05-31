// SUBSET OF ARRAY

package com.company;

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

}