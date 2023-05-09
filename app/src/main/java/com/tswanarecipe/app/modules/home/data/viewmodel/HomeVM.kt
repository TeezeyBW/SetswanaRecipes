package com.tswanarecipe.app.modules.home.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.home.`data`.model.CardsRowModel
import com.tswanarecipe.app.modules.home.`data`.model.HomeModel
import com.tswanarecipe.app.modules.home.`data`.model.NewrecipetwoRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeVM : ViewModel(), KoinComponent {
  val homeModel: MutableLiveData<HomeModel> = MutableLiveData(HomeModel())

  var navArguments: Bundle? = null

  val cardsList: MutableLiveData<MutableList<CardsRowModel>> = MutableLiveData(mutableListOf())

  val newRecipeTwoList: MutableLiveData<MutableList<NewrecipetwoRowModel>> =
      MutableLiveData(mutableListOf())
}
