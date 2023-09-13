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

subP.onclick = function() {
    if (z===1) {
        hamOpen();
        z++;
    } else if (z===2) {
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