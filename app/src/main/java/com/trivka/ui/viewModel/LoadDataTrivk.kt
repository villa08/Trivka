package com.trivka.ui.viewModel

import com.trivka.dataSource.TrivkEntity
import com.trivka.repository.AnswerModel
import com.trivka.repository.TrivkModel
import java.util.UUID

object LoadDataTrivk {

    fun listData(): List<TrivkModel> {
        return arrayListOf(
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Conocimiento general",
                question = "¿Cuántas zonas horarias tiene en Rusia?"
                ,
                answer = arrayListOf(
                    AnswerModel(option = "14", truth = false),
                    AnswerModel(option = "12", truth = false),
                    AnswerModel(option = "11", truth = true),
                    AnswerModel(option = "8", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Conocimiento general",
                question = "¿Cuál es la flor nacional de Japón?"
                ,
                answer = arrayListOf(
                    AnswerModel(option = "Flor de Cerezo", truth = true),
                    AnswerModel(option = "Flor de Loto", truth = false),
                    AnswerModel(option = "Flor de Tokio", truth = false),
                    AnswerModel(option = "Flor de Narita", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Conocimiento general",
                question = "¿Cuántas franjas tiene la bandera de Estados Unidos?",
                answer = arrayListOf(
                    AnswerModel(option = "14", truth = false),
                    AnswerModel(option = "10", truth = false),
                    AnswerModel(option = "2", truth = false),
                    AnswerModel(option = "13", truth = true)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Conocimiento general",
                question = "¿Cuál es el animal nacional de Australia?",
                answer = arrayListOf(
                    AnswerModel(option = "Demonio de Tasmania", truth = false),
                    AnswerModel(option = "Camello", truth = false),
                    AnswerModel(option = "Canguro", truth = true),
                    AnswerModel(option = "Caballo", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Conocimiento general",
                question = "¿Cuántos días le toma a la tierra dar una vuelta a la órbita del sol?",
                answer = arrayListOf(
                    AnswerModel(option = "360", truth = false),
                    AnswerModel(option = "365", truth = true),
                    AnswerModel(option = "30", truth = false),
                    AnswerModel(option = "7", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Geografia",
                question = "¿Qué país tiene la mayor cantidad de islas en el mundo?",
                answer = arrayListOf(
                    AnswerModel(option = "Suecia", truth = true),
                    AnswerModel(option = "Estados Unidos", truth = false),
                    AnswerModel(option = "Noruega", truth = false),
                    AnswerModel(option = "Islandia", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Geografia",
                question = "¿Cuál es el país más pequeño del mundo?",
                answer = arrayListOf(
                    AnswerModel(option = "Liechtenstein", truth = false),
                    AnswerModel(option = "Vaticano", truth = true),
                    AnswerModel(option = "Brunei", truth = false),
                    AnswerModel(option = "Qatar", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Geografia",
                question = "¿Cuál es la capital de Canadá?",
                answer = arrayListOf(
                    AnswerModel(option = "Toronto", truth = false),
                    AnswerModel(option = "Otawa", truth = true),
                    AnswerModel(option = "Montreal", truth = false),
                    AnswerModel(option = "Quebec", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Geografia",
                question = "¿Nombra la cordillera más larga (no más alta) del mundo?",
                answer = arrayListOf(
                    AnswerModel(option = "Cordillera Central", truth = false),
                    AnswerModel(option = "Himalaya", truth = false),
                    AnswerModel(option = "Montes Urales", truth = false),
                    AnswerModel(option = "Cordillera de los Andes", truth = true)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Geografia",
                question = "¿Cuál es el río más largo del mundo?",
                answer = arrayListOf(
                    AnswerModel(option = "Nilo", truth = true),
                    AnswerModel(option = "Amazonas", truth = false),
                    AnswerModel(option = "Elva", truth = false),
                    AnswerModel(option = "Yangtse", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Arte y literatura",
                question = "¿Qué artista pinto la obra Noche Estrellada?",
                answer = arrayListOf(
                    AnswerModel(option = "Van Gogh", truth = true),
                    AnswerModel(option = "Rafael", truth = false),
                    AnswerModel(option = "Monet", truth = false),
                    AnswerModel(option = "Caravaggio", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Arte y literatura",
                question = "¿Cuál es la serie de libros mejor vendida del siglo 21?",
                answer = arrayListOf(
                    AnswerModel(option = "Harry Potter", truth = true),
                    AnswerModel(option = "Juego de Tronos", truth = false),
                    AnswerModel(option = "El Señor de Los Anillos", truth = false),
                    AnswerModel(option = "Star Wars", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Arte y literatura",
                question = "¿Cuál es el idioma que tiene más palabras (según su diccionario)?",
                answer = arrayListOf(
                    AnswerModel(option = "Ingles", truth = true),
                    AnswerModel(option = "Español", truth = false),
                    AnswerModel(option = "Italiano", truth = false),
                    AnswerModel(option = "Frances", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Arte y literatura",
                question = "¿Qué artista pinto la Mona Lisa?",
                answer = arrayListOf(
                    AnswerModel(option = "Miguel Angel", truth = false),
                    AnswerModel(option = "Leonardo da Vinci", truth = true),
                    AnswerModel(option = "Dali", truth = false),
                    AnswerModel(option = "Rafael", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Arte y literatura",
                question = "¿Cuál es la obra más famosa de Edvard Munch?",
                answer = arrayListOf(
                    AnswerModel(option = "Ansiedad", truth = false),
                    AnswerModel(option = "El grito", truth = true),
                    AnswerModel(option = "El beso", truth = false),
                    AnswerModel(option = "Madonna", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Historia",
                question = "¿Cuándo se inauguró el metro de Londres?",
                answer = arrayListOf(
                    AnswerModel(option = "1901", truth = false),
                    AnswerModel(option = "1863", truth = true),
                    AnswerModel(option = "1899", truth = false),
                    AnswerModel(option = "1955", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Historia",
                question = "¿Quién inventó la World Wide Web, y cuándo?",
                answer = arrayListOf(
                    AnswerModel(option = "Steve Jobs", truth = false),
                    AnswerModel(option = "Larry Ellisons", truth = false),
                    AnswerModel(option = "Elon Musk", truth = false),
                    AnswerModel(option = "Tim Berners", truth = true)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Historia",
                question = "¿Quién fue el fundador de Tesla Motors?",
                answer = arrayListOf(
                    AnswerModel(option = "Thomas Alba Edison", truth = false),
                    AnswerModel(option = "Elon Musk", truth = true),
                    AnswerModel(option = "Nicola Tesla", truth = false),
                    AnswerModel(option = "Henry Ford", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Historia",
                question = "¿Qué ocurrió el 20 de Julio de 1969?",
                answer = arrayListOf(
                    AnswerModel(option = "El alunizaje del Apollo 11", truth = true),
                    AnswerModel(option = "El asesinato de Martin Luther King", truth = false),
                    AnswerModel(option = "Asesinato de Jhon F Keneddy", truth = false),
                    AnswerModel(option = "El desastre de Chernóbil", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Historia",
                question = "¿Cuándo se publicó la primera edición de la revista Vogue?",
                answer = arrayListOf(
                    AnswerModel(option = "1995", truth = false),
                    AnswerModel(option = "1955", truth = false),
                    AnswerModel(option = "1892", truth = true),
                    AnswerModel(option = "1899", truth = false)
                )

            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Cultura y musica",
                question = "¿En qué país nació Héctor Lavoe?",
                answer = arrayListOf(
                    AnswerModel(option = "Puerto Rico", truth = true),
                    AnswerModel(option = "Republica Dominicana", truth = false),
                    AnswerModel(option = "Cuba", truth = false),
                    AnswerModel(option = "Colombia", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Cultura y musica",
                question = "¿De qué país son originarios los Beatles?",
                answer = arrayListOf(
                    AnswerModel(option = "Estados Unidos", truth = false),
                    AnswerModel(option = "Inglaterra", truth = true),
                    AnswerModel(option = "Mexico", truth = false),
                    AnswerModel(option = "Alemania", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Cultura y musica",
                question = "¿Cuántas son las notas musicales? ?",
                answer = arrayListOf(
                    AnswerModel(option = "7", truth = true),
                    AnswerModel(option = "5", truth = false),
                    AnswerModel(option = "4", truth = false),
                    AnswerModel(option = "9", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Cultura y musica",
                question = "¿El bandoneón se utiliza en él?",
                answer = arrayListOf(
                    AnswerModel(option = "Tango", truth = true),
                    AnswerModel(option = "Jazz", truth = false),
                    AnswerModel(option = "Flamenco", truth = false),
                    AnswerModel(option = "Blues", truth = false)
                )
            ),
            TrivkModel(
                id = UUID.randomUUID().toString(),
                category = "Cultura y musica",
                question = "¿Cuántas teclas tiene un piano?",
                answer = arrayListOf(
                    AnswerModel(option = "55", truth = false),
                    AnswerModel(option = "90", truth = false),
                    AnswerModel(option = "88", truth = true),
                    AnswerModel(option = "100", truth = false)
                )
            )
        )
    }

    fun TrivkModel.toTrivkEntity(): TrivkEntity = TrivkEntity(
        id = id,
        category = category,
        question = question,
        answerUser = answerUser,
        winds = winds
        //answer = answer
    )

    fun TrivkEntity.toTrivkModel(): TrivkModel = TrivkModel(
        id = id,
        category = category,
        question = question,
        answerUser = answerUser,
        winds = winds,
        answer = arrayListOf()
    )
}