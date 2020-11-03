package com.example.openapi.repository.main

import com.example.openapi.di.main.MainScope
import com.example.openapi.models.AuthToken
import com.example.openapi.ui.main.create_blog.state.CreateBlogViewState
import com.example.openapi.util.DataState
import com.example.openapi.util.StateEvent
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.Flow
import okhttp3.MultipartBody
import okhttp3.RequestBody

@FlowPreview
@MainScope
interface CreateBlogRepository {

    fun createNewBlogPost(
        authToken: AuthToken,
        title: RequestBody,
        body: RequestBody,
        image: MultipartBody.Part?,
        stateEvent: StateEvent
    ): Flow<DataState<CreateBlogViewState>>
}