package A1016.a365;

interface InterfaceA {
    // 추상 메소드
    void methodA();
}

interface InterfaceB {
    // 추상 메소드
    void methodB();
}

interface InterfaceC extends InterfaceA, InterfaceB {
    // 추상 메소드
    void methodC();
}

class InterfaceCImpl implements InterfaceC {
    public void methodA() {
        System.out.println("InterfaceCimpl-methodA() 실행");
    }

    public void methodB() {
        System.out.println("InterfaceCimpl-methodB() 실행");
    }

    public void methodC() {
        System.out.println("InterfaceCimpl-methodC() 실행");
    }
}

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        System.out.println();
        
        InterfaceB ib = impl;
        ib.methodB();
        System.out.println();
        
        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
        System.out.println();



    }
}