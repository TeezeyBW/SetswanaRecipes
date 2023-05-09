package com.tswanarecipe.app.modules.notificationsunread.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.Listnewrecipealer2RowModel
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.ListnewrecipealerTwo2RowModel
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.NotificationsUnreadModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsUnreadVM : ViewModel(), KoinComponent {
  val notificationsUnreadModel: MutableLiveData<NotificationsUnreadModel> =
      MutableLiveData(NotificationsUnreadModel())

  var navArguments: Bundle? = null

  val listnewrecipealerList: MutableLiveData<MutableList<Listnewrecipealer2RowModel>> =
      MutableLiveData(mutableListOf())

  val listnewrecipealerTwoList: MutableLiveData<MutableList<ListnewrecipealerTwo2RowModel>> =
      MutableLiveData(mutableListOf())
}
