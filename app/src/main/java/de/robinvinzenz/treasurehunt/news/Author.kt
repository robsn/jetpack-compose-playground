package de.robinvinzenz.treasurehunt.news

data class Author(val name: String, val firstName: String, val avatar: Int)

fun Author.displayName() = "${this.firstName} ${this.name}"