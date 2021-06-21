package com.rsschool.quiz

interface Navigator {
    fun startQuiz()
    fun showNext()
    fun showPrevious()
    fun showResult()
    fun sendResult()
    fun closeQuiz()
}