var link1 = document.querySelector(".add-to-basket");
var link2 = document.querySelector(".order");
var popup1 = document.querySelector(".modal-add-basket");
var popup2 = document.querySelector(".modal-order");
var close1 = popup1.querySelector(".modal-close");
var close2 = popup2.querySelector(".modal-close");
var overlay = document.querySelector(".modal-overlay");

link1.addEventListener("click", function(event) {
    event.preventDefault();
    popup1.classList.toggle("modal-content-show");
    overlay.classList.toggle("modal-content-show");
});

close1.addEventListener("click", function(event) {
    event.preventDefault();
    popup1.classList.remove("modal-content-show");
    overlay.classList.remove("modal-content-show");
});

window.addEventListener("keydown", function(event) {
    if (event.keyCode === 27) {
        if (popup1.classList.contains("modal-content-show")) {
            popup1.classList.remove("modal-content-show");
            overlay.classList.remove("modal-content-show");
        }
    }
});

link2.addEventListener("click", function(event) {
    event.preventDefault();
    popup2.classList.toggle("modal-content-show");
    overlay.classList.toggle("modal-content-show");
});

close2.addEventListener("click", function(event) {
    event.preventDefault();
    popup2.classList.remove("modal-content-show");
    overlay.classList.remove("modal-content-show");
});

window.addEventListener("keydown", function(event) {
    if (event.keyCode === 27) {
        if (popup2.classList.contains("modal-content-show")) {
            popup2.classList.remove("modal-content-show");
            overlay.classList.remove("modal-content-show");
        }
    }
});