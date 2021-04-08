package uk.co.origamibits.bootstrap.feature1

import kotlinx.coroutines.withContext
import timber.log.Timber
import uk.co.origamibits.bootstrap.IoDispatcher
import uk.co.origamibits.bootstrap.feature1.model.Feature1Item
import javax.inject.Inject
import kotlin.coroutines.CoroutineContext

class Feature1RepositoryImpl @Inject constructor(
    @IoDispatcher private val workDispatcher: CoroutineContext
) : Feature1Repository {
    override suspend fun load(): Feature1Item =
        withContext(workDispatcher) {
            Timber.d("Thread: ${Thread.currentThread()}")
            Feature1Item(value = "Hello world")
        }

    override suspend fun loadMany(): List<Feature1Item> =
        withContext(workDispatcher) {
            Timber.d("Thread: ${Thread.currentThread()}")
            (0..20).map { "Item $it" }.map { Feature1Item(value = it) }
        }

    override suspend fun load(id: String): Feature1Item =
        withContext(workDispatcher) {
            Feature1Item(
                id = id,
                value = "Detail of $id"
            )
        }

}
