
const app = require('./config/express')
const config = require('./config/config')

let server = app.listen(config.port, async () => {
    console.log(config.port)
})

module.exports = server