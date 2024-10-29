import makeWASocket from './Socket';

export * from './Types/Socket';
export * from './WAProto'
export * from './Utils'
export * from './Types';
//export * from './Defaults'

export type WASocket = ReturnType<typeof makeWASocket>
export { makeWASocket };
export default makeWASocket;