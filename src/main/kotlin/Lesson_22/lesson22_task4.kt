package org.example.Lesson_22

import java.lang.Thread.sleep

fun main() {
    val mainScreenViewModel = MainScreenViewModel(MainScreenState("какие то данные"))
    mainScreenViewModel.loadData()
}

enum class LoadingStatus(val value: String) {
    FALSE("отсутствие данных"),
    LOADING("загрузка данных"),
    DONE("наличие загруженных данных")
}

data class MainScreenState(val data: String, val isLoading: LoadingStatus = LoadingStatus.FALSE)

class MainScreenViewModel(var mainScreenState: MainScreenState) {
    fun loadData() {
        println("${mainScreenState.data},${mainScreenState.isLoading} - ${mainScreenState.isLoading.value}")
        sleep(1000)

        mainScreenState = mainScreenState.copy(isLoading = LoadingStatus.LOADING)
        println("${mainScreenState.data},${mainScreenState.isLoading} - ${mainScreenState.isLoading.value}")
        sleep(1000)

        mainScreenState = mainScreenState.copy(isLoading = LoadingStatus.DONE)
        println("${mainScreenState.data},${mainScreenState.isLoading} - ${mainScreenState.isLoading.value}")

    }

}