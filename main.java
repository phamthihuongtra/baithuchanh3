package bthuchanh3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

      // khoi tao doi tuong
    ArrayExample arrayExample = new ArrayExample();
    Integer[] arr = arrayExample.createRandom();
    Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chi so");
    int x = scanner.nextInt();
    try {
        // tim gia tri phan tu trong mang dua trenchi so nguoi dung nhap vao
        System.out.println("gia tri cua chi so 5" + x + " la " + arr[x]);
    } catch (IndexOutOfBoundsException e) {
        // neu chi so vuot qua gioi han cua mang , hien thi thong bao loi
        System.out.println("chi so vuot qua gioi han ");
    }
}
    }
