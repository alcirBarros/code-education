const express = require('express')
const app = express()

const port = 3000

app.all("/*", (req, res) => {
   res.json({
      url: req.url,
      method: req.method,
      protocol: req.protocol,
      headers: req.headers
   });
});

app.get('/', (req, res) => {
   console.log("Got a POST request for the homepage");
   res.send('Hello GET')
})

app.post('/', function (req, res) {
   console.log("Got a POST request for the homepage");
   res.send('Hello POST');
})

app.delete('/', function (req, res) {
   console.log("Got a DELETE request for the homepage");
   res.send('Hello DELETE');
})

var server = app.listen(port, function () {
   var host = server.address().address
   var port = server.address().port
   console.log("Example app listening at http://%s:%s", host, port)
})

