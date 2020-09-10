import org.junit.Test
import ru.netology.WallService
import org.junit.Assert.*
import ru.netology.Post


class WallServiceTest {

    @Test
    fun add() {

        val result = WallService.add(Post(text = "Hello", isFavorite = true))

        assertTrue(result.id != 0)
    }

    @Test
    fun update_True() {

        // заполняем несколькими постами
        WallService.add(Post(text = "Hello", isFavorite = true))
        WallService.add(Post(text = "Kotlin", isFavorite = false))
        WallService.add(Post(text = "How", isFavorite = true))
        WallService.add(Post(text = "You are", isFavorite = true))

        // создаём информацию об обновлении
        val update = Post(id = 3, text = "edited text", isFavorite = false)

        // выполняем целевое действие
        val result = WallService.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)

    }

    @Test
    fun update_False() {

        // заполняем несколькими постами
        WallService.add(Post(text = "Hello", isFavorite = true))
        WallService.add(Post(text = "Kotlin", isFavorite = false))
        WallService.add(Post(text = "How", isFavorite = true))
        WallService.add(Post(text = "You are", isFavorite = true))

        // создаём информацию об обновлении
        val update = Post(id = 5, text = "edited text", isFavorite = false)

        // выполняем целевое действие
        val result = WallService.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)

    }
}