const apiKey = "42e2c1ba";
const txtPesquisa = window.document.querySelector("form");
txtPesquisa.onsubmit = (ev) => {
  ev.preventDefault();
  const pesquisa = ev.target.pesquisa.value;

  if (pesquisa == "") {
    Swal.fire({
      title: "Warning!",
      text: "Por favor digite algo!",
      icon: "warning",
      confirmButtonText: "OK",
    });
    return;
  }
  fetch(`https://www.omdbapi.com/?i=tt3896198&apikey=${apiKey}&&s=${pesquisa}`)
    .then((result) => result.json())
    .then((json) => carregaLista(json));

  const carregaLista = (json) => {
    const lista = window.document.querySelector("div.lista");
    lista.innerHTML = ""; //Aqui limpa todo o conteudo que está dentro da minha div principal
    if (json.Response == "False") {
      //verificação se o filme não existir
      Swal.fire({
        title: "ERRO!",
        text: "O conteudo não foi encontrado!",
        icon: "error",
        confirmButtonText: "OK",
      });
      return;
    }
    json.Search.forEach((element) => {
      //Separa os Elementos da API

      const item = window.document.createElement("div");
      item.classList.add("item"); //liga com a class item
      item.innerHTML = `<img src = "${element.Poster}"/> <h2>${element.Title}</h2> <p>Ano: ${element.Year}</p>`; //Cria uma img, um p e um h2 com base nos parametros da API
      lista.appendChild(item); //liga os itens com a variavel lista, que vai exibir o resultado
    });
  };
};
