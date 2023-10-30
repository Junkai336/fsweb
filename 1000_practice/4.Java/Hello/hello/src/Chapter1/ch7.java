public class ch7 {
    
}

/* 
 * 상속
 *  - 부모 클래스의 필드와 메소드를 자식 클래스에게 물려주는 것
 *  - 이미 개발된 클래스를 재사용해서 새로운 클래스를 만들기 때문에 중복 코드를 줄인다.
 *  - 부모 클래스를 수정하면 모든 자식 클래스에 수정 효과를 가져온다.
 * 
 * 클래스 상속
 *  - public class 자식클래스명 extends 부모클래스명 {}
 *  - 자바는 다중 상속을 허용하지 않는다. extends 뒤에는 하나의 부모클래스만 와야 한다.
 * 
 * 부모 생성자 호출
 * - 부모있는 자식 객체 생성 -> 부모,자식 클래스 생성
 * - 모든 객체는 생성자를 호출해야만 생성된다.
 * - 자식 생성자 호출 시 숨겨져 있는 super()에 의해 부모 생성자가 호출된다.
 * - super() : 부모생성자 호출, 컴파일에서 자동 추가 (기본 생성자)
 * - super(매개값) : 부모에 매개변수를 갖는 생성자만 있다면 매개값의 타입과 개수가 일치하는 부모 생성자를 호출해야 한다.
 * public 자식클래스() {
 *  super() or super(매개값) or [super()]
 * }
 * 
 * 메소드 오버라이딩
 * - 부모클래스의 메소드가 자식클래스가 사용하기에 적합하지 않은 경우 재정의해서 사용할 수 있다.
 * - 규칙
 *  - 부모 메소드의 선언부(리턴타입, 메소드이름, 매개변수) 동일해야 한다.
 *  - 접근제한을 더 강하게 오버라이딩 할 수 없다.
 *  - 새로운 예외를 throws 할 수 없다.
 *  
 * @Override 
 *  - 어노테이션
 *  - 컴파일시 정확히 오버라이딩이 되었는지 체크해줌 (문제가 있다면 컴파일 에러 출력) 
 *  - 생략가능
 * 
 * super.method()
 *  - 재정의시, 부모 메소드는 숨겨지고 자식 메소드만 사용되기 때문에 부모 메소드의 일부만 변경된다 하더라도 중복된 내용을 자식 메소드도 가지고 있어야 한다.
 *    부모 메소드가 100줄의 코드를 가지고 있을 경우 자식 메소드에서 1줄만 추가하고 싶어도 100줄의 코드를 자식 메소드에서 다시 작성해야 한다.
 *  - 자식 메소드 내에서 숨겨진 부모 메소드를 호출한다.
 *  - 
 * 
 * 
 * 
 */