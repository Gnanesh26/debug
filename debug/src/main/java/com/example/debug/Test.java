package com.example.debug;

public class Test {
    public static void main(String[] args) {
        System.out.println("Learning Debugging");
        int myarr[] = {1, 2, 3, 4};
        int sum = getsum(myarr);
        System.out.println("sum= " + sum);

    }


    public static int getsum(int arr[]) {
        int s = 0;
        for (int i = 0; i < arr.length; i++) {
            s = s + arr[i];
        }
        s = s + 1;
        return s;
    }

}
