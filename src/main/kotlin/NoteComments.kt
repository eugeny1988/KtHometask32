data class NoteComments(
    val noteId: Int,
    val commentId:Int,
    var message: String,
    var isCommentDeleted: Boolean
) {
}