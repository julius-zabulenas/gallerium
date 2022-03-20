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

// Button night and day functionality
let body = document.querySelector("body");
let buttonNight = document.getElementById("button-night");
let buttonDay = document.getElementById("button-day");

function makeDark() {
    body.className = "bg-dark bg-opacity-75";
}
buttonNight.addEventListener("click", makeDark);

function makeLight() {
    body.className = "bg-dark bg-opacity-25";
}
buttonDay.addEventListener("click", makeLight);








