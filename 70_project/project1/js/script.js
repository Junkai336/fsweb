// 이미지 슬라이드 (투명도)

const slideImage = document.querySelectorAll('#slide li')

// console.log(slideImage);

setInterval(moveSlide, 2000)

let i = 0;

slideImage[0].style.opacity = '1';

function moveSlide() {
    // console.log(i);
    slideImage[i].style.opacity = '1';
    i++
    if (i == 4) {
        slideImage[2].style.opacity = '0';
        slideImage[1].style.opacity = '0';
        slideImage[0].style.opacity = '0';
        i = 1;
    }
}

// 갤러리 라이트 박스

/* 
    document.getElementById('myDiv').getAttribute('id') = id라는 속성 값 가져오기
    document.getElementById('myDiv').getAttribute('id', 'new value') = id라는 속성 값을 value로 교체하기
    document.getElementById('myDiv').hasAttribute('id') = id라는 속성의 값이 있는지 없는지 여부 (true, false) 조건문
*/

const galleryImg = document.querySelectorAll('#tab2 img')
const lightBox = document.querySelector('.lightbox')
const boxImg = document.querySelectorAll('.lightbox img')

// console.log(galleryImg);

for (let i = 0; i < galleryImg.length; i++) {
    galleryImg[i].addEventListener('click', function () {

        lightBox.classList.add('visible');
        boxImg[i].style.display = 'block';

        let imgNewSrc = boxImg[i].getAttribute('data-lightbox');
        // console.log(imgNewSrc);
        boxImg[i].setAttribute('src', imgNewSrc);


    });
}

lightBox.addEventListener('click', function () {
    this.classList.remove('visible');
    for (let i = 0; i < galleryImg.length; i++) {
        boxImg[i].style.display = 'none';
    }
});