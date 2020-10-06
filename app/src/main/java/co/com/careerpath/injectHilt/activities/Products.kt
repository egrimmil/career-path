package co.com.careerpath.injectHilt.activities

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import co.com.careerpath.injectHilt.AppModule
import co.com.careerpath.injectHilt.viewModels.ProductsViewModel
import co.com.careerpath.models.Product
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

/**
 * Created by Elkin Fracica on 10/6/20.
 */
@AndroidEntryPoint
/** define que se va hacer una inyeccion (activity, fragment, views, service, broadcastReciever)*/
class Products : AppCompatActivity() {

    @Inject
    lateinit var product: Product


    private val viewModel: ProductsViewModel by viewModels()

    private val viewMod : ProductsViewModel
    get() = ViewModelProvider(this).get(ProductsViewModel::class.java)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }
}