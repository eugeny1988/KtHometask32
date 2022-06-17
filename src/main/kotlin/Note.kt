class Note(
    val ownerId: Int,
    val title: String,
    var text: String,
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

    fun deleteComment(note: Note, commentId: Int): Boolean {
        try {
            note.commentsList.removeAt(commentId)
        } catch (e: Exception) {
            return false
        }
        return true
        note.commentsList.get(commentId).isCommentDeleted = true
    }
    fun edit(note: Note, text: String): Boolean{
        note.text = text
        return true
    }
    fun editComment(commentId: Int,note: Note, text: String): Boolean{
        return if (!note.commentsList.get(commentId).isCommentDeleted) {
            note.commentsList.get(commentId).message = text
            true
        } else return false
    }
    fun get(ownerId:Int): List<Note>{

    }




}