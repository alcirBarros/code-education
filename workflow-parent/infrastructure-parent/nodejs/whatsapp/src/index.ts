import { WhatsAppAPI } from './api/whatsapp';
import qrcode from 'qrcode-terminal';

let wp = new WhatsAppAPI({
    deviceName: 'My Device',
    sessionPath: './wp-session',
    baileysOptions: {},
});

wp.on('qr', (qr) => {
    console.log(qr);
    qrcode.generate(qr, { small: true });
});

wp.on('ready', async (data) => {
    console.log(data);
});

wp.on('disconnect', (reason) => {
    console.log('Disconnected: ' + reason);
    wp.initialize();
});

wp.on('message', (message) => {
    console.log("*******************");
    console.log(message);
    console.log("*******************");
//    if (message.text.includes('ping')) {
//       message.reply('pong');
//    }
});

wp.on('/test', (message) => {
    message.reply(message.text);
});

wp.initialize();