package com.e.kotlinexample.ui

import com.e.kotlinexample.util.DataState

interface DataStateListener {

    fun onDataStateChange(dataState: DataState<*>?)
}