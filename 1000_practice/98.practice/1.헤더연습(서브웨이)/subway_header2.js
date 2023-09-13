// 햄버거메뉴 변수 정의
const div = document.querySelectorAll('div')
const hamburger = document.querySelector('.hamburger')
<<<<<<< Updated upstream:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header.js
const subP = document.querySelector('.hamburger_p')
const subPList = document.querySelectorAll('.hamburger_p > p')
const hamburgerSub = document.querySelector('.hamburger_sub')

// console.log(div);
// console.log(subPList);

// 햄버거메뉴 함수호출
let z = 1;
=======
const hamburgerSub = document.querySelector('.hamburger_sub')
const subp = document.querySelectorAll('.hamburger p');

console.log(depth1);
console.log(div);
console.log(subp);

// 햄버거 메뉴 열기 닫기
let i = 1;
>>>>>>> Stashed changes:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header2.js

subP.onclick = function() {
    if (z===1) {
        hamOpen();
        z++;
    } else if (z===2) {
        hamClose();
        z--;
    }
}

<<<<<<< Updated upstream:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header.js
// 햄버거메뉴 함수정의
function hamOpen() {
=======
// 함수: 햄버거 메뉴 열기 닫기
function hamleft() {
>>>>>>> Stashed changes:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header2.js
    hamburgerSub.style.left = "-135px";
    subP.style.color = '#fff';
    hamburgerSub.style.transition = ".5s";
<<<<<<< Updated upstream:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header.js
    subPList[0].style.rotate = "-45deg";
    subPList[0].style.transition = ".3s";
    subPList[0].style.transformOrigin = "right bottom";
    subPList[1].style.opacity = "0";
    subPList[1].style.transition = ".3s";
    subPList[2].style.rotate = "45deg";
    subPList[2].style.transition = ".3s";
    subPList[2].style.transformOrigin = "right bottom";
=======
    subp[0].style.rotate = "-45deg";
    subp[0].style.transformOrigin = "110% 100%";
    subp[1].style.opacity = "0";
    subp[2].style.rotate = "45deg";
    subp[2].style.transformOrigin = "90% 100%";
>>>>>>> Stashed changes:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header2.js
}

function hamClose() {
    hamburgerSub.style.left = "135px";
    subP.style.color = '#000';
    hamburgerSub.style.transition = ".5s";
<<<<<<< Updated upstream:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header.js
    subPList[0].style.rotate = "0deg";
    subPList[1].style.opacity = "1";
    subPList[2].style.rotate = "0deg";
} 

// 캐로셀
=======
    subp[0].style.rotate = "0deg";
    subp[0].style.transformOrigin = "0";
    subp[1].style.opacity = "1";
    subp[2].style.rotate = "0deg";
    subp[2].style.transformOrigin = "0";
} 
>>>>>>> Stashed changes:1000_practice/98.practice/1.헤더연습(서브웨이)/subway_header2.js
