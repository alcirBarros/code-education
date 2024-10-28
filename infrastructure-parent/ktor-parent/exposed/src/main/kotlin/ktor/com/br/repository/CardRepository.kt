package ktor.com.br.repository

import ktor.com.br.model.Card
import ktor.com.br.util.dbQuery
import org.jetbrains.exposed.dao.UUIDEntity
import org.jetbrains.exposed.dao.UUIDEntityClass
import org.jetbrains.exposed.dao.id.EntityID
import org.jetbrains.exposed.dao.id.UUIDTable
import org.jetbrains.exposed.sql.Database
import org.jetbrains.exposed.sql.ResultRow
import org.jetbrains.exposed.sql.SqlExpressionBuilder
import org.jetbrains.exposed.sql.Table
import org.jetbrains.exposed.sql.insert
import org.jetbrains.exposed.sql.transactions.transaction
import org.jetbrains.exposed.sql.update
import java.util.UUID

class CardRepository(private val database: Database) {

    suspend fun save(card: Card): Card? {
        return dbQuery(database) {
            CardTable.insert {
                it[id] = card.id
                it[embossingName] = card.embossingName
            }.resultedValues?.first()?.let { mapper(it) }
        }
    }

    suspend fun update(card: Card) {
        val update = CardTable.update({ CardTable.id eq card.id }) {
            with(SqlExpressionBuilder) {
                it[embossingName] = "Episode VIII – The Last Jedi"
            }
        }
    }

    suspend fun selectAll() {

        val query = EmployeeAccountLinkEntity.all()
    }

    suspend fun findById(id: UUID) {

        transaction {

            commit()
        }

        transaction {
            rollback()
        }

        val findById = EmployeeAccountLinkEntity.findById(id)

        val find = EmployeeAccountLinkEntity.find { CardTableUUID.id eq id }.notForUpdate().single()

        return dbQuery(database) {
//            CardTable.select { CardTable.id eq id }.map {
//                mapper(it)
//            }
        }
    }
}

private fun mapper(it: ResultRow): Card = Card(
    id = it[CardTable.id],
    embossingName = it[CardTable.embossingName]
)

object CardTable : Table("card") {
    val id = uuid("id").autoIncrement()
    val embossingName = text("embossing_name")

    override val primaryKey = PrimaryKey(id, name = "pk_card_id")
}

object CardTableUUID : UUIDTable("card", "id") {
    val embossingName = text("embossing_name")
}

class EmployeeAccountLinkEntity(id: EntityID<UUID>) : UUIDEntity(id) {
    companion object : UUIDEntityClass<EmployeeAccountLinkEntity>(CardTableUUID)
}
