package com.example.android.architecture.blueprints.todoapp.base

import android.os.Bundle
import androidx.fragment.app.Fragment
import com.example.android.architecture.blueprints.todoapp.util.Log

open class BaseFragment : Fragment() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("[${this.javaClass.simpleName}]")
    }
}