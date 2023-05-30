try {
  const tarjetaGreen = document.querySelector(".tarjetaGreen");
  tarjetaGreen.addEventListener("click", () => {
    tarjetaGreen.style.display = "none";
  });
} catch (e) {
  console.log(e.message);
}
try {
  const tarjetaRed = document.querySelector(".tarjetaRed");
  tarjetaRed.addEventListener("click", () => {
    tarjetaRed.style.display = "none";
  });
} catch (e) {
  console.log(e.message);
}
