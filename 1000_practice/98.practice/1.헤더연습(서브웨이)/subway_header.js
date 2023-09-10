const depth1 = document.querySelectorAll('li')


const hamburger = document.querySelector('.hamburger')
const hamburgerSub = document.querySelector('.hamburger_sub')
// const hamburgerClose = document.querySelector('.hamburger_close')
const hamburgerClose = document.querySelector('.logo')

console.log(depth1);

hamburger.addEventListener("click", () => {
    hamburgerSub.style.left = "-135px";
    hamburgerSub.style.transition = ".5s";
})

hamburgerClose.addEventListener("click", () => {
    hamburgerSub.style.left = "135px";
    hamburgerSub.style.transition = ".5s";
})