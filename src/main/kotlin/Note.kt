class Note(
    val title: String,
    val text: String,
    val commentsList: MutableList<NoteComments>
) {
    fun add(noteList: MutableList<Note>, note: Note): Boolean {
        return noteList.add(note)
    }

    fun createComment(noteList: List<Note>, noteComments: NoteComments): Int {
        val note = noteList.get(noteComments.noteId)
        note.commentsList.add(noteComments)
        return note.commentsList.indexOf(noteComments)
    }

    fun delete(id: Int, noteList: MutableList<Note>): Boolean {
        try {
            noteList.removeAt(id)
        } catch (e: Exception) {
            return false
        }
        return true

    }


}