function myFunction() {
    document.getElementById("myDropdown").classList.toggle("show");
}

window.onclick = function (e) {
    if (!e.target.matches('.dropbtn')) {
        var myDropdown = document.getElementById("myDropdown");
        if (myDropdown.classList.contains('show')) {
            myDropdown.classList.remove('show');
        }
    }
}

let body = document.getElementsByTagName("body");
let buttonNight = document.getElementById("#buttonNight");
let buttonDay = document.getElementById("#buttonDay");

function makeDark() {
    body.classList.remove("bg-opacity-25");
}
buttonNight.addEventListener("click", makeDark());

function makeLight() {
    body.classList.add("bg-opacity-25");
}
buttonDay.addEventListener("click", makeLight());








