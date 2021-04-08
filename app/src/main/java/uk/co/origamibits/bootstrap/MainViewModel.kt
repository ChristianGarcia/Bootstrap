package uk.co.origamibits.bootstrap

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import dagger.hilt.android.lifecycle.HiltViewModel
import uk.co.origamibits.bootstrap.feature1.Feature1Repository
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val repo: Feature1Repository
) : ViewModel() {
    val text = liveData { emit(repo.load()) }

}