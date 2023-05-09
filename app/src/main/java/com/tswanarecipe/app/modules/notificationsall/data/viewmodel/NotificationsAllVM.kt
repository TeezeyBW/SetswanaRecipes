package com.tswanarecipe.app.modules.notificationsall.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerRowModel
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerTwoRowModel
import com.tswanarecipe.app.modules.notificationsall.`data`.model.NotificationsAllModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsAllVM : ViewModel(), KoinComponent {
  val notificationsAllModel: MutableLiveData<NotificationsAllModel> =
      MutableLiveData(NotificationsAllModel())

  var navArguments: Bundle? = null

  val listnewrecipealerList: MutableLiveData<MutableList<ListnewrecipealerRowModel>> =
      MutableLiveData(mutableListOf())

  val listnewrecipealerTwoList: MutableLiveData<MutableList<ListnewrecipealerTwoRowModel>> =
      MutableLiveData(mutableListOf())
}
