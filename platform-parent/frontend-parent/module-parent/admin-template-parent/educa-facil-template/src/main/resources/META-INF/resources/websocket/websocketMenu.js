var socket;


function webSocketMenuConnect() {
    try {
        var protocol = window.location.protocol;
        var host = window.location.host;
        var url = (protocol.includes("https") ? "wss" : "ws") + "://" + host + "/web" + "/menu";

        socket = new WebSocket(url);

        this.socket.onmessage = function (event) {
            console.log('onmessage::' + event);
            var json = JSON.parse(event.data);
            montaMenu(json);
        };
        this.socket.onopen = function (event) {
            console.log('onopen::' + event);
            var json = JSON.stringify(event.data, null, 4);
          //  alert(json);
        };

        this.socket.onclose = function (event) {
            console.log('onclose::' + event);
            var json = JSON.stringify(event.data, null, 4);
        };

        this.socket.onerror = function (event) {
            console.log('onerror::' + event);
            var json = JSON.stringify(event.data, null, 4);
        };
    } catch (exception) {
        console.error(exception);
    }
}

$(document).ready(function () {
    webSocketMenuConnect();
});

function createElementSeperadorLi(ul, dados) {
    var separador = dados.separador;

    var li2 = document.createElement('li');
    li2.classList.add('header');
    li2.innerText = separador;
    ul.appendChild(li2);
}

function createMenuElement(ul2, dados) {

    var menuTitle = dados.menuTitle;
    var link = dados.link;
    var styleClasseArray = dados.styleClasseArray;

    var li4 = document.createElement('li');
    {
        var a3 = document.createElement('a');
        a3.href = link;
        {
            var i4 = document.createElement('i');
            for (var i = 0; i < styleClasseArray.length; i++) {
                i4.classList.add(styleClasseArray[i]);
            }
            a3.appendChild(i4);
        }
        {
            var text3 = document.createTextNode(menuTitle);
            a3.appendChild(text3);
        }

        li4.appendChild(a3);
    }
    ul2.appendChild(li4);
}

function createTreeviewElement(li3, dados) {
    var menuArray = dados.menuArray;
    var ul2 = document.createElement('ul');
    ul2.classList.add('treeview-menu');

    menuArray.reverse().forEach(function (dados) {
        createMenuElement(ul2, dados);
    });
    li3.appendChild(ul2);
}

function createInfoSwingMenuElement(a2, dados) {
    var styleClasseInfoArray = dados.styleClasseInfoArray;

    var span3 = document.createElement('span');
    span3.classList.add('pull-right-container');

    styleClasseInfoArray.reverse().forEach(function (dados) {
        var info = dados.info;
        var styleClasse = dados.styleClasse;

        var small = document.createElement('small');

        for (var i = 0; i < styleClasse.length; i++) {
            small.classList.add(styleClasse[i]);
        }

        small.innerText = info;
        span3.appendChild(small);

    });

    a2.appendChild(span3);
}

function createSwingMenuElement(ul, dados) {
    var menuTitle = dados.menuTitle;
    var styleClasseArray = dados.styleClasseArray;

    {
        var li3 = document.createElement('li');
//        li3.classList.add('active');
        li3.classList.add('treeview');
//        li3.classList.add('menu-open');
        {
            var a2 = document.createElement('a');
            a2.href = "#";
            {
                var i2 = document.createElement('i');
                for (var i = 0; i < styleClasseArray.length; i++) {
                    i2.classList.add(styleClasseArray[i]);
                }
                a2.appendChild(i2);
            }


            {
                var span2 = document.createElement('span');
                span2.innerText = menuTitle;
                a2.appendChild(span2);
            }

            createInfoSwingMenuElement(a2, dados);
            li3.appendChild(a2);
        }

        createTreeviewElement(li3, dados);

        ul.appendChild(li3);
    }
}

function createHome(ul, data) {
    var home = data.home;

    var li1 = document.createElement('li');
    {
        var a1 = document.createElement('a');
        a1.href = "/web/index.xhtml";
        a1.classList.add('ui-link');
        a1.classList.add('ui-widget');

        {
            var i1 = document.createElement('i');
            i1.classList.add('fa');
            i1.classList.add('fa-home');
            a1.appendChild(i1);
        }

        {
            var span1 = document.createElement('span');
            span1.innerText = home;
            a1.appendChild(span1);
        }

        li1.appendChild(a1);
    }
    ul.appendChild(li1);
}


function createItemMenu(ul, dados) {
    var itens = dados.itens;
    itens.reverse().forEach(function (dados) {
        createSwingMenuElement(ul, dados);
    });
}

function createHomeElement(ul, data) {
    var itens = data.itens;

    createHome(ul, data);

    itens.reverse().forEach(function (dados) {
        createElementSeperadorLi(ul, dados);
        createItemMenu(ul, dados);
    });
}


function montaMenu(data) {
    var ul = document.querySelector('#menu-content');
    ul.innerHTML = "";
    createMenu(ul, data);
}



function createMenu(ul, data) {
    var items = data.items;
    items.reverse().forEach(
            function (item) {
                createHomeElement(ul, item);
            }
    );
}


