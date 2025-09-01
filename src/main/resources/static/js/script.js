document.addEventListener("DOMContentLoaded", () => {
  const btn = document.getElementById("showMsg");
  const msg = document.getElementById("msg");

  btn.addEventListener("click", () => {
    msg.textContent = "¡Bienvenido! Este mensaje fue generado con JavaScript.";
    msg.style.color = "green";
    msg.style.fontWeight = "bold";
  });
});
