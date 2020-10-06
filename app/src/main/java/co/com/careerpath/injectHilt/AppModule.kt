package co.com.careerpath.injectHilt

import co.com.careerpath.models.Product
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ApplicationComponent
import javax.inject.Singleton

/**
 * Created by Elkin Fracica on 10/6/20.
 */
@Module /** define el modulo que tiene las dependencias */
@InstallIn(ApplicationComponent::class) /** se define en donde se va a instalar el modulo (application, activity, fragment) */
class AppModule {

    @Provides /** indica que se va a proveer esta dependencia */
    @Singleton /** indica que siempre se va a obtener lo mismo y no una nueva instancia */
    fun getData(): Product {
        return Product("1", "churrasco", "12000")
    }
}