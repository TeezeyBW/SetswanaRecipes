package com.tswanarecipe.app.modules.notificationsread.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.notificationsread.`data`.model.Listnewrecipealer1RowModel
import com.tswanarecipe.app.modules.notificationsread.`data`.model.ListnewrecipealerTwo1RowModel
import com.tswanarecipe.app.modules.notificationsread.`data`.model.NotificationsReadModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class NotificationsReadVM : ViewModel(), KoinComponent {
  val notificationsReadModel: MutableLiveData<NotificationsReadModel> =
      MutableLiveData(NotificationsReadModel())

  var navArguments: Bundle? = null

  val listnewrecipealerList: MutableLiveData<MutableList<Listnewrecipealer1RowModel>> =
      MutableLiveData(mutableListOf())

  val listnewrecipealerTwoList: MutableLiveData<MutableList<ListnewrecipealerTwo1RowModel>> =
      MutableLiveData(mutableListOf())
}
