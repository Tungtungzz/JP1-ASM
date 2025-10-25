import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Chương trình tính thông tin tam giác ===");
        try {
            // Nhập 3 cạnh từ bàn phím
            System.out.print("Nhập cạnh thứ nhất: ");
            double a = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ hai: ");
            double b = scanner.nextDouble();

            System.out.print("Nhập cạnh thứ ba: ");
            double c = scanner.nextDouble();

            // Tạo đối tượng tam giác
            Triangle triangle = new Triangle(a, b, c);

            // Tính chu vi và diện tích
            double perimeter = triangle.calculatePerimeter();
            double area = triangle.calculateArea();

            // In kết quả
            System.out.printf("Chu vi tam giác: %.2f%n", perimeter);
            System.out.printf("Diện tích tam giác: %.2f%n", area);

        } catch (IllegalArgumentException e) {
            System.out.println("Lỗi: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Đầu vào không hợp lệ. Vui lòng nhập lại!");
        }

        scanner.close();
    }
}
