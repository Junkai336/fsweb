const depth1 = document.querySelector('.gnb_line');
const depth2 = document.querySelectorAll('.depth2');
const depth2Wrap = document.querySelector('.depth2_wrap');
const color = document.querySelectorAll('.color_line');

console.log(depth2);

depth1.addEventListener('mouseover', function () {
    depth2Wrap.style.height = '335px';
    color[1].style.backgroundImage = '20deg, green, yellow, brown, purple, orange)';
    color[1].classList.add('on');
    for (let i = 0; i < depth2.length; i++) {
        depth2[i].style.display = 'flex';
    }
});

depth1.addEventListener('mouseleave', function () {
    depth2Wrap.style.height = '0px';
    color[1].style.backgroundImage = 'linear-gradient(20deg, #666, #666)';
    color[1].classList.remove('on');
    for (let i = 0; i < depth2.length; i++) {
        depth2[i].style.display = 'none';
    }
});