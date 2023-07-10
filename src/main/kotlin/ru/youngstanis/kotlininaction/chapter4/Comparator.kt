package ru.youngstanis.kotlininaction.chapter4

import java.io.File

object CaseInsensitiveFileComparator : Comparator<File> {
    override fun compare(file1: File, file2: File): Int {
        return file1.path.compareTo(file2.path, ignoreCase = true)
    }
}

data class PersonWithComparator(
    val name: String,
    val age: Int,
    val isWorking: Boolean
) {
    object NameComparator : Comparator<PersonWithComparator> {
        override fun compare(person1: PersonWithComparator, person2: PersonWithComparator): Int {
            return person1.name.compareTo(person2.name)
        }
    }

    // Неправильно, так как компаратор должен быть того же типа, что и класс сравниваемого объекта

    // object NameComparator2 : Comparator<String> {
    //     override fun compare(o1: String, o2: String): Int {
    //         return o1.compareTo(o2)
    //     }
    // }

    object AgeComparator : Comparator<PersonWithComparator> {
        override fun compare(person1: PersonWithComparator, person2: PersonWithComparator): Int {
            return person1.age.compareTo(person2.age)
        }
    }

    override fun equals(other: Any?): Boolean {
        if(other == null || other !is PersonWithComparator) {
            return false
        }
        return  this.name == other.name &&
                this.age == other.age &&
                this.isWorking == other.isWorking
    }

    override fun hashCode(): Int =
        this.name.hashCode() * 31 + this.age + this.isWorking.hashCode()

    override fun toString(): String {
        return """
                 |PersonWithComparator 
                 |{ 
                 |   "name" = $name,
                 |   "age" = $age,
                 |   "isWorking" = $isWorking
                 |}
                 |""".trimMargin()
    }
}

fun main() {
    CaseInsensitiveFileComparator.compare(File("/UsEr"), File("/USER"))

    val files = listOf(File("/d"), File("/h"), File("/H"))
    println(files.sortedWith(CaseInsensitiveFileComparator))

    val persons = listOf(
        PersonWithComparator("Stas", 23, true),
        PersonWithComparator("Misha", 18, true),
        PersonWithComparator("Sergey", 19, false),
        PersonWithComparator("Nikita", 24,true),
        PersonWithComparator("Roma", 30,true)
    )

    println(persons.sortedWith(PersonWithComparator.AgeComparator))
    println(persons.sortedWith(PersonWithComparator.NameComparator))
    // println(persons.sortedWith(PersonWithComparator.NameComparator2.toString()))

    persons.forEach{person -> println(person)}
}
