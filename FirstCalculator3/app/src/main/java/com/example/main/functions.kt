package com.example.main

class Functions {

    fun containsChar(string: String, transactionsList: List<Char>): Boolean {
        if (negativeCheck(string)) {
            for (i in transactionsList) {
                if (string.substring(1, string.length).contains(i)) {
                    return true
                }
                return false
            }
        } else {
            for (i in transactionsList) {
                if (string.contains(i)) {
                    return true
                }
            }
        }
        return false
    }

    fun lastCharCheck(string: String, transactionsList: List<Char>): Boolean {
        for (char in transactionsList){
            if (string.last() == char){
                return true
            }
        }
        return false
    }

    fun negativeCheck(string: String): Boolean{
            if (string.first() == '-'){
                return true
        }
        return false
    }

    fun equal(string: String): String {
            if (string.contains('+')) {
                val a = string.substringBefore('+')
                val b = string.substringAfter('+')

                val conclude = a.toInt() + b.toInt()
                return conclude.toString()

            }else if (string.contains('x')) {
                val a = string.substringBefore('x')
                val b = string.substringAfter('x')

                val conclude = a.toInt() * b.toInt()
                return conclude.toString()

            } else if (string.contains('/')) {
                val a = string.substringBefore('/')
                val b = string.substringAfter('/')

                val conclude = a.toInt() / b.toInt()
                return conclude.toString()

            }else if (string.contains('-')) {
                if (negativeCheck(string)){
                    val newString = string.substring(1, string.length)

                    if (newString.contains('-')) {
                        val a = newString.substringBefore('-')
                        val b = newString.substringAfter('-')

                        val conclude = - a.toInt() - b.toInt()
                        return conclude.toString()
                    }
                }else {
                    val a = string.substringBefore('-')
                    val b = string.substringAfter('-')

                    val conclude = a.toInt() - b.toInt()
                    return conclude.toString()
                }
            }
        return string
    }
}

