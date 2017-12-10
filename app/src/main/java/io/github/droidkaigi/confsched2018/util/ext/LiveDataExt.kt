package io.github.droidkaigi.confsched2018.util.ext

import android.arch.lifecycle.LifecycleOwner
import android.arch.lifecycle.LiveData
import android.arch.lifecycle.Observer

fun <T> LiveData<T>.observe(owner: LifecycleOwner, observer: (T?) -> Unit)
        = observe(owner, Observer<T> { v -> observer.invoke(v) })

