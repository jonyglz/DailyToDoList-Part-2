//Daily Schedule
//Author: Jonathan Gonzalez
//Title: Daily To Do - Part 2.1.kt

fun firstOption(): Pair<String?, Int> {
    println()
    println("Write your task: ")
    val new_task = readLine()
    println("Time: ")
    val new_time = Integer.valueOf(readLine())
    return Pair(new_task,new_time)
}

fun secondOption(schedule: MutableList<String>, time:MutableList<Int>){
    for(index in 0..schedule.size-1){
        println()
        println("${index+1}. ${schedule[index]} at ${time[index]}")
    }
}

fun thirdOption(schedule: MutableList<String>, time: MutableList<Int>){
    print("Which element do you want to remove?")
    val remove_item = Integer.valueOf(readLine())
    schedule.removeAt(remove_item-1)
    time.removeAt(remove_item-1)
}

fun main() {
    var option:Int = -1
    val schedule = mutableListOf<String>()
    val time = mutableListOf<Int>()

    while(option != 0) {

        println()
        println("Welcome to your daily schedule: ")
        println("0. Quit.")
        println("1. Add task")
        println("2. View Tasks")
        println("3. Remove Tasks")
        println()

        option = Integer.valueOf(readLine())

        if (option == 1) {
            val (new_task,new_time) = firstOption()
            schedule.add(new_task!!)
            time.add(new_time!!)
        }

        if (option == 2) {
            secondOption(schedule,time)

        }

        if (option == 3) {
            secondOption(schedule,time)
            thirdOption(schedule,time)
            secondOption(schedule,time)
            }
        }

        if(option ==0 ){
            println("Good bye!")
        }
    }