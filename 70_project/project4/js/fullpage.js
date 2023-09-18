
const docEle = document.documentElement;
const sec = document.querySelectorAll('.sec');
const wh = window.innerHeight;


for (let i = 0; i < sec.length; i++) {
    sec[i].onwheel = (e) => {
        // 기본이벤트방지
        e.preventDefault();
        if (e.deltaY > 0) {
            // 마우스 휠 내림
            if (docEle.scrollTop > wh * (sec.length - 2) + 100) return;
            let next = e.currentTarget.nextElementSibling.offsetTop;
            docEle.scrollTop = next;
        } else {
            // 마우스 휠 올림
            // html의 스크롤 값이 창의 높이보다 작으면 wheel 이벤트를 반환(빠져나온다.)(멈춘다.)
            /* 
            try ~ catch 구문 예외처리

            try {
                정상 코드;
            } catch(err) {
                에러일 때 코드;
            } finally {
                무조건 실행할 코드;
            }
            */

            try {
                let prev = e.currentTarget.previousElementSibling.offsetTop;
                docEle.scrollTop = prev;
            } catch(err) {
                alert('끝까지 올라왔습니다.');
            }

            // if (docEle.scrollTop < wh) return;
        }
    };
}