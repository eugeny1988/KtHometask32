import org.junit.Test

import org.junit.Assert.*
import kotlin.test.expect

class NoteTest {

    @Test
    fun add() {
        val note = note1
        val noteList1 = noteList
        val realValue = note1.add(noteList1, note)
        val expectedValue = noteList1.add(note)
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun createComment() {
        val realValue = note1.createComment("Тестовый коммент")
        val expectedValue = 3
        assertEquals(expectedValue, realValue)
    }

    @Test(expected = Throwable::class)
    fun delete() {
        val realValue = note2.delete(2, noteList)
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }
    @Test
    fun deleteTest() {
        val realValue = note2.delete(2, noteList)
        val expectedValue = false
        assertEquals(expectedValue, realValue)
    }

    @Test(expected = Throwable::class)
    fun deleteComment() {
        val realValue = note3.deleteComment(3)
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }
    @Test
    fun deleteCommentTest() {
        val realValue = note3.deleteComment(3)
        val expectedValue = false
        assertEquals(expectedValue, realValue)
    }

    @Test(expected = Throwable::class)
    fun edit() {
        val realValue = note1.edit("123")
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }
    @Test
    fun editTest() {
        val realValue = note1.edit("Изменённая заметка")
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun editComment() {
        val realValue = note1.editComment(1, "Хороший коммент")
        val expectedValue = true
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun get() {
        val realValue = note2.get(2, noteList)
        val expectedValue = mutableListOf<Note>(note2)
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun getById() {
        val realValue = note2.getById(2, noteList)
        val expectedValue = note2
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun getComments() {
        val realValue = note3.getComments()
        val expectedValue = note3.commentsList
        assertEquals(expectedValue, realValue)
    }

    @Test
    fun restoreComment() {
        val realValue = note1.restoreComment(1)
        val expectedValue = false
        assertEquals(expectedValue, realValue)
    }
}