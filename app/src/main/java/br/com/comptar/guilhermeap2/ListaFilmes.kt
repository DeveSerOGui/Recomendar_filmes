package br.com.comptar.guilhermeap2

data class Filme(val titulo: String, val duracao: String, val lancamento: String)
class Logica {

        val filmesComedia = listOf(
            filmeC("O Gordo e o Magro", "Curto", "Antigo"),
            filmeC("O Poderoso Chefão", "Medio", "Antigo"),
            filmeC("Amarcord", "Longo", "Antigo"),
            filmeC("Gente grande", "Curto", "Recente"),
            filmeC("Esposa de Mentirinha", "Medio", "Recente"),
            filmeC("se beber nao case", "Longo", "Recente"),
        )

        val filmesTerror = listOf(
            filmeT("Panico 1", "Curto", "Antigo"),
            filmeT("Massacre da serra eletrica", "Medio", "Antigo"),
            filmeT("A Hora do Pesadelo", "Longo", "Antigo"),
            filmeT("A Morte do Demônio: A Ascensão", "Curto", "Recente"),
            filmeT("Pânico 6", "Medio", "Recente"),
            filmeT("Disappointment Blvd", "Longo", "Recente"),
        )

        val filmesAcao = listOf(
            filmeA("007: O Amanhã Nunca Morre ", "Curto", "Antigo"),
            filmeA("Difícil de Matar", "Medio", "Antigo"),
            filmeA("Missão: Impossível", "Longo", "Antigo"),
            filmeA("Top Gun: Maverick", "Curto", "Recente"),
            filmeA("A Origem", "Medio", "Recente"),
            filmeA("John Wick 3", "Longo", "Recente"),
        )

        val filmesFic = listOf(
            filmeF("Star Wars: Episódio IV", "Curto", "Antigo"),
            filmeF("Robocop - O Policial do Futuro", "Medio", "Antigo"),
            filmeF("ndependence Day", "Longo", "Antigo"),
            filmeF("Duna", "Curto", "Recente"),
            filmeF("Interestelar", "Medio", "Recente"),
            filmeF("Avatar: O Caminho da Água", "Longo", "Recente"),
        )
    }