package uk.co.origamibits.bootstrap

import androidx.lifecycle.*
import dagger.hilt.android.lifecycle.HiltViewModel
import uk.co.origamibits.bootstrap.feature1.Feature1Repository
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item
import javax.inject.Inject

@HiltViewModel
class ItemViewModel @Inject constructor(
    private val repo: Feature1Repository
) : ViewModel() {

    private val _load = MutableLiveData<String>()

    fun load(id: String) {
        _load.postValue(id)
    }

    val itemDetail: LiveData<Feature1Item> = _load.switchMap { id ->
        liveData {
            emit(repo.load(id))
        }
    }

}