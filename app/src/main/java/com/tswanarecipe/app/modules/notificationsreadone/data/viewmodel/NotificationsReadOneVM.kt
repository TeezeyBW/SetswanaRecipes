package com.tswanarecipe.app.modules.notificationsreadone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.notificationsreadone.`data`.model.ListunsplashRowModel
import com.tswanarecipe.app.modules.notificationsreadone.`data`.model.NotificationsReadOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsReadOneVM : ViewModel(), KoinComponent {
  val notificationsReadOneModel: MutableLiveData<NotificationsReadOneModel> =
      MutableLiveData(NotificationsReadOneModel())

  var navArguments: Bundle? = null

  val listunsplashList: MutableLiveData<MutableList<ListunsplashRowModel>> =
      MutableLiveData(mutableListOf())
}
