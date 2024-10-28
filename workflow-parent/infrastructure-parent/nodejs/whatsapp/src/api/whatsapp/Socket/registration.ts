//import { KeyPair, SignedKeyPair, SocketConfig } from '../Types'

import { mobileRegister, mobileRegisterCode } from "@whiskeysockets/baileys/lib/Socket/registration"
import { SocketConfig } from "../Types/Socket"
import { jidEncode } from "@whiskeysockets/baileys"

export const makeRegistrationSocket = (config: SocketConfig) => {
	const sock = makeBusinessSocket(config)

	const register = async(code: string) => {
		if(!validRegistrationOptions(config.auth.creds.registration)) {
			throw new Error('please specify the registration options')
		}

		const result = await mobileRegister({ ...sock.authState.creds, ...sock.authState.creds.registration as RegistrationOptions, code }, config.options)

		sock.authState.creds.me = {
			id: jidEncode(result.login!, 's.whatsapp.net'),
			name: '~'
		}

		sock.authState.creds.registered = true
		sock.ev.emit('creds.update', sock.authState.creds)

		return result
	}

	const requestRegistrationCode = async(registrationOptions?: RegistrationOptions) => {
		registrationOptions = registrationOptions || config.auth.creds.registration
		if(!validRegistrationOptions(registrationOptions)) {
			throw new Error('Invalid registration options')
		}

		sock.authState.creds.registration = registrationOptions

		sock.ev.emit('creds.update', sock.authState.creds)

		return mobileRegisterCode({ ...config.auth.creds, ...registrationOptions }, config.options)
	}

	return {
		...sock,
		register,
		requestRegistrationCode,
	}
}