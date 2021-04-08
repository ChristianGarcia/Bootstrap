package uk.co.origamibits.bootstrap.feature1

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent
import dagger.hilt.components.SingletonComponent

@InstallIn(SingletonComponent::class)
@Module
interface Feature1Module {

    @Binds
    fun repo(impl: Feature1RepositoryImpl): Feature1Repository

}
