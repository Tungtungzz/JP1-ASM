public class Triangle {
    // Các thuộc tính (3 cạnh của tam giác)
    private double side1;
    private double side2;
    private double side3;

    // Constructor mặc định
    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    // Constructor có tham số
    public Triangle(double side1, double side2, double side3) {
        if (isValidTriangle(side1, side2, side3)) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else {
            throw new IllegalArgumentException("Ba cạnh không hợp lệ, không thể tạo thành tam giác!");
        }
    }

    // Getter và Setter
    public double getSide1() {
        return side1;
    }

    public void setSide1(double side1) {
        if (side1 <= 0) {
            throw new IllegalArgumentException("Độ dài cạnh phải lớn hơn 0!");
        }
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        if (side2 <= 0) {
            throw new IllegalArgumentException("Độ dài cạnh phải lớn hơn 0!");
        }
        this.side2 = side2;
    }

    public double getSide3() {
        return side3;
    }

    public void setSide3(double side3) {
        if (side3 <= 0) {
            throw new IllegalArgumentException("Độ dài cạnh phải lớn hơn 0!");
        }
        this.side3 = side3;
    }

    // Phương thức kiểm tra tam giác hợp lệ
    private boolean isValidTriangle(double a, double b, double c) {
        return (a + b > c) && (a + c > b) && (b + c > a);
    }

    // Phương thức tính chu vi
    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }

    // Phương thức tính diện tích (theo công thức Heron)
    public double calculateArea() {
        double s = calculatePerimeter() / 2; // nửa chu vi
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
}
