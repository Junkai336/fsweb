// 이벤트 받을 대상]
//  .eixt_btn
const btn =document.querySelector('.exit_btn');
// 없앨 대상
// #modal_box
const modalBox = document.querySelector('#modal_box');
const modal_on = document.querySelector(".modal_on");
// 선택되는 지 테스트
// 버튼이 눌렸을 때, 박스가 선택이 되는지.
// ver1

btn.addEventListener("click", ()=>{
    // alert("click event!");
    modalBox.style.display = "none";

})


// ver2
btn.addEventListener("click", ()=>{
    modalBox.classList.add('hide');
    
})

modal_on.addEventListener("click", ()=>{
    modalBox.classList.remove('hide');
    
})