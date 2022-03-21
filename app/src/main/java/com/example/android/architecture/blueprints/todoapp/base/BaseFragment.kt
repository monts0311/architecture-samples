package com.example.android.architecture.blueprints.todoapp.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import timber.log.Timber

open class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("[${this.javaClass.simpleName}]")
    }
}