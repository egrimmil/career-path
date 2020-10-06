package co.com.careerpath.injectHilt

import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

/**
 * Created by Elkin Fracica on 10/6/20.
 */
@Module
@InstallIn(ActivityRetainedComponent::class) /** sobrevive en el ciclo de viva del viewmodel */
class ProductsModule {
}