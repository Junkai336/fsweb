const section = document.querySelectorAll('section');
const rightContent = document.querySelector('.right_content');
const wrap = document.querySelector('#wrap');
// 해상도에 맞춰서 높이값 구하기
let diffHeight = Math.round((wrap.offsetHeight - rightContent.offsetHeight) / 2);

// console.log(wrap.offsetHeight);
// console.log(rightContent.offsetHeight);

let action = false;
let count = 0;

// 새로고침시 문서 맨 위로 스크롤 (와중에 스크롤, 키입력은 못 막음)
window.addEventListener('load', function () {
    window.scrollTo(0, 0);
})

// 섹션 높이 확인
// for (let i = 0; i < section.length; i++) {
//     console.log(section[i].offsetTop -diffHeight);
// }

// 스크롤 여러번 올렸다 내리기 방지 (마우스)
rightContent.addEventListener('scroll', function () {
    for (let i = 0; i < section.length; i++) {
        // console.log(rightContent.scrollTop);
        if (rightContent.scrollTop == section[i].offsetTop - diffHeight) {
            action = false;
        };
    }
})


// 키보드 방지
window.addEventListener('keydown', function (e) {
    if ((e.keyCode == 38) || (e.keyCode == 40)) {
        e.preventDefault();
        e.returnValue = false;
    }
});

// 풀페이지 (마우스)
for (let i = 0; i < section.length; i++) {
    section[i].addEventListener('wheel', function (e) {
        e.preventDefault();
        if (e.deltaY > 0 && action == false) {
            if (rightContent.scrollTop == section[section.length - 1].offsetTop - diffHeight) { return; }
            action = true;
            let next = e.currentTarget.nextElementSibling.offsetTop - diffHeight
            // console.log(next);
            rightContent.scrollTop = next;
            count++;
            if (count > section.length - 1) { count = section.length - 1; }
        } else if (e.deltaY < 0 && action == false) {
            if (rightContent.scrollTop == section[0].offsetTop - diffHeight) { return; }
            action = true;
            let prev = e.currentTarget.previousElementSibling.offsetTop - diffHeight
            rightContent.scrollTop = prev;
            count--;
            if (count < 0) { count = 0; }
        }
    });
};