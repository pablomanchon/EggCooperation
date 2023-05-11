let numeros = document.querySelectorAll(".btn-num");
let operadores = document.querySelectorAll(".operador");
let caja = document.getElementById("resultado");
let btnIgual = document.getElementById("btnIgual");
let operadorAct = true;

btnIgual.addEventListener("click", () => {
  let contador = contarParentesis();
  console.log(contador);
  if (contador != 0) {
    for (let i = 0; i < contador; i++) {
      caja.value += ")";
    }
  }
  let resultado = eval(caja.value);
  console.log(resultado);
  caja.value = resultado;
});

operadores.forEach((op) => {
  op.addEventListener("click", () => {
    if (!operadorAct) {
      caja.value += op.innerHTML;
      operadorAct = true;
    }
  });
});
numeros.forEach((num) => {
  num.addEventListener("click", () => {
    caja.value += num.innerHTML;
    operadorAct = false;
  });
});

function contarParentesis() {
  let valor = caja.value;
  let contador = 0;
  console.log(valor.length);
  for (let i = 0; i < valor.length; i++) {
    if (valor[i] == "(") {
      contador++;
    }
    if (valor[i] == ")") {
      contador--;
    }
  }
  return contador;
}
