package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập size mảng: ");
        int size = sc.nextInt();

        int[] arr = new int[size];
        int i = 0;
        while (i < arr.length) {
            System.out.print("Nhập phần tử " + i);
            arr[i] = sc.nextInt();
            i++;
        }
        System.out.println("mảng được nhập");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + "\t");
        }

        System.out.println("Nhập vị trí cần thêm");
        int index = sc.nextInt();
        System.out.println("Nhập giá tị cần thêm");
        int value = sc.nextInt();

        int[] newArr = themPhantu(index, arr, value);

        System.out.println("Hiển thị mảng sau được thêm phần tử mới");

        for (int j = 0; j < newArr.length; j++){
            System.out.print(newArr[j] + "\t");
        }

    }

    public static int[] themPhantu(int index, int[] arr, int value) {
        int[]newArr = new int[arr.length+1];
        for (int i = 0; i < newArr.length; i++) {

            if (i < index) {
                newArr[i] = arr[i];
            }
            else if (i == index) {
                newArr [i] = value;
            }
            else {
                newArr[i] = arr[i-1];
            }
        }
        return newArr;
    }

}