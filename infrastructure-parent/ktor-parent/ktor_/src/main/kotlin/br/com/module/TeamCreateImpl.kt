package br.com.module

import org.slf4j.Logger
import org.slf4j.LoggerFactory

object TeamCreateImpl : TeamCreate {
    val logger: Logger = LoggerFactory.getLogger(TeamCreateImpl::class.simpleName)
    val modelClazz = "Team"

    override suspend fun create(request: TeamCreate.Request): TeamCreate.Response {
        TODO("Not yet implemented")
    }
}
