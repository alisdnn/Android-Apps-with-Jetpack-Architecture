package com.example.openapi.fragments.main.create_blog

import androidx.fragment.app.FragmentFactory
import androidx.lifecycle.ViewModelProvider
import com.bumptech.glide.RequestManager
import com.example.openapi.di.main.MainScope
import com.example.openapi.ui.main.account.AccountFragment
import com.example.openapi.ui.main.blog.BlogFragment
import com.example.openapi.ui.main.blog.UpdateBlogFragment
import com.example.openapi.ui.main.blog.ViewBlogFragment
import com.example.openapi.ui.main.create_blog.CreateBlogFragment
import javax.inject.Inject

@MainScope
class CreateBlogFragmentFactory
@Inject
constructor(
    private val viewModelFactory: ViewModelProvider.Factory,
    private val requestManager: RequestManager
) : FragmentFactory() {

    override fun instantiate(classLoader: ClassLoader, className: String) =

        when (className) {

            CreateBlogFragment::class.java.name -> {
                CreateBlogFragment(viewModelFactory, requestManager)
            }

            else -> {
                CreateBlogFragment(viewModelFactory, requestManager)
            }
        }


}