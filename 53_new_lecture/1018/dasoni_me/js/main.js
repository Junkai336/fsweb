$(function () {
    setTimeout(function () {
        $('.slider li .text0').addClass('on2');
        $('.slider li .atext0').addClass('on2');
    }, 1000) // 1초후 최초 한번만 실행

    var bx = $('.slider').bxSlider({
        auto: true,
        controls: false,
        pager: false,
        mode: 'fade',
        pause: 5000, // 실제 슬라이드 속도 - setInterval과 비슷
        autoHover: true,
        onSlideBeofre: function () { },
        onSlideAfter: function () {
            var k = bx.getCurrentSlide();
            $('.slider li').find('h2').removeClass('on2');
            $('.slider li').find('p').removeClass('on2');
            // $('.slider li .text'+k).addClass('on');
            // $('.slider li .atext'+k).addClass('on');
            $(`.slider li .text${k}`).addClass('on2');
            $(`.slider li .atext${k}`).addClass('on2');
        }
    });
});



// 퀵메뉴, 섹션 스크롤모션
const quickMenu = document.querySelector('.quick_menu')
const sectionWrap = document.querySelectorAll('.section_wrap')
const sectionUl = document.querySelectorAll('.section_wrap ul')
// const li = sectionUl[0].childElementCount;

// console.log(li);

// let count = 0;

// console.log(sectionUl[0].offsetParent.offsetHeight);
// console.log(sectionUl[0].offsetTop);
// console.log(sectionUl[0].scrollHeight);
// console.log(sectionUl[0].offsetHeight);
// console.log(sectionUl[0].clientHeight);
// console.log(sectionUl[0].offsetTop);

// 스크롤 했을 때 높이값 (스크롤바 위가 기준)
window.addEventListener('scroll', function () {
    let scrollY = this.scrollY;
    // console.log(this.scrollY);
    quickMenu.style.top = `${window.scrollY + 350}px`;

    for (let i = 3; i < sectionWrap.length; i++) {
        if (window.scrollY > (sectionWrap[i].offsetTop - 725)) {
            sectionWrap[i].style.opacity = '1';
            sectionWrap[i].style.transition = '1.2s';
            sectionWrap[i].classList.add('animation');
        }
    }

    for (let i = 0; i < sectionWrap.length - 2; i++) {
        sectionWrap[i].style.transition = '1.2s';
        if (window.scrollY > (sectionWrap[i].offsetTop - 900)) {
            sectionWrap[i].children[0].children[0].classList.add('visible');
        }
        if (window.scrollY > (sectionWrap[i].offsetTop - 800)) {
            sectionWrap[i].children[0].children[1].classList.add('visible2');
            sectionWrap[i].children[0].children[2].classList.add('visible2');
        }
        if (window.scrollY > (sectionUl[i].offsetTop - 875)) {
            sectionWrap[i].children[1].children[0].classList.add('visible2');
            if (sectionUl[i].childElementCount == 4) {
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[1].classList.add('visible2');
                }, 500)
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[2].classList.add('visible2');
                }, 1000)
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[3].classList.add('visible2');
                }, 1500)
            } else if (sectionUl[i].childElementCount == 5) {
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[1].classList.add('visible2');
                }, 500)
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[2].classList.add('visible2');
                }, 1000)
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[3].classList.add('visible2');
                }, 1500)
                this.setTimeout(function () {
                    sectionWrap[i].children[1].children[4].classList.add('visible2');
                }, 2000)
            }

            // for (let l = 0; l < sectionWrap[i].children[1].childElementCount; l++) {
            //     this.setTimeout(function () {
            //         sectionWrap[i].children[1].children[l].classList.add('visible2');
            //     }, 500 * l)
            // }
        }
    }
})

console.log(sectionWrap[0].children[0].children[0]);

// 팝업창
const advertise = document.querySelector('.advertise')
const advertiseClose = document.querySelectorAll('.advertise > button')

advertise.addEventListener('click', function (e) {
    e.preventDefault();
})

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

// const container = document.querySelector("body");
const container = document.body

const { width: containerWidth, height: containerHeight } = container.getBoundingClientRect();
const { width: advertiseWidth, height: advertiseHeight } = advertise.getBoundingClientRect();

let isDragging = null;
let originLeft = null;
let originTop = null;
let originX = null;
let originY = null;

advertise.addEventListener('mousedown', function (e) {
    isDragging = true;
    originX = e.clientX;
    originY = e.clientY;
    originLeft = advertise.offsetLeft;
    originTop = advertise.offsetTop;
});

document.addEventListener('mouseup', function (e) {
    isDragging = false;
});


document.addEventListener('mousemove', function (e) {
    if (isDragging) {

        const diffX = e.clientX - originX;
        const diffY = e.clientY - originY;

        const endOfXPoint = containerWidth - advertiseWidth;
        const endOfYPoint = containerHeight - advertiseHeight;

        advertise.style.left = `${Math.min(Math.max(0, originLeft + diffX), endOfXPoint)}px`;
        advertise.style.top = `${Math.min(Math.max(0, originTop + diffY), endOfYPoint)}px`;
    }
});

// advertise.addEventListener('mousedown', function () {
//     advertise.classList.add('drag');
// });

// let mouseX = 0;
// let mouseY = 0;

// document.addEventListener('mouseup', function () {
//     advertise.classList.remove('drag');
// });

// document.addEventListener('mousemove', function (e) {
//     if (advertise.classList.contains('drag')) {
//         mouseX = e.clientX;
//         mouseY = e.clientY;

//         advertise.style.left = `${mouseX - (advertise.offsetLeft)}px`;
//         advertise.style.top = `${mouseY - (advertise.offsetTop)}px`;
//         // advertise.style.left = `${mouseX + (mouseX - advertise.getBoundingClientRect().width)}px`;
//         // advertise.style.top = `${mouseY + (mouseY - advertise.getBoundingClientRect().height)}px`;
//         console.log(advertise.getBoundingClientRect().width);
//     }
// });


// console.log(advertise.getBoundingClientRect());
// console.log(advertise.offsetLeft);
// console.log(advertise.offsetTop);