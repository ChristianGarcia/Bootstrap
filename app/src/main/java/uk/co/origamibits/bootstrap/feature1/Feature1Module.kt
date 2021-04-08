package uk.co.origamibits.bootstrap.feature1

import dagger.Binds
import dagger.Module

@Module
interface Feature1Module {

    @Binds
    fun repo(impl: Feature1RepositoryImpl): Feature1Repository

}
