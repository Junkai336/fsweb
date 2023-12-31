package A1017;

public class Math2 {
    public static void main(String[] args) {
        System.out.println("abs");
        System.out.println(Math.abs(10));
        System.out.println(Math.abs(-10));
        System.out.println(Math.abs(-3.14));
        
        System.out.println("ceil");
        System.out.println(Math.ceil(10.0));
        System.out.println(Math.ceil(10.1));
        System.out.println(Math.ceil(10.000001));
        System.out.println(Math.ceil(10.666));
        
        System.out.println("floor");
        System.out.println(Math.floor(10.0));
        System.out.println(Math.floor(10.9));
        
        System.out.println("round");
        System.out.println(Math.round(10.0));
        System.out.println(Math.round(10.4));
        System.out.println(Math.round(10.5));

        System.out.println("max min");
        System.out.println(Math.max(3.14, 3.14159));
        System.out.println(Math.min(3.14, 3.14159));
        System.out.println(Math.max(-10, -11));
        System.out.println(Math.min(-10, -11));
        
        System.out.println("pow sqrt");
        System.out.println((int)Math.pow(5, 2));
        System.out.println((int)Math.sqrt(25));
        
        System.out.println("사인 코사인 탄젠트");
        System.out.println(Math.sin(Math.PI / 6));
        System.out.println(Math.tan(Math.toRadians(45)));
        
        System.out.println(Math.tan(Math.PI / 4));
        
        System.out.println(Math.cos(Math.toRadians(60)));
        
        System.out.println(Math.cos(Math.PI / 3));



    }
}
