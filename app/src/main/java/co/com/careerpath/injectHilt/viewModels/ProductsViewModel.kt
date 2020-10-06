package co.com.careerpath.injectHilt.viewModels

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import co.com.careerpath.models.Product

/**
 * Created by Elkin Fracica on 10/6/20.
 */
class ProductsViewModel @ViewModelInject constructor(val product: Product): ViewModel() {

}