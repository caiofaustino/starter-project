package dev.caiofaustino.starter.main.mvi

import dev.caiofaustino.mvi.MviProcessor
import dev.caiofaustino.starter.main.mvi.MainAction.ButtonClicked
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import logcat.logcat

class MainProcessor : MviProcessor<MainAction, MainResult, MainSideEffect> {
    private val _resultFlow = MutableSharedFlow<MainResult>()
    override val resultFlow: SharedFlow<MainResult> = _resultFlow.asSharedFlow()

    private val _sideEffectFlow = MutableSharedFlow<MainSideEffect>()
    override val sideEffectFlow: SharedFlow<MainSideEffect> = _sideEffectFlow.asSharedFlow()

    override suspend fun process(action: MainAction) {
        when (action) {
            ButtonClicked -> {
                logcat { "Button Clicked" }
            }
        }
    }
}
