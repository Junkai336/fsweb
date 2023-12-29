const section = document.querySelectorAll('section');
const rightContent = document.querySelector('.right_content');

let action = false;
let count = 0;

// 새로고침시 문서 맨 위로 스크롤 (와중에 스크롤, 키입력은 못 막음)
window.addEventListener('load', function () {
    window.scrollTo(0, 0);
})

// 스크롤 여러번 올렸다 내리기 방지 (마우스)
rightContent.addEventListener('scroll', function () {
    for (let i = 0; i < section.length; i++) {
        // console.log(rightContent.scrollTop);
        // console.log(section[i].offsetTop);
        if (rightContent.scrollTop == section[i].offsetTop - 58) {
            action = false;
        };
    }
})


// 풀페이지 (키보드)
// + 스크롤 여러번 올렸다 내리기 방지 (키보드)
rightContent.addEventListener('keydown', function (e) {
    if ((e.keyCode == 38 && action == true) || (e.keyCode == 40 && action == true)) {
        e.preventDefault();
        e.returnValue = false;
    }

    if (e.keyCode == 40 && action == false) {
        if (rightContent.scrollTop == section[section.length - 1].offsetTop - 58) { return; }
        count++;
        if (count > section.length - 1) { count = section.length - 1; }
        window.scrollBy(0, section[count].offsetHeight);
        e.preventDefault();
        action = true;
    } else if (e.keyCode == 38 && action == false) {
        if (rightContent.scrollTop == section[0].offsetTop - 58) { return; }
        count--;
        if (count < 0) { count = 0; }
        window.scrollBy(0, -(section[count].offsetHeight));
        e.preventDefault();
        action = true;
    }

});

// 풀페이지 (마우스)
for (let i = 0; i < section.length; i++) {
    section[i].addEventListener('wheel', function (e) {
        e.preventDefault();
        if (e.deltaY > 0 && action == false) {
            if (rightContent.scrollTop == section[section.length - 1].offsetTop -58) { return; }
            action = true;
            let next = e.currentTarget.nextElementSibling.offsetTop -58
            rightContent.scrollTop = next;
            count++;
            if (count > section.length - 1) { count = section.length - 1; }
        } else if (e.deltaY < 0 && action == false) {
            if (rightContent.scrollTop == section[0].offsetTop -58) { return; }
            action = true;
            let prev = e.currentTarget.previousElementSibling.offsetTop -58
            rightContent.scrollTop = prev;
            count--;
            if (count < 0) { count = 0; }
        }
    });
};