package uk.co.origamibits.bootstrap

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.liveData
import uk.co.origamibits.bootstrap.feature1.Feature1Repository
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val repo: Feature1Repository
) : ViewModel() {
    val text = liveData { emit(repo.load()) }

}