package kouzi.com.kotlin1.model

import android.os.Handler

/**
 * Created by kxh on 2017/12/4.
 */
class RepoModel {

    fun refreshData(onDataReadyCallBack : OnDataReadyCallBack)  {
        Handler().postDelayed({onDataReadyCallBack.onDataReady("new Data")},2000)
    }

    interface OnDataReadyCallBack {
        fun onDataReady(data : String)
    }
}