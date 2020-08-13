# Lifecycle

**LifeCycle：通过观 察者模式+注解 让我们更方便的监听Activity和Fragment的生命周期。**

```kotlin
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent
import timber.log.Timber

/**
 * Created by littonishir on 2020/8/14.
 */
class MyLifecycle(private val lifecycle: Lifecycle) : LifecycleObserver {

    /**
     * 将Lifecycle对象传进来，
     * 我们就可以在任何地方主动来获取当前的生命周期状态。
     * Lifecycle.State 是一个枚举类型，共如下五种状态类型。
     */
    private fun getCurrentState() {
        when (lifecycle.currentState) {
            Lifecycle.State.INITIALIZED -> {
                Timber.e("INITIALIZED")
            }
            Lifecycle.State.CREATED -> {
                Timber.e("CREATED")
            }
            Lifecycle.State.STARTED -> {
                Timber.e("STARTED")
            }
            Lifecycle.State.RESUMED -> {
                Timber.e("RESUMED")
            }
            Lifecycle.State.DESTROYED -> {
                Timber.e("DESTROYED")
            }
        }

    }

    /**
     * Lifecycle.Event 是一个枚举类型，共七种状态类型
     * 这里展示了六种，Lifecycle.Event.ON_ANY 可以匹配任何生命周期回调。
     */
    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun create() {
        Timber.e("ON_CREATE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    fun start() {
        Timber.e("ON_START")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun resume() {
        getCurrentState()
        Timber.e("ON_RESUME")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun pause() {
        getCurrentState()
        Timber.e("ON_PAUSE")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    fun stop() {
        Timber.e("ON_STOP")
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun destroy() {
        Timber.e("ON_DESTROY")
    }
}
```

