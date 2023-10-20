


// 섹션6



// 퀵메뉴
const quickMenu = document.querySelector('.quick_menu')

// 스크롤 했을 때 높이값 (스크롤바 위가 기준)
window.addEventListener('scroll', function () {
    let scrollY = this.scrollY;
    console.log(this.scrollY);
    quickMenu.style.top = `${window.scrollY + 350}px`;
});



// 팝업창
const advertise = document.querySelector('.advertise')
const advertiseDrag = document.querySelector('.drag')
const advertiseClose = document.querySelectorAll('.advertise > button')

/* ******** */
// 24시간동안 보지 않기
/* ******** */
advertiseClose[0].addEventListener('click', function () {
    advertise.classList.remove('on');
});

// 닫기
advertiseClose[1].addEventListener('click', function () {
    advertise.classList.remove('on');
});

/* ******** */
// 팝업창 끌기
/* ******** */

// 나중에

advertise.addEventListener('mousedown', function () {
    // 클래스로 position:absolute 추가
    advertise.classList.add('drag');
});

document.addEventListener('mouseup', function () {
    advertise.classList.remove('drag');
});

document.addEventListener('mousemove', function (e) {
    if (advertise.classList.contains('drag')) {
        // 마우스 위치
        let mouseX = e.clientX;
        let mouseY = e.clientY;

        
        console.log("ad" + advertise.clientWidth);
        console.log("ad" + advertise.clientHeight);

        advertise.style.left = `${mouseX - (advertise.clientLeft)}px`;
        advertise.style.top = `${mouseY - (advertise.clientTop)}px`;

        // console.log(mouseX);
        // console.log(mouseY);
    }
});



// 섹션 지정
const sectionWrap2 = document.querySelector('.s2_wrap')
const sectionWrap3 = document.querySelector('.s3_wrap')
const sectionWrap4 = document.querySelector('.s4_wrap')
const sectionWrap5 = document.querySelector('.s5_wrap')
const sectionWrap6 = document.querySelector('.s6_wrap')


const footer = document.querySelector('#footer')

// 확인
// console.log(document.body.offsetHeight);