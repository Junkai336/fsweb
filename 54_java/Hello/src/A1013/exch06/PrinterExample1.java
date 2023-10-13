package A1013.exch06;

class Printer {
    public static void println(int value) {
        System.out.println(value);
    }

    public static void println(boolean value) {
        System.out.println(value);
    }

    public static void println(double value) {
        System.out.println(value);
    }

    public static void println(String value) {
        System.out.println(value);
    }
}

public class PrinterExample1 {
    public static void main(String[] args) {
        // Printer printer = new Printer();
        Printer.println(10);
        Printer.println(true);
        Printer.println(5.7);
        Printer.println("홍길동");
    }
}
