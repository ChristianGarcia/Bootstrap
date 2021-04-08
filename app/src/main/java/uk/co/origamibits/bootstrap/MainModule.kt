package uk.co.origamibits.bootstrap

import androidx.lifecycle.ViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap
import uk.co.origamibits.bootstrap.feature1.Feature1Module


@Module(includes = [Feature1Module::class])
interface MainModule {
    @ContributesAndroidInjector
    fun mainActivity(): MainActivity

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun mainViewModel(mainViewModel: MainViewModel): ViewModel

}
