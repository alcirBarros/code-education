var socket;



function connect() {
    socket = new WebSocket('ws://localhost:8080/user');
    socket.onmessage = function (data) {
        helloWorld(data.data);
    }
    setConnected(true);
}

function disconnect() {
    if (socket != null) {
        socket.close();
    }
    setConnected(false);
    console.log("Websocket is in disconnected state");
}

function sendData() {
    var data = JSON.stringify({
        'user': 'web',
        'message': $("#user").val()
    })
    socket.send(data);
}

function helloWorld(message) {
    $("#helloworldmessage").append("<tr><td> " + message + "</td></tr>");
}

function setConnected(connected) {
    $("#connect").prop("disabled", connected);
    $("#disconnect").prop("disabled", !connected);
}

$(function () {
    $("form").on('submit', function (e) {
        e.preventDefault();
    });
    $("#connect").click(function () {
        connect();
    });
    $("#disconnect").click(function () {
        disconnect();
    });
    $("#send").click(function () {
        sendData();
    });
});
