package com.example.demo;

public class Arrays {
    public static void main(String[] args) {
        //single dimensiona array int arr[]=new int[10];
        int array[]={1,2,3,4,56,7,8,9,6,54,6};
        for (int i : array) {
           // System.out.println(i);
        }

        //two dimensional array
        /*
        int arr[][]={
            {1,2,3,4},
            {4,5,6,7},
            {8,9,10,11}
        };
        for(int j=0;j<arr.length;j++)
        {
            for(int i=0;i<arr[0].length;i++)
            {
                System.out.println(arr[j][i]);
            }System.out.println('\n');
        }
        */
        //non uniform shape
        int arr2[][]={
            {1,2,3},
            {4,5,6,7},
            {8,9,10,11,13}
        };
        for (int[] is : arr2) {
            for (int i : is) {
                System.out.println(i);
            }System.out.println('\n');
        }
        /* 
        for(int j=0;j<arr2.length;j++)
        {
            for(int i=0;i<arr2[j].length;i++)
            {
                System.out.println(arr2[j][i]);
            }System.out.println('\n');
        }*/
    }
}
