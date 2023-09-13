// 햄버거메뉴 변수 정의
const div = document.querySelectorAll('div')
const hamburger = document.querySelector('.hamburger')
const subP = document.querySelector('.hamburger_p')
const subPList = document.querySelectorAll('.hamburger_p > p')
const hamburgerSub = document.querySelector('.hamburger_sub')

// console.log(div);
// console.log(subPList);

// 햄버거메뉴 함수호출
let z = 1;

subP.onclick = function () {
    if (z === 1) {
        hamOpen();
        z++;
    } else if (z === 2) {
        hamClose();
        z--;
    }
}

// 햄버거메뉴 함수정의
function hamOpen() {
    hamburgerSub.style.left = "-135px";
    subP.style.color = '#fff';
    hamburgerSub.style.transition = ".5s";
    subPList[0].style.rotate = "-45deg";
    subPList[0].style.transition = ".3s";
    subPList[0].style.transformOrigin = "right bottom";
    subPList[1].style.opacity = "0";
    subPList[1].style.transition = ".3s";
    subPList[2].style.rotate = "45deg";
    subPList[2].style.transition = ".3s";
    subPList[2].style.transformOrigin = "right bottom";
}

function hamClose() {
    hamburgerSub.style.left = "135px";
    subP.style.color = '#000';
    hamburgerSub.style.transition = ".5s";
    subPList[0].style.rotate = "0deg";
    subPList[1].style.opacity = "1";
    subPList[2].style.rotate = "0deg";
}

// 캐로셀

// 이미지 3개만 통제.

// 변수 정의
const slideImg = document.querySelectorAll('.slide_box img')
const indi = document.querySelectorAll('.indi li')
const prev = document.querySelector('#prev')
const next = document.querySelector('#next')
const repeat = document.querySelector('#repeatrepeatrepeat')

// console.log(slideImg);
// console.log(indi);

// 함수 정의
function i1() {
    // slideImg[0].zIndex = "10"
    // slideImg[1].zIndex = "10"
    // slideImg[2].zIndex = "-10"
    slideImg[0].style.left = "-100%"
    slideImg[1].style.left = "0%"
    slideImg[2].style.left = "100%"
    slideImg[0].rotate = "90deg"
    
}
function i2() {
    // slideImg[1].zIndex = "10"
    // slideImg[2].zIndex = "10"
    // slideImg[0].zIndex = "-10"
    slideImg[0].backgroundColor = "red"
    slideImg[1].style.left = "-100%"
    slideImg[2].style.left = "0%"
    slideImg[0].style.left = "100%"
}
function i3() {
    // slideImg[2].zIndex = "10"
    // slideImg[0].zIndex = "10"
    // slideImg[1].zIndex = "-10"
    slideImg[2].style.left = "-100%"
    slideImg[0].style.left = "0%"
    slideImg[1].style.left = "100%"
}

let i = 1

// 함수 호출

// 인디케이터 (잘못쓴거같음) (3번 누르고 next 누르면 2번으로 감?)
indi[0].onclick = function () {
    i3();
    i = 1
}
indi[1].onclick = function () {
    i1();
    i = 2
}
indi[2].onclick = function () {
    i2();
    i = 3
}

// prev next
prev.onclick = function () {
    if (i === 1) {
        i2();
        i++
    } else if (i === 2) {
        i1();
        i++
    } else if (i === 3) {
        i3();
        i++
    } else if (i > 3) {
        i = 1
        i2();
        i++

    }
}
next.onclick = function () {
    if (i === 1) {
        i1();
        i++
    } else if (i === 2) {
        i2();
        i++
    } else if (i === 3) {
        i3();
        i++
    } else if (i > 3) {
        i = 1
        i1();
        i++
    }
}

// 자동 슬라이드

let x = 1;

repeat.onclick = function () {
    if (x === 1) {
        x = 0
    } else if (x === 0) {
        x = 1
    }
}


setInterval(moveSlide, 3000);

function moveSlide() {
    if (x === 0) {
        if (i === 1) {
            i1();
            i++
        } else if (i === 2) {
            i2();
            i++
        } else if (i === 3) {
            i3();
            i++
    } else if (i > 3) {
       i = 1;
       i1();
       i++
    }
}
}