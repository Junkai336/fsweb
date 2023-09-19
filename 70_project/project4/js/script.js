// 섹션2: 탭
const tabBtn = document.querySelectorAll('#tabs li');
const tabCont = document.querySelectorAll('#tabs div');

// 탭 버튼을 클릭하면 
for (let i = 0; i < tabBtn.length; i++) {
    tabBtn[i].onclick = (e) => {
        e.preventDefault();
        console.log('몇 번을 눌렀는가', i);
        console.log(tabBtn.length);
        // tabs div의 on클래스를 모두 제거
        for (let j = 0; j < tabBtn.length; j++) {
            tabCont[j].classList.remove('on');
        }
        // tabs div의 on클래스를 버튼 누를 것만 추가
        tabCont[i].classList.add('on');
    }
}

// 섹션3: 텍스트 스크롤 모션

const tit1 = document.querySelector('#sec3 .tit1');
const tit2 = document.querySelector('#sec3 .tit2');
const proBtn = document.querySelector('#sec3 .proBtn');

window.onscroll = () => {
    console.log(document.documentElement.scrollTop);
    let st = document.documentElement.scrollTop;
    if (st > 1700) {
        tit1.style.transform = 'translateX(0)';
        tit2.style.transform = 'translateX(0)';
        tit1.style.opacity = '1';
        tit2.style.opacity = '1';
        proBtn.style.opacity = '1';
    } else {
        tit1.style.transform = 'translateX(-400px)';
        tit2.style.transform = 'translateX(-400px)';
        tit1.style.opacity = '0';
        tit2.style.opacity = '0';
        proBtn.style.opacity = '0';
    }
};

// 섹션4 비디오 플레이어
const vidBtn = document.querySelector('.vid .btn');
const vidBtnSpan = vidBtn.querySelector('span');
const vidWrap = document.querySelector('.vid');
// const vid = document.querySelector('.vid video');
const vid = vidWrap.querySelector('video');
let vidState 

// 비디오 위에 마우스를 올리면
vidWrap.onmouseenter = () => {
    // 플레이 버튼(삼각형)이 보인다.
    vidBtn.style.display = 'block';
};
// 비디오 영역 밖으로 벗어나면
vidWrap.onmouseleave = () => {
    // 플레이 버튼은 숨긴다.
    vidBtn.style.display = 'none';
};

// 버튼(play/pause)을 클릭하면
vidBtn.onclick = ()=>{
    if (vidState === 0) {
        // 비디오가 플레이 되면서
        vid.play();
        vidState = 1;
    } else {
        // 비디오가 일시 정지 되면서
        vid.pause();
        vidState = 0;
    }
    // span에 on클래스 제거되면 비디오 플레이 버튼의 모양이 일시정지 버튼으로 바뀐다.
    // span에 on클래스 추가되면 버튼 모양이 삼각형으로 바뀐다.
    // toggle은 add와 remove를 번갈아 적용시킨다.
    vidBtnSpan.classList.toggle('on');
};