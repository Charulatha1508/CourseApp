package com.example.courseapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class CourseTopic(
    @StringRes val nameResourceId: Int,
    val numberOfCourse: Int,
    @DrawableRes val imageResourceId: Int
)
