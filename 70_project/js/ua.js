/* 
    반응형(Responsive)
    적응형(Adaptive)
    https://www.naver.com/
    https://m.naver.com/

    screen: 사용자의 모니터 정보 제공
    location: 사용자의 현재 URL에 대한 정보와 새로 고침 메서드 제공
    navigator: 사용자의 브라우저와 운영체제 정보 제공
    
    screen.width: 화면 너빗값
    screen.height: 화면 높잇값

    [html의 a태그와 비슷]
    location.href = 'url'; -> 지정한 url로 위치 이동
    location.reload(); -> 브라우저 새로 고침

    
    웹사이트 개발
    홈페이지 -> 브라우저의 시작 페이지로 설정해 놓은 페이지
    웹페이지 -> 홈페이지 ,메인페이지, 서브페이지
    포털사이트
    메인페이지
    서브페이지
    특정 사이트의 홈페이지 -> 메인 페이지 -> index.html
    https://id.dothome.co.kr/index.html
    https://id.dothome.co.kr/


    url(uniform resource locator) : 프로토콜://호스트:포트/경로?매개변수#부분식별자
                                    https://news.naver.com/main/main.naver?mode=LSD&mid=shm&sid1=105

    도메인(domain): www.naver.com
    ip(아이피): 223.130.195.200
    ipv4 -> ipv6

    navigator.userAgent;
        - 기본 플랫폼
        - 운영체제 정보
        - 사용중인 브라우저의 엔진 이름
        - 사용 중인 브라우저 이름
        - 같은 엔진을 사용 중이며 호환 가능한 다른 브라우저
*/

/* 
    String(문자열) 객체
        문자열a.indexOf('문자열b') ~ a에 b가 존재하면 색인 번호 출력, 아니면 음수(-1)
        출력, 아니면 -1
        문자열.toLowerCase() ~ 문자열을 소문자로 변환
*/

/* 
    http://bback.dothome.co.kr/index.html -> 데스크탑
    http://bback.dothome.co.kr/m/index.html -> 모바일

*/

const ua = navigator.userAgent.toLowerCase();



    if (ua.indexOf('window') > 0) {
        // ua에 window 문자열이 있으면 true, 데스크탑
        location.href = 'http://bback.dothome.co.kr/index.html';
    } else {
        location.href = 'http://bback.dothome.co.kr/m/index.html';
    }