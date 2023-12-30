const tabButton = document.querySelectorAll('.sub_tab');
const tabProject = document.querySelectorAll('.project');

console.log(tabButton);
console.log(tabProject);

for (let i = 0; i < tabButton.length; i++) {
    tabButton[i].addEventListener('click', function () {
        for (let l = 0; l < tabProject.length; l++) {
            tabProject[l].style.display = 'none';

        }
        tabProject[i].style.display = 'flex';
    });

}