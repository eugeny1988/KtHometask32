class Main {
    var comment1 = NoteComments(
        1,
        1,
        "Первый коммент",
        false
    )
    var comment2 = NoteComments(
        1,
        2,
        "Второй коммент",
        false
    )
    var commentsList1 = mutableListOf<NoteComments>(comment1, comment2)
    val note1 = Note(
        1,
        1,
        "Привет!",
        "Новая заметка",
        commentsList1
        )
    var comment3 = NoteComments(
        2,
        1,
        "Третий коммент",
        false
    )
    var comment4 = NoteComments(
        2,
        2,
        "Четвёртый коммент",
        false
    )
    var commentsList2 = mutableListOf<NoteComments>(comment3, comment4)
    val note2 = Note(
        2,
        2,
        "Привет!",
        "Новая заметка",
        commentsList2
    )

    fun main() {
        val note: String
    }
}