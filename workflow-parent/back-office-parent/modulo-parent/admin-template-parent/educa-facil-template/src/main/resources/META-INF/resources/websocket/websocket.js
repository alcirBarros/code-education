var socket;

function connect() {
    try {
        var protocol = window.location.protocol;
        var host = window.location.host;
        var url = (protocol.includes("https") ? "wss" : "ws") + "://" + host + "/web" + "/mensagem";

        socket = new WebSocket(url);

        this.socket.onmessage = function (data) {
//            try {
//                var msg = JSON.parse(data.data);
//            } catch (e) {
//                alert("Alert: WebSocket.js");
//            }
            helloWorld(data.data);
        };
        this.socket.onopen = function (event) {
            console.log('onopen::' + JSON.stringify(event, null, 4));
        };

        this.socket.onclose = function (event) {
            console.log('onclose::' + JSON.stringify(event, null, 4));
        };

        this.socket.onerror = function (event) {
            console.log('onerror::' + JSON.stringify(event, null, 4));
        };
    } catch (exception) {
        console.error(exception);
    }
}

function sendData() {
    var data = JSON.stringify({
        'user': 'user',
        'message': 'ABCD'
    })
    socket.send(data);
}

function helloWorld(message) {
    console.log(message);

    PF('growlMessages').renderMessage({"summary": "summary goes here",
        "detail": "detail goes here",
        "severity": "info"});
}

$(document).ready(function () {
    connect();
});