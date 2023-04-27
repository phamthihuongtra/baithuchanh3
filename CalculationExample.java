package bthuchanh3;

import java.util.Scanner;

    // Tao lop CalculationExample
public class CalculationExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // yeu cau nguoi dung nhap vao 2 so
        System.out.println("Hãy nhập x: ");
        int x = scanner.nextInt();
        System.out.println("Hãy nhập y: ");
        int y = scanner.nextInt();
        CalculationExample calc = new CalculationExample();
        calc.calculate(x, y);


    }


    private void calculate(int x, int y) {
        // thuc hien phep toan tuong ung voi ky tu nhap vao
        try {
            int a = x + y;
            int b = x - y;
            int c = x * y;
            int d = x / y;
            System.out.println("Tổng x + y = " + a);
            System.out.println("Hiệu x - y = " + b);
            System.out.println("Tích x * y = " + c);
            System.out.println("Thương x / y = " + d);
        } catch (Exception e) {
            // neu nguoi dung nhap vao ky tu khong hop le , hien thithong bao loi
            System.err.println("Xảy ra ngoại lệ: " + e.getMessage());
        }
    }
}

