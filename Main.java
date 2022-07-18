
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

/*package com.company;

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

}*/

//-------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void printStar(int arr[]){

        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        for(int i=max;i>=1;i--){

            for(int j=0;j<arr.length;j++){

                if(i>arr[j]){
                    System.out.print("\t");
                }
                else{
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }

    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int size=scn.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=scn.nextInt();
        }
        printStar(arr);
    }
}*/

//-------------------------------------------------------------------------------------------------

// REVERSE AN ARRAY

/*package com.company;

import java.util.Scanner;

public class Main{

    public static void swap(int arr[]){

        int i=0;
        int j=arr.length-1;

        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){

            arr[i]=scn.nextInt();
        }

        swap(arr);

        for(int i=0;i<n;i++){

            System.out.print(arr[i]+" ");
        }
    }
}*/

//-------------------------------------------------------------------------------------------------

// ROTATE AN ARRAY
//(METHOD 1)

/*package com.company;

import java.util.*;

public class Main{

    public static void reverse1(int arr[]){

        int i=0;
        int j=arr.length-1;
        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void reverse2(int arr[],int k){

        int i=0;
        int j=k-1;
        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void reverse3(int arr[],int k){

        int i=k;
        int j=arr.length-1;
        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();     // n=size of array
        int arr[]=new int [n];

        for(int i=0;i<n;i++){    // Elements of array
            arr[i]=scn.nextInt();
        }

        int k=scn.nextInt();     // Elements to rotate

        reverse1(arr);
        reverse2(arr,k);
        reverse3(arr,k);

        for(int i=0;i<n;i++){
            System.out.println(arr[i]);
        }
    }

}*/

//-------------------------------------------------------------------------------------------------------

// ROTATE AN ARRAY
// METHOD 2

/*package com.company;

import java.util.*;

public class Main{

    public static void reverse(int arr[],int i,int j){

        while(i<j){

            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();  // n=size of array
        int arr[]=new int[n];

        for(int i=0;i<n;i++){    // input of array
            arr[i]=scn.nextInt();
        }

        int k=scn.nextInt();   // k=elements to rotate from last
        k%=n;
        if(k<0){
            k+=n;
        }
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);

        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }

    }

}*/

//-------------------------------------------------------------------------------------------------------

// INVESRE AN ARARY

/*package com.company;

import java.util.*;

public class Main{

    public static int[] inverseArray(int arr1[],int arr2[]){

        for(int i=0;i<arr1.length;i++){

            int k=arr1[i];
            arr2[k]=i;
        }
        return arr2;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();      // n=size of array
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        for(int i=0;i<n;i++){     // input of array1
            arr1[i]=scn.nextInt();
        }

        inverseArray(arr1,arr2);

        for(int i=0;i<n;i++){
            System.out.println(arr2[i]);
        }
    }
}*/

//-------------------------------------------------------------------------------------------------------

// SUB-ARRAY

/*package com.company;

import java.util.*;

public class Main{

    public static void subArrays(int arr[]){

        for(int si=0;si<arr.length;si++){

            for(int ei=si;ei<arr.length;ei++){

                for(int i=si;i<=ei;i++){
                    System.out.print(arr[i]+"\t");
                }
                System.out.println();
            }
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();      // n = size of array
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        subArrays(arr);
    }
}*/

//-------------------------------------------------------------------------------------------------------

// SUBSET OF ARRAY

/*package com.company;

import java.util.*;

public class Main{

    public static void susetOfArray(int arr[],int n){

        int ts=(int)Math.pow(2,n);

        for(int i=0;i<ts;i++){

            int k=i;
            int ans=0;
            int power=1;

            while(k!=0){

                int remainder=k%2;
                ans+=(remainder*power);
                power=power*10;
                k/=2;
            }

            int div=(int)Math.pow(10,n-1);
            for(int j=0;j<arr.length;j++){

                int res=ans/div;
                int finalAns=arr[j]*res;
                if(finalAns==0){
                    System.out.print("-\t");
                }
                else{
                    System.out.print(finalAns+"\t");
                }
                ans=ans%div;
                div/=10;
            }
            System.out.println();
        }

    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        susetOfArray(arr,n);
    }

}*/

//-------------------------------------------------------------------------------------------------------

// BINARY SEARCH WITH SORTED ARARY

/*package com.company;

import java.util.*;

public class Main{

    public static int binarySearch(int arr[],int data){

        int left=0;
        int right=arr.length-1;

        while(left<=right){

            int mid=(left+right)/2;

            if(data==arr[mid]){
                return mid;
            }
            else if(data<arr[mid]){
                right=mid-1;
            }
            else{
                left=mid+1;
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

} */
//-------------------------------------------------------------------------------------------------------

/*package com.company;

import java.util.Scanner;

public class Main{

    public static int floor_ceil(int arr[],int data) {

        int left = 0;
        int right = arr.length - 1;

        while (left<=right) {

            int mid=left+right/2;

            if (data==arr[mid]) {
                return arr[mid];
            }
            if(arr[mid]<data && arr[mid+1]>data) {
                System.out.println(arr[mid]);
                return arr[mid+1];
            }
            else if(arr[mid]>data && arr[mid-1]<data) {
                System.out.println(arr[mid]);
                return arr[mid-1];
            }
            else if(arr[mid]<data) {
                left=mid+1;
            }
            else {
                right=mid-1;
            }
        }
        return -1;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[]=new int [n];

        for(int i=0;i<n;i++){
            arr[i]=scn.nextInt();
        }

        int data=scn.nextInt();

        int fac=floor_ceil(arr,data);
        System.out.println(fac);
    }

}*/

//-------------------------------------------------------------------------------------------------------

// ARRAY TRANSPOSE

/*package com.company;

import java.util.*;

public class Main{

    public static int[][] arrayTranspose(int arr[][],int m,int n){

        for(int j=0;j<n;j++){
            for(int i=0;i<m;i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        return arr;
    }

    public static void originalArray(int arr[][],int m,int n){

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        originalArray(arr,m,n);
        int at[][]=arrayTranspose(arr,m,n);
    }
}*/

//-------------------------------------------------------------------------------------------------------

// STATE OF WAKANDA-I

/*package com.company;

import java.util.*;

public class Main{

    public static int[][] stateOfWakanda(int arr[][],int m,int n){

        for(int j=0;j<n;j++){
            if(j%2==0){
                for(int i=0;i<m;i++){
                    System.out.println(arr[i][j]);
                }

            }
            else{
                for(int i=m-1;i>=0;i--){
                    System.out.println(arr[i][j]);
                }
            }
        }
        return arr;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        int sow[][]=stateOfWakanda(arr,m,n);
    }
}*/

//-------------------------------------------------------------------------------------------------------

// SPIRAL

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int count=0;
        int rmin=0;
        int rmax=m;
        int cmin=0;
        int cmax=n;

        while(count<m*n){

            for(int i=rmin;i<=rmax-1 && count<m*n;i++){
                System.out.println(arr[i][cmin]);
                count++;
            }

            for(int i=cmin+1;i<=cmax-1 && count<m*n;i++){
                System.out.println(arr[rmax-1][i]);
                count++;
            }

            for(int i=rmax-2;i>=rmin && count<m*n;i--){
                System.out.println(arr[i][cmax-1]);
                count++;
            }

            for(int i=cmax-2;i>=cmin+1 && count<m*n;i--){
                System.out.println(arr[rmin][i]);
                count++;
            }

            rmax--;
            rmin++;
            cmin++;
            cmax--;
        }
    }

}*/

//------------------------------------------------------------------------------------------------------

// SPIRAL METHOD-II

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn = new Scanner(System.in);
        int m=scn.nextInt();
        int n=scn.nextInt();
        int arr[][]=new int[m][n];

        for (int i=0;i<m;i++) {
            for (int j=0;j<n;j++) {
                arr[i][j]=scn.nextInt();
            }
        }

        int count = 0;
        int rmin = 0;
        int rmax = m-1;
        int cmin = 0;
        int cmax = n-1;

        while (count<m*n){

            for (int row=rmin; row<=rmax && count<m*n; row++) {
                System.out.println(arr[row][cmin]);
                count++;
            }

            cmin++;

            for (int col = cmin; col<=cmax && count<m*n; col++) {
                System.out.println(arr[rmax][col]);
                count++;
            }

            rmax--;

            for (int row= rmax; row>=rmin && count<m*n; row--) {
                System.out.println(arr[row][cmax]);
                count++;
            }

            cmax--;

            for (int col=cmax; col>=cmin&& count<m*n; col--) {
                System.out.println(arr[rmin][col]);
                count++;
            }

            rmin++;
        }
    }

}*/

//------------------------------------------------------------------------------------------------------

// ROTATE AN ARRAY(m*n) BY 90 DEGREE

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();    // m=no. of rows
        int n=scn.nextInt();    // n=no.columns
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int j=0;j<n;j++){
            for(int i=m-1;i>=0;i--){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }

    }
}*/

//------------------------------------------------------------------------------------------------------

// ROTATE AN ARRAY(n*n) BY 90 DEGREE

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();    // n=no.columns
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=n-1;j>=0;j--){
                System.out.print(arr[j][i]+"\t");
            }
            System.out.println();
        }

    }
}*/

//------------------------------------------------------------------------------------------------------

// TRANSPOSE OF ARRAY(n*n)

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){

                arr[i][j]=scn.nextInt();
            }
        }

        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){

                int temp=arr[i][j];
                arr[i][j]=arr[j][i];
                arr[j][i]=temp;
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}*/

//Note : Here time complexity is O(n square by 2)

//------------------------------------------------------------------------------------------------------

// STATE OF WAKANDA II

/*package com.company;

import java.util.*;

public class Main{

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int up=0;
        int down=n-1;

        while(up<=down){

            int i=0;
            int j=up;
            while(j<n){
                System.out.println(arr[i][j]);
                i++;
                j++;
            }
            up++;
        }

    }
}*/

//------------------------------------------------------------------------------------------------------

// SADDLE PRICE

/*package com.company;

import java.util.*;

public class Main{

    public static void saddlePrice(int arr[][],int n){

        int col=0;
        for(int i=0;i<n;i++){

            int min=arr[i][0];
            for(int j=0;j<n;j++){
                if(arr[i][j]<min){
                    min=arr[i][j];
                    col=j;
                }
            }

            int max=arr[0][col];
            for(int k=0;k<n;k++){
                if(arr[k][col]>max){
                    max=arr[k][col];
                }
            }

            if(max==min){
                System.out.println(max);
                return;
            }
        }
        System.out.println("Invalid Input");
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int n=scn.nextInt();
        int arr[][]=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }
        saddlePrice(arr,n);
    }
}
*/
//------------------------------------------------------------------------------------------------------

// RING ROTATE

package com.company;

import java.util.*;

public class Main{

    public static int[] fill1DFrom2D(int arr[][],int s){

        int m= arr.length;
        int n=arr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=m-s;
        int cmax=n-s;

        int size=2*(rmax-rmin)+2*(cmax-cmin);
        int arr1D[]=new int[size];
        int index=0;

        for(int row=rmin;row<=rmax;row++){
            arr1D[index]=arr[row][cmin];
            index++;
        }
        cmin++;

        for(int col=cmin;col<=cmax;col++){
            arr1D[index]=arr[rmax][col];
            index++;
        }
        rmax--;

        for(int row=rmax;row>=rmin;row--){
            arr1D[index]=arr[row][cmax];
            index++;
        }
        cmax--;

        for(int col=cmax;col>=cmin;col--){
            arr1D[index]=arr[rmin][col];
            index++;
        }
        rmin++;

        return arr1D;
    }

    public static int[] reverse1D(int arr1D[],int left,int right){

        while(left<right){

            int temp=arr1D[left];
            arr1D[left]=arr1D[right];
            arr1D[right]=temp;
            left++;
            right--;
        }
        return arr1D;
    }

    public static void rotate(int arr1D[],int r){

        r=r%arr1D.length;

        if(r<0){
            r=r+arr1D.length;
        }

        arr1D=reverse1D(arr1D,0,arr1D.length-1);   //  reverse entire 1D array
        arr1D=reverse1D(arr1D,0,r-1);              //  reverse first r elements of 1D array
        arr1D=reverse1D(arr1D,r, arr1D.length-1);      //  reverse last (all -r) elements of 1D array
    }


    public static int[][] refilling2DArray(int arr[][],int arr1D[],int s){

        int m= arr.length;
        int n=arr[0].length;

        int rmin=s-1;
        int cmin=s-1;
        int rmax=m-s;
        int cmax=n-s;

        int index=0;

        for(int row=rmin;row<=rmax;row++){
            arr[row][cmin]=arr1D[index];
            index++;
        }
        cmin++;

        for(int col=cmin;col<=cmax;col++){
            arr[rmax][col]=arr1D[index];
            index++;
        }
        rmax--;

        for(int row=rmax;row>=rmin;row--){
            arr[row][cmax]=arr1D[index];
            index++;
        }
        cmax--;

        for(int col=cmax;col>=cmin;col--){
            arr[rmin][col]=arr1D[index];
            index++;
        }
        rmin++;

        return arr;
    }

    public static void main(String args[]){

        Scanner scn=new Scanner(System.in);
        int m=scn.nextInt();     //  m=no. of rows
        int n=scn.nextInt();     //  n=no. of coloumns
        int arr[][]=new int[m][n];

        for(int i=0;i<m;i++){             // taking input of 2D array
            for(int j=0;j<n;j++){
                arr[i][j]=scn.nextInt();
            }
        }

        int s=scn.nextInt();     //  s=shell number
        int r=scn.nextInt();     //  r=rotate number

        int[] arr1D=fill1DFrom2D(arr,s);  // filling 1D array
        rotate(arr1D,r);                  // rotate r elements
        refilling2DArray(arr,arr1D,s);    // refilling 2D array

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }

}



