const dotenv = require('dotenv')
const env = dotenv.config()

const PORT = env.parsed.PORT || '3333'

module.exports = {
    port: PORT
}