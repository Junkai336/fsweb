const depth1 = document.querySelectorAll('li')

const div = document.querySelectorAll('div')
const hamburgerSub = document.querySelector('.hamburger_sub')
const hamburger = document.querySelector('.hamburger')

console.log(depth1);
console.log(div);
div.length;

let i = 1;

div[3].onclick = function() {
    if (i===1) {
        hamleft();
        i++;
    } else if (i===2) {
        hamright();
        i--;
    }
}

console.log(i);

function hamleft() {
    hamburgerSub.style.left = "-135px";
    hamburger.style.color = '#fff';
    hamburgerSub.style.transition = ".5s";
}

function hamright() {
    hamburgerSub.style.left = "135px";
    hamburger.style.color = '#000';
    hamburgerSub.style.transition = ".5s";
} 