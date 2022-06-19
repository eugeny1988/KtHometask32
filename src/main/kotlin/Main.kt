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
var noteList = mutableListOf<Note>(note1, note2)
val note3 = Note(
    3,
    1,
    "Привет!",
    "Новая заметка",
    commentsList1
)

fun main() {
    val added = note1.add(noteList, note3)
    val newCommentIndex = note1.createComment("Ещё один комментарий")
    val deleteComment = note1.deleteComment(13)
    val editNote2 = note2.edit("Новая запись")
    val editedComments = note3.editComment(2, "Привет")
    val listOfNotes = note1.get(1, noteList)
    val noteById = note2.getById(1, noteList)
    val commentsList = note3.getComments()

}