export * from './Auth'
export * from './Events'

import { AuthenticationState } from './Auth'
import { SocketConfig } from './Socket'

export type UserFacingSocketConfig = Partial<SocketConfig> & { auth: AuthenticationState }

export enum DisconnectReason {
	connectionClosed = 428,
	connectionLost = 408,
    connectionReplaced = 440,
    timedOut = 408,
	loggedOut = 401,
    badSession = 500,
    restartRequired = 515,
    multideviceMismatch = 411
}