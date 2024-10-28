//package br.com.postgres.repository
//
//import org.springframework.jdbc.core.JdbcTemplate
//import org.springframework.stereotype.Component
//import java.util.UUID
//import javax.annotation.PostConstruct
//
//@Component
//class RegistryJdbcRepository(
//    private val jdbc: JdbcTemplate
//) {
//
//    @PostConstruct
//    fun init() {
//        print("AAAAAAA")
//    }
//
//    fun insert(registry: Registry): Registry {
//        val saveRegistry = Registry(
//            id = UUID.randomUUID(),
//            name = registry.name
//        )
//        jdbc.update("insert into sign_up (id, name) values (?, ?)") { ps ->
//            ps.setObject(1, saveRegistry.id)
//            ps.setObject(2, saveRegistry.name)
//        }
//        return saveRegistry
//    }
//
//    fun findAllById(id: UUID): List<Registry> {
//        return jdbc.query(
//            "select id, name from sign_up where id = ?", { rs, _ ->
//                Registry(
//                    id = UUID.fromString(rs.getString(1)),
//                    name = rs.getString(2)
//                )
//            },
//            id
//        )
//    }
//}
