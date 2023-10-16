const depth1 = document.querySelector('.gnb_line');
const depth2 = document.querySelectorAll('.depth2');
const depth2List = document.querySelectorAll('.depth2 li');
const depth2List2 = document.getElementsByClassName('depth2');
const depth2Wrap = document.querySelector('.depth2_wrap');
const color = document.querySelectorAll('.color_line');
const icon = `<div><img src="img/sec5_tit.png" alt="aa"></div>`;
const iconS = document.querySelectorAll('depth2 img');

const hamBtn = document.querySelector('.hamburger_button');
const hamMenu = document.querySelector('.hamburger_menu');

const mobileUl = document.querySelectorAll('.depth1_ham')
const mobileLi = document.querySelectorAll('.depth1_ham li')
const mobileLi2 = mobileUl.childNodes;
// const body = document.querySelector('html');




console.log(mobileUl);
console.log(mobileLi[0]);
console.log(mobileLi2);

depth1.addEventListener('mouseover', function () {
    depth2Wrap.style.height = '335px';
    color[1].style.backgroundImage = 'linear-gradient(20deg, #0f0, #ff0, #f40, #f0f, #f80)';
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

for (let l = 0; l < depth2List.length; l++) {
    depth2List[l].addEventListener('mouseover', function () {
        if (depth2List[l].classList.contains('cursor')) {
        } else {
            depth2List[l].innerHTML += icon;
            depth2List[l].style.fontWeight = 'bolder';
            depth2List[l].classList.add('cursor');
        }
    });
}

for (let l = 0; l < depth2List.length; l++) {
    depth2List[l].addEventListener('mouseleave', function () {
        if (depth2List[l].classList.contains('cursor')) {
            depth2List[l].innerHTML -= icon;
            depth2List[l].style.fontWeight = 'bold';
            depth2List[l].classList.remove('cursor');
        }
    });
}

// let hamtoggle = true;

hamBtn.addEventListener('click', function () {
    // body.style.backgroundColor = 'rgba(50, 50, 50, .5)';
    hamMenu.style.right = '0px';
    hamBtn.style.opacity = '0';
}
);

for (let a = 0; a < mobileUl.length; a++) {
    mobileUl[a].addEventListener('click', function () {
        mobileUl[a].style.height = '200px';
        if (mobileUl == 1) {
            mobileLi[0].style.height = '400px';
            mobileLi[1].style.height = '400px';
            mobileLi[2].style.height = '400px';
            mobileLi[3].style.height = '400px';
            mobileLi[4].style.height = '400px';
        }
    });
}