public class ch13 {
    
}

/* 
 * 
 * Object 타입
 *  - public Object 필드명;
 *  - 모든 클래스의 최상위 부모 클래스
 *  - 모든 객체는 부모 타입인 Object로 자동 타입 변환 되므로 Object 필드에는 어떤 객체든 대입이 가능하다.
 *  - 대입된 내용물 타입을 안다면 강제타입변환으로 내용물을 얻을 수 있다.
 * 
 * 제네릭
 *  - 결정되지 않은 타입을 파라미터로 처리하고, 실제 사용할 때 파라미터를 구체적인 타입으로 대체시키는 기능
 *  - public class 클래스명 <타입파라미터> {
 *      public 타입파라미터 필드명;
 * }
 *  - <타입파라미터> : 타입이 필요한 자리에 사용할 수 있음. 필드의 타입으로 사용. 타입파라미터의 타입은 모르지만, 객체가 생성될 시점에 다른 타입으로 대체된다.
 *                     타입파라미터의 내용물을 String으로 저장하고 싶다면, 클래스 생성시 타입파라미터 대신 String으로 대체하면 된다.
 *                     대문자 한글자로 표현한다.
 *  ex) 
 * public class Box <T> { public T content; }
 * Box<String> box = new Box<String>();
 * box.content = "문자열";
 * String content = box.content;
 * 
 * - 타입파라미터 T는 단지 이름일 뿐이기 때문에 A~Z까지 어떤 알파벳을 사용해도 된다.
 * - 타입파라미터를 대체하는 타입은 클래스 및 인터페이스다. (기본타입은 안되고 참조타입으로 하라는 뜻인듯 int 말고 Integer)
 * 
 * 제네릭 타입
 * - 결정되지 않은 타입을 파라미터로 가지는 클래스와 인터페이스
 * - public class 클래스명<A, B, ...> { ... }
 * - public interface 인터페이스명<A, B, ...> { ... }
 * - 외부에서 제네릭 타입을 사용하려면 타입 파라미터에 구체적인 타입을 지정해야 한다. (안하면 Object 타입)
 * - 인터페이스에 선언된 타입파타미터 <A> 를 구현객체가 implements 인터페이스<home> 이런 식으로 구현할 수 있음
 * 
 * 제네릭 메소드
 * - 타입 파라미터를 가지고 있는 메소드
 * - 타입 파라미터가 메소드 선언부에 정의된다. (리턴 타입 앞에 <> 기호 , 리턴타입과 매개변수타입에서 사용)
 * - public <A, B, ...> 리턴타입 메소드명() { ... }
 * ex)
 * - public static <T> Box<T> boxing(T t) {
 *   Box<T> box = new Box<T>();
 *   box.set(t)
 *   return box;
 * }
 *   Box<Integer> box1 = boxing(100);
 * 
 * 제한된 타입 파라미터
 * - 타입 파라미터의 구체적인 타입을 제한한다.
 * - 숫자를 연산할 경우 Number 또는 자식 클래스(Byte, Short, Integer, Long, Double) <- wrap클래스?
 * - 특정 타입과 자식 또는 구현 관계에 있는 타입만 대체할 수 있는 타입 파라미터
 * - public <T extends Number> boolean compare(T t1, T t2) {
 *  double v1 = t1.doubleValue();
 *  int v2 = t2.intValue();
 * }
 * - doubleValue는 Number에 정의되어 있는 메소드라고 함
 * - 어쨋든 Number로 지정했으면 숫자 관련으로 타입 제한
 * 
 * 
 * 와일드카드 타입 파라미터
 * -
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 */