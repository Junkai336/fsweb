
// 탭 버튼 정의
const all_tab = document.querySelector('.all_tab');
const notice_tab = document.querySelector('.notice_tab');
const news_tab = document.querySelector('.news_tab');
const channel_tab = document.querySelector('.channel_tab');

// 탭 창 정의
const all_tabtab = document.querySelector('.tab_all');
const notice_tabtab = document.querySelector('.tab_notice');
const news_tabtab = document.querySelector('.tab_news');
const channel_tabtab = document.querySelector('.tab_channel');

// 클릭 - 블록/가리기
all_tab.addEventListener("click", () => {
    all_tab.style.background = "#FFCE32";
    all_tab.style.fontWeight = "bold";
    notice_tab.style.background = "#ddd";
    notice_tab.style.fontWeight = "normal";
    news_tab.style.background = "#ddd";
    news_tab.style.fontWeight = "normal";
    channel_tab.style.background = "#ddd";
    channel_tab.style.fontWeight = "normal";
    all_tabtab.style.display = "flex";
    notice_tabtab.style.display = "none";
    news_tabtab.style.display = "none";
    channel_tabtab.style.display = "none";
})

notice_tab.addEventListener("click", () => {
    all_tab.style.background = "#ddd";
    all_tab.style.fontWeight = "normal";
    notice_tab.style.background = "#FFCE32";
    notice_tab.style.fontWeight = "bold";
    news_tab.style.background = "#ddd";
    news_tab.style.fontWeight = "normal";
    channel_tab.style.background = "#ddd";
    channel_tab.style.fontWeight = "normal";
    all_tabtab.style.display = "none";
    notice_tabtab.style.display = "flex";
    news_tabtab.style.display = "none";
    channel_tabtab.style.display = "none";
})

news_tab.addEventListener("click", () => {
    all_tab.style.background = "#ddd";
    all_tab.style.fontWeight = "normal";
    notice_tab.style.background = "#ddd";
    notice_tab.style.fontWeight = "normal";
    news_tab.style.background = "#FFCE32";
    news_tab.style.fontWeight = "bold";
    channel_tab.style.background = "#ddd";
    channel_tab.style.fontWeight = "normal";
    all_tabtab.style.display = "none";
    notice_tabtab.style.display = "none";
    news_tabtab.style.display = "flex";
    channel_tabtab.style.display = "none";
})

channel_tab.addEventListener("click", () => {
    all_tab.style.background = "#ddd";
    all_tab.style.fontWeight = "normal";
    notice_tab.style.background = "#ddd";
    notice_tab.style.fontWeight = "normal";
    news_tab.style.background = "#ddd";
    news_tab.style.fontWeight = "normal";
    channel_tab.style.background = "#FFCE32";
    channel_tab.style.fontWeight = "bold";
    all_tabtab.style.display = "none";
    notice_tabtab.style.display = "none";
    news_tabtab.style.display = "none";
    channel_tabtab.style.display = "flex";
})

/* 
    문제: 다른 탭에서 모달팝업창 안나옴
    왜?: 변수지정이 하나밖에 안돼서 그런듯 (중복 클래스가 있긴 함 근데 명칭은 다른데?)
    해결?: querySelectorAll , [0][1] 아이템리스트, consolelog로 순번 지정해서 ㄱㄱ
    흠: 함수 하나 만들어서 코드길이 줄이는 것도 생각.
*/

// 모달팝업창 (여기 수정)

// 모달팝업창을 여는 게시글 선언
const check = document.querySelectorAll('.momo');
// 모달팝업창 여는 게시글 순번 확인
// console.log(check);

// 모달팝업 박스와 창 선언
const modal_container = document.querySelector('.modal_container');
const modal_content = document.querySelectorAll('.momomo');
// 모답팝업"창" 순번 확인
// console.log(modal_content);

// 모달팝업창 열기

function check09() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "block";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "none";
}

function check110() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "block";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "none";
}

function check211() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "block";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "none";
}

function check36() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "block";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "none";
}

function check48() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "block";
    modal_content[5].style.display = "none";
}

function check57() {
    modal_container.style.display = "block";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "block";
}

check[0].addEventListener("click", () => {
    check09();
})

check[1].addEventListener("click", () => {
    check110();
})

check[2].addEventListener("click", () => {
    check211();
})

check[3].addEventListener("click", () => {
    check36();
})

check[4].addEventListener("click", () => {
    check48();
})

check[5].addEventListener("click", () => {
    check57();
})

check[6].addEventListener("click", () => {
    check36();
})

check[7].addEventListener("click", () => {
    check57();
})

check[8].addEventListener("click", () => {
    check48();
})

check[9].addEventListener("click", () => {
    check09();
})

check[10].addEventListener("click", () => {
    check110();
})

check[11].addEventListener("click", () => {
    check211();
})


// 모달팝업창 닫기

const modal_close = document.querySelector('#modal_close_a');
const modal_close2 = document.querySelector('#modal_close_b');
const modal_close3 = document.querySelector('#modal_close_c');
const modal_close4 = document.querySelector('#modal_close_d');
const modal_close5 = document.querySelector('#modal_close_e');
const modal_close6 = document.querySelector('#modal_close_f');

function modal_close_fn() {
    modal_container.style.display = "none";
    modal_content[0].style.display = "none";
    modal_content[1].style.display = "none";
    modal_content[2].style.display = "none";
    modal_content[3].style.display = "none";
    modal_content[4].style.display = "none";
    modal_content[5].style.display = "none";
}

// input은 class 안먹나?

modal_close.addEventListener("click", () => {
    modal_close_fn();
})
modal_close2.addEventListener("click", () => {
    modal_close_fn();
})
modal_close3.addEventListener("click", () => {
    modal_close_fn();
})
modal_close4.addEventListener("click", () => {
    modal_close_fn();
})
modal_close5.addEventListener("click", () => {
    modal_close_fn();
})
modal_close6.addEventListener("click", () => {
    modal_close_fn();
})

const docEle = document.documentElement;
const sm1 = document.querySelector('.text_box')
const sm2 = document.querySelector('.text_box h3')
const sm3 = document.querySelector('.text_box p')

window.onscroll = function () {
    let st = docEle.scrollTop;
    console.log(st);

    if (st < 280) {
        sm1.style.transform = 'translateX(-10px)';
        sm1.style.transition = '1.3s';
        sm1.style.opacity = '1';
        setTimeout(function(){
            sm2.style.transition = '1.3s';
            sm2.style.opacity = '1';
        }, 1300);  
        setTimeout(function(){
            sm3.style.transition = '1.3s';
            sm3.style.opacity = '1';
        }, 2300);  
    } else if (st > 290) {
        sm1.style.transform = 'translateX(-100px)';
        sm1.style.transition = '0.65s';
        sm1.style.opacity = '0';   
    }
}
// sm2.stopPropagation();