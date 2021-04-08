package uk.co.origamibits.bootstrap.feature1

import javax.inject.Inject


class Feature1RepositoryImpl @Inject constructor() : Feature1Repository {
    override suspend fun load(): String =
        "Hello world"
}