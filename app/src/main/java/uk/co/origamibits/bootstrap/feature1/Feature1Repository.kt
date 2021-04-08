package uk.co.origamibits.bootstrap.feature1

import uk.co.origamibits.bootstrap.feature1.model.Feature1Item

interface Feature1Repository {

    suspend fun load(): Feature1Item

    suspend fun loadMany(): List<Feature1Item>

}
