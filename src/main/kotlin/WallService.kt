package ru.netology

object WallService {
    private var posts = emptyArray<Post>()
    private var lastId = 1

    fun add(post: Post) : Post {
        post.id = lastId++
        posts += post
        return posts.last()
    }

    fun printPosts() {
        for ((index, value) in posts.withIndex()) {
            println("Значение индекса $index содержимое $value")
        }
    }
}