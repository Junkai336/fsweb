


// 
// var lili = document.querySelectorAll(li);
// console.log(lili);

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
all_tab.addEventListener("click", ()=>{
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

notice_tab.addEventListener("click", ()=>{
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

news_tab.addEventListener("click", ()=>{
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

channel_tab.addEventListener("click", ()=>{
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


/* ******************************************************************************************************************************************************** */
/* ******************************************************************************************************************************************************** */
/* ******************************************************************************************************************************************************** */

/* 
    문제: 다른 탭에서 모달팝업창 안나옴
    왜?: 변수지정이 하나밖에 안돼서 그런듯 (중복 클래스가 있긴 함 근데 명칭은 다른데?)
    해결?: querySelectorAll , [0][1] 아이템리스트, consolelog로 순번 지정해서 ㄱㄱ
    흠: 함수 하나 만들어서 코드길이 줄이는 것도 생각. 안되면 강사님 찬스 ㄱㄱ
*/

// 모달팝업창 (여기 수정)

// 모달팝업창을 여는 게시글 선언
const check = document.querySelectorAll('.momo');
// 모달팝업창 여는 게시글 순번 확인
console.log(check);

// 모달팝업 박스와 창 선언
const modal_container = document.querySelector('.modal_container');
const modal_content = document.querySelectorAll('.momomo');
// 모답팝업"창" 순번 확인
console.log(modal_content);

// 모달팝업창 열기

mo1.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "block";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

mo2.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "none";
    modal2.style.display = "block";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

mo3.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "block";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

mo4.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "block";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

mo5.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "block";
    modal6.style.display = "none";
})

mo6.addEventListener("click", ()=>{
    modal0.style.display = "block";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "block";
})


// 모달팝업창 닫기

const modal_close = document.querySelector('#modal_close_a');
const modal_close2 = document.querySelector('#modal_close_b');
const modal_close3 = document.querySelector('#modal_close_c');
const modal_close4 = document.querySelector('#modal_close_d');
const modal_close5 = document.querySelector('#modal_close_e');
const modal_close6 = document.querySelector('#modal_close_f');

modal_close.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

modal_close2.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

modal_close3.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

modal_close4.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

modal_close5.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})

modal_close6.addEventListener("click", ()=>{
    modal0.style.display = "none";
    modal1.style.display = "none";
    modal2.style.display = "none";
    modal3.style.display = "none";
    modal4.style.display = "none";
    modal5.style.display = "none";
    modal6.style.display = "none";
})