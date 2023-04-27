package bthuchanh3;

import java.util.Random;

  // tao lop ArrayExample
public class ArrayExample {
    // tao phuong thuc createrandom tra ve mang so nguyen ngau nhien tu 0-100
    public Integer[] createRandom() {
        Random rd = new Random();
        Integer[] arr = new Integer[100];
        System.out.println("danh sach phan tu");

        // su dung for de duyet mang va de nhap

        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
        }
        return arr;
    }
}
