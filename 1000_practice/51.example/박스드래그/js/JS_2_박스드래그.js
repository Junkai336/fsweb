const container = document.querySelector(".container");
const box = container.querySelector(".box");

const { width: containerWidth, height: containerHeight } = container.getBoundingClientRect();
const { width: boxWidth, height: boxHeight } = box.getBoundingClientRect();

// getBoundingClientRect(); : 요소의 크기와 뷰포트에 상대적인 위치정보 제공



// const width2 = containerWidth;
// const height2 = containerHeight;

// console.log(width2);
// console.log(height2);

let isDragging = null;
let originLeft = null;
let originTop = null;
let originX = null;
let originY = null;

box.addEventListener('mousedown', function (e) {
    isDragging = true;
    isDragging = true;
    originX = e.clientX;
    originY = e.clientY;
    originLeft = box.offsetLeft;
    originTop = box.offsetTop;
});

document.addEventListener('mouseup', function (e) {
    isDragging = false;
});


document.addEventListener('mousemove', function (e) {
    if (isDragging) {

        const diffX = e.clientX - originX;
        const diffY = e.clientY - originY;

        const endOfXPoint = containerWidth - boxWidth;
        const endOfYPoint = containerHeight - boxHeight;

        box.style.left = `${Math.min(Math.max(0, originLeft + diffX), endOfXPoint)}px`;
        box.style.top = `${Math.min(Math.max(0, originTop + diffY), endOfYPoint)}px`;
    }
});


// 완전하지 않음. 수정 필요
// https://taesung1993.tistory.com/93