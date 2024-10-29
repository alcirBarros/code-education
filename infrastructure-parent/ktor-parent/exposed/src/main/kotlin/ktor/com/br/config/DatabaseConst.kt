package ktor.com.br.config

class DatabaseConst {
    companion object {

        const val sourceRw = "cardRW"

        const val databaseRwProperties = "${sourceRw}DatabaseProperties"

        const val dataSourceRw = "${sourceRw}Datasource"

        const val databaseRw = "${sourceRw}Database"
    }
}
