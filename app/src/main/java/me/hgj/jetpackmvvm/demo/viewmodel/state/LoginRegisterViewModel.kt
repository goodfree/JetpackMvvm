package me.hgj.jetpackmvvm.demo.viewmodel.state

import android.app.Application
import me.hgj.jetpackmvvm.base.viewmodel.BaseViewModel
import me.hgj.jetpackmvvm.callback.databind.BooleanObservableField
import me.hgj.jetpackmvvm.callback.databind.StringObservableField
import me.hgj.jetpackmvvm.callback.livedata.BooleanLiveData
import me.hgj.jetpackmvvm.callback.livedata.StringLiveData

/**
 * 作者　: hegaojian
 * 时间　: 2019/12/23
 * 描述　:登录注册的Viewmodel
 */
class LoginRegisterViewModel(application: Application) : BaseViewModel(application) {

    //用户名
    var username = StringObservableField()

    //密码(登录注册界面)
    var password = StringObservableField()

    var password2 = StringObservableField()

    //是否显示明文密码（登录注册界面）
    var isShowPwd = BooleanObservableField()

    var isShowPwd2 = BooleanObservableField()

}