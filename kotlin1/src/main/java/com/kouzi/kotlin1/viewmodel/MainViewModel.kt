package kouzi.com.kotlin1.viewmodel

import android.arch.lifecycle.ViewModel
import android.databinding.ObservableField
import kouzi.com.kotlin1.model.RepoModel

/**
 * Created by kxh on 2017/12/4.
 */
class MainViewModel : ViewModel() {
    var repoModel : RepoModel =  RepoModel()
//    val text = ObservableField<String>()
//    val isLaoding = ObservableField<Boolean>()
    val text = ObservableField("old data")
    val isLaoding = ObservableField(false)

    var onDataReadyCallBack = object : RepoModel.OnDataReadyCallBack {
        override fun onDataReady(data: String) {
            isLaoding.set(false)
            text.set(data)
        }
    }

    fun refresh(){
        isLaoding.set(true)
        repoModel.refreshData(object : RepoModel.OnDataReadyCallBack {
            override fun onDataReady(data: String) {
                isLaoding.set(false)
                text.set(data)
            }
        })
    }
}