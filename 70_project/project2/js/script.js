const hamburger = document.querySelector('#hamburger');
const span = document.querySelector('#hamburger span');
const subMenu = document.querySelector('.mobile_menu');

let i = 0

hamburger.addEventListener('click', function (e) {
    e.preventDefault();
    if (i === 0) {
        span.classList.add('on');
        hamburger.classList.add('on');
        subMenu.style.left = '60%';
        i++
    } else if (i === 1) {
        span.classList.remove('on');
        hamburger.classList.remove('on');
        subMenu.style.left = '100%';
        i--
    }
});