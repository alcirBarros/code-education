package br.com.repository

import br.com.model.Message

class MessageRepository {

    fun getMessage(title: String, message: String) = Message(title, message)

}