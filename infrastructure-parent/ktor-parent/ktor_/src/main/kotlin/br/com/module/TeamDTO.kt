package br.com.module

data class TeamDTO(
    val id: Int,
    val name: String,
    val players: List<Any>
) {
    companion object {
        fun getRestPath(): String = "/teams"
    }
}
