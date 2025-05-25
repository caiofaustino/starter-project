package dev.caiofaustino.starter.main.mvi

import android.util.Log
import dev.caiofaustino.mvi.MviProcessor
import dev.caiofaustino.starter.main.mvi.MainAction.ButtonClicked
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow

class MainProcessor : MviProcessor<MainAction, MainResult> {
    private val _resultFlow = MutableSharedFlow<MainResult>()
    override val resultFlow: Flow<MainResult> = _resultFlow.asSharedFlow()

    override fun process(action: MainAction) {
        when (action) {
            ButtonClicked -> {
                Log.e("TEST", "Button Clicked")
            }
        }
    }
}
