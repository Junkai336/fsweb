        // 변수 선언
        let idx = 0,
            eDelay = 0,
            currentIdx = 0,
            auto;


        // 요소 선택
        const slide = document.querySelector('.slide'),
            // 요소를 부모기준, 상대기준으로 찾는게 동작속도가 더 빠르다
            slideList = slide.querySelectorAll('li'),
            npBtn = document.querySelectorAll('.ctls a'),
            indiBtn = document.querySelectorAll('.indi li'),
            speed = 700;

        // 로딩시 자동 슬라이드
        // auto 변수는 사용자가 버튼 클릭 시 자동 슬라이드를 정지하는 목적이다.
        autoSlide();

        function autoSlide() {
            auto = setInterval(() => nextSlide(), speed * 4);
        }



        // prev
        npBtn[0].onclick = () => {

            // 만약 eDelay가 0이 아니면 click 이벤트 벗어남. (return 함수탈출)
            if (eDelay) return;
            // 두 번째 클릭시 적용
            eDelay = 1;
            setTimeout(() => { eDelay = 0; autoSlide(); }, speed);

            prevSlide();
        }; // prev

        // next

        npBtn[1].onclick = () => {

            // 만약 eDelay가 0이 아니면 click 이벤트 벗어남. (return 함수탈출)
            if (eDelay) return;
            // 두 번째 클릭시 적용
            eDelay = 1;
            setTimeout(() => { eDelay = 0; autoSlide(); }, speed);

            nextSlide();
        }; // npBtn

        function prevSlide() {
            // 사용자가 버튼 클릭 시 자동 슬라이드 정지
            clearInterval(auto);
            // 0 -> 4 -> 3 -> 2 -> 1
            slideList[idx].style.left = '-100%';
            slideList[idx].style.transition = `left ${speed / 1000}s ease-out`;
            // 4 -> 3 -> 2 -> 1 -> 0
            // 6번째 이미지가 없기 때문에 0번 이미지가 나오려면 -1
            if (idx === 0) idx = 5;
            slideList[idx - 1].style.left = '0';
            slideList[idx - 1].style.transition = `left ${speed / 1000}s ease-out`;
            indiActive(idx - 1, idx);
            // setTimeout(함수, 시간) : 시간후 1회
            // setInterval(함수, 시간) : 시간후 반복
            setTimeout(function () {
                if (idx === 5) idx = 0;
                slideList[idx].style.left = '100%';
                slideList[idx].style.transition = 'none';
                idx--;
                if (idx === -1) idx = 4;
            }, speed);
        }

        function nextSlide() {
            clearInterval(auto);
            // 0 -> 1 -> 2 -> 3 -> 4
            slideList[idx].style.left = '-100%';
            slideList[idx].style.transition = `left ${speed / 1000}s ease-out`;
            // 1 -> 2 -> 3 -> 4 -> 5
            // 6번째 이미지가 없기 때문에 0번 이미지가 나오려면 -1
            if (idx === 4) idx = -1;
            slideList[idx + 1].style.left = '0';
            slideList[idx + 1].style.transition = `left ${speed / 1000}s ease-out`;
            indiActive(idx + 1, idx);
            // setTimeout(함수, 시간) : 시간후 1회
            // setInterval(함수, 시간) : 시간후 반복
            setTimeout(function () {
                if (idx === -1) idx = 4;
                slideList[idx].style.left = '100%';
                slideList[idx].style.transition = 'none';
                idx++;
                if (idx === 5) idx = 0;
            }, speed);
        }

        for (let i = 0; i < indiBtn.length; i++) {

            indiBtn[i].onclick = () => {
                // console.log('몇 번쨰 버튼이니?', i);
                clearInterval(auto);

                if (eDelay) return;
                // 두 번째 클릭시 적용
                eDelay = 1;
                setTimeout(() => { eDelay = 0; }, speed);

                // 인디케이터의 누른 버튼 순번과 0%의 이미지 순번이 같으면 onclick 함수를 벗어남 
                if (currentIdx === i) return;

                // i = 0,1,2,3,4
                currentIdx = i;

                // 코드

                // Idx는 0
                // 0% 이미지(currentIdx)는 -100%로
                slideList[idx].style.left = '-100%';
                slideList[idx].style.transition = `left ${speed / 1000}s ease-out`;


                // i는 0,1,2,3,4
                // 인디 버튼(i) 순번에 해당하는 이미지는 0%로
                slideList[currentIdx].style.left = '0';
                slideList[currentIdx].style.transition = `left ${speed / 1000}s ease - out`;
                indiActive(currentIdx, idx);


                // 일정시간 후 -100% 이미지는 100%로 돌아간다.
                slideList[idx].style.left = '100%';
                slideList[idx].style.transition = 'none';

            };
        }

        function indiActive(currentIdx, idx) {
            // -1(x) / 0,1,2,3,4,  / 5(x)
            // 5일떄는 0으로 -1일떄는 4로
            // next
            if (idx === 5) idx = 0;
            // prev
            if (idx === -1) idx = 4;
            indiBtn[idx].classList.remove('on');
            indiBtn[currentIdx].classList.add('on');
        }