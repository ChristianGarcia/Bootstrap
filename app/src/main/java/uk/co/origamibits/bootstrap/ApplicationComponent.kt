package uk.co.origamibits.bootstrap

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Component
import dagger.MapKey
import dagger.Module
import dagger.android.AndroidInjectionModule
import javax.inject.Inject
import javax.inject.Provider
import kotlin.reflect.KClass

@Component(modules = [AndroidInjectionModule::class, AppModule::class, MainModule::class])
interface ApplicationComponent {
    fun inject(mainApplication: MainApplication)

}

@Module
interface AppModule {

    @Binds
    fun viewModelFactory(impl: ViewModelFactory): ViewModelProvider.Factory

}

class ViewModelFactory @Inject constructor(private val viewModelsMap: MutableMap<Class<out ViewModel>, Provider<ViewModel>>) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T =
        viewModelsMap[modelClass]?.get() as T
}

@MapKey
annotation class ViewModelKey(val value: KClass<out ViewModel>)