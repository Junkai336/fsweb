package A1013.abc;

import org.w3c.dom.css.Rect;

// 인터페이스는 추상메서드만을 정의
// 다중 상속이 가능
interface Shape {
    // public abstract double getArea(); 생략가능 public abstract
    double getArea();

    void display();
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public void display() {
        System.out.println("사각형의 면적: " + getArea());
    }
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public void display() {
        System.out.println("원의 면적: " + getArea());
    }

}

public class interfaceExample {
    public static void main(String[] args) {
        // Circle 객체 생성
        Circle circle = new Circle(5.0);
        circle.display(); // 인터페이스 메서드 호출

        // Rectangle 객체 생성
        Rectangle rectangle = new Rectangle(4.0, 5.0);
        rectangle.display();

    }
}
