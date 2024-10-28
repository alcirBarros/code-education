import { proto } from "../WAProto";

export type MediaConnInfo = {
    auth: string
    ttl: number
    hosts: { hostname: string, maxContentLengthBytes: number }[]
    fetchDate: Date
}

export type MinimalMessage = Pick<proto.IWebMessageInfo, 'key' | 'messageTimestamp'>