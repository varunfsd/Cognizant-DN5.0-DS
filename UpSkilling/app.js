function theFunction() {
  console.log("Hello World");
}
document.querySelector("#btn").addEventListener("click", () => {
  theFunction();
  let nu = document.querySelector(".para").dataset.id;
  console.log(nu);
});
