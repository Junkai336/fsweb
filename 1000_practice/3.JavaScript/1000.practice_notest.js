// 바꿀내용 드래그 + ctrl h = ctrl d d d d


// 01_where

/* 
    한줄 주석: ctrl /
    여러줄 주석: shift alt a

    자바스크립트 코드 입력
        - 대소문자 구분
        - 문장 끝에 세미콜론(;)
        - 문자열은 작은따옴표('') , 큰따옴표("")


    외부 스크립트
        - head나 body 태그 사이 기록 가능
        - <script src="../js/sub4.js"></script>

    내부 스크립트
        - head 태그 사이 기록
        <script>
        document.write('javascript';)
        </script>

    인라인 스크립트
        - HTML 속성 값 으로 표시
        - <h1 onclick="document.write('Hello');">문자</h1>
        - <html태그 이벤트속성="함수();">ㅁㅁㅁ</html태그>
*/

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 02_output

/* 
    이벤트(event)
        - 사용자의 마우스, 키보드 사용으로 인한 인터액티브 효과
        마우스
            - click, dblclick, mousemove, mouseover, mouseout
        
        키보드
            - keydown, keyup

                keydown : 사용자가 처음 키를 눌렀을 때 (현재 눌린 문자는 관련 x)
                keyup : 키를 땔 때

        창
            - resize, scroll
*/

/* 
    id, class, 태그 선택
        - getElementById('아이디명)    
        - getElementsByClassName('클래스명)      Element"s"
        - getElementsByTagName('태그명)

    선택자 선택
        - querySelector('선택자')
        - querySelectorAll('선택자들')
*/

// window가 앞에 붙어있는 것은 생략할 수 있다.
// js에서는 단어를 .으로 구분한다.

/* 
    출력
        - window.alert()
        - document.write()
        - console.log()
        - window.confirm()
    
    입력
        - window.prompt()

*/

/* 
    객체.메소드.
    
    객체: window, document, console ...
    메소드: alert, write, log

    객체.객체.속성
    요소.style.fontSize = "20px";

    객체.메소드().객체.속성
    document.querySelector('#a').style.BackgroundColor = "blue";
*/

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 03_var

/* 
    객체(Object), 메소드(Method), 속성(Property)
    자바스크립트 명령어는 마침표(.)으로 구분

    프론트엔드 자바스크립트 활용
    - HTML 태그, 속성, 내용 변경
    - CSS 속성 변경

    HTML 속성 변경
    요소.속성 = "값";

    CSS 속성 변경
    요소.style.CSS속성 = "값";



    변수(Variables)
        - 변하는 데이터(값)를 저장할 수 있는 메모리 공간
        - 한 개의 데이터만 저장 가능
        - 새로운 데이터 들어오면 기존 데이터 삭제

    변수 선언
    var 변수명;
    var 변수명 = 값;

    변수명은 예약어(true,false,var,for...)로 지정 x

    a = b 할 때 오른쪽에서 왼쪽으로 값 넣어주는 거임

*/

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 4.datatypes

/* 

    데이터 유형
        a. 기본
            - string: '문자열' 또는 "문자열"
            - number: 숫자(100, -1, 3.14, ...)
            - boolean: true(참,1), false(거짓,0)
            - undefined : 변수에 값이 등록되기 전의 기본값 (선언 후 할당하지 않은 값)
        b. 복합
            - object : 객체
                    a. Array(배열), Date(날짜), Math(수학)
                    b. String, Number, Boolean
                    c. 값: Null: 변수에 저장된 데이터를 비우고자 사용 (빈 값)

    Boolean() 함수는 0, null, undefined, 빈문자('') 제외 true로 반환
    
    .write() 내부에서 HTML을 문자열로 인식한다. (<br><img><title> 같은 HTML 태그 추가 됨)

    벡틱(``) : 문자열 ''를 붙이지 않아도 됨 변수는 ${변수} ${표현식} 등으로 표현 for문에서 ${i번째숫자} 가능
*/


// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 5.operator

/* 
    연산자
        - 산술, 대입, 비교, 논리, 조건

    산술 연산자
        문자열 연결 연산자: +
            숫자 + 숫자 -> 숫자
            숫자 + 문자열 -> 문자열
            문자열 + 문자열 -> 문자열
            1 + '2' + 3 -> 123

        ++ (1씩 증가)
        -- (1씩 감소)

        var A = ++B : B값을 1 증가 후 A에 대입 (일단 B값 1 증가)
        var A = B++ : B를 A에 대입 후 B값을 1 증가 (모든 연산 후 B값 1 증가)

*/

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ