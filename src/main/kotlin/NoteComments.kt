data class NoteComments(
    val noteId: Int,
    val commentId:String,
    var message: String,
    var isCommentDeleted: Boolean
) {
}