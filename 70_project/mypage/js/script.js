const tabButton = document.querySelectorAll('.sub_tab');
const tabProject = document.querySelectorAll('.project');

// console.log(tabButton);
// console.log(tabProject);

for (let i = 0; i < tabButton.length; i++) {
    tabButton[i].addEventListener('click', function () {
        for (let l = 0; l < tabProject.length; l++) {
            tabProject[l].style.display = 'none';

        }
        tabProject[i].style.display = 'flex';
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