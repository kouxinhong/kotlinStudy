package kouzi.com.kotlin1

import android.databinding.BaseObservable
import android.databinding.Bindable
import kouzi.com.kotlin.BR

/**
 * Created by kxh on 2017/11/23.
 */
class Repository(repositoryName: String?,var repositoryOwner: String?,var numberOfStars: Int? ,var hasIssues: Boolean = false) : BaseObservable(){
    /**
     * 观察者模式，实现不用
     *  binding.repository = repository
     *  binding.executePendingBindings()
     *  更新数据
     */
    @get:Bindable
    var repositoryName : String = ""
    set(value) {
        field = value
        notifyPropertyChanged(BR.repositoryName)
    }
}
