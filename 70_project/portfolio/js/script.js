const tabButton = document.querySelectorAll('.sub_tab');
const tabProject = document.querySelectorAll('.project');

const sec1GreetP = document.querySelectorAll('.sec1_greet > p');
const sec1DetailP = document.querySelectorAll('.sec1_detail > p');

// console.log(sec1GreetP);
// console.log(sec1DetailP);

for(let i = 0; i < sec1GreetP.length; i++) {
    sec1GreetP[i].style.letterSpacing = '-34px';
}

setTimeout(start,600);
setTimeout(start2,1800);

function start () {
    for(let i = 0; i < sec1GreetP.length; i++) {
        sec1GreetP[i].style.opacity = '1';
        sec1GreetP[i].classList.add('transition');
        sec1GreetP[i].style.letterSpacing = '0px';
    }
}

function start2 () {
    for(let a = 0; a < sec1DetailP.length; a++) {
        setTimeout(function() {
            sec1DetailP[a].style.opacity = '1';
            sec1DetailP[a].classList.add('transition');
        }, ((1+a)*300))
    }
}

tabButton[0].style.border = '4px solid #999';

for (let i = 0; i < tabButton.length; i++) {
    tabButton[i].addEventListener('click', function () {
        for (let l = 0; l < tabProject.length; l++) {
            tabProject[l].style.display = 'none';
            tabButton[l].style.border = 'none';

        }
        tabProject[i].style.display = 'flex';
        tabButton[i].style.border = '4px solid #999';
    });

}

rightContent.addEventListener('scroll', function () {
    // console.log(rightContent.scrollTop)
    if (rightContent.scrollTop > section[2].offsetTop - 500) {
        $(".circleChart#0").circleChart({
            size: 150,
            value: 80,
            text: 0,
            color: "#ddd",
            speed: 2500,
            backgroundColor: "#444",
            onDraw: function (el, circle) {
                circle.text(Math.round(circle.value) + "%");
            }
        });

        $(".circleChart#1").circleChart({
            size: 150,
            value: 80,
            text: 0,
            color: "#ddd",
            speed: 2500,
            backgroundColor: "#444",
            onDraw: function (el, circle) {
                circle.text(Math.round(circle.value) + "%");
            }
        });

        $(".circleChart#2").circleChart({
            size: 150,
            value: 90,
            text: 0,
            color: "#ddd",
            speed: 2500,
            backgroundColor: "#444",
            onDraw: function (el, circle) {
                circle.text(Math.round(circle.value) + "%");
            }
        });
    }
})