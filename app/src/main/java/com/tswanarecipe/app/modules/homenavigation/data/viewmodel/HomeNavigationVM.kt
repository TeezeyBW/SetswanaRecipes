package com.tswanarecipe.app.modules.homenavigation.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.homenavigation.`data`.model.Cards2RowModel
import com.tswanarecipe.app.modules.homenavigation.`data`.model.CardsnewrecipRowModel
import com.tswanarecipe.app.modules.homenavigation.`data`.model.HomeNavigationModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class HomeNavigationVM : ViewModel(), KoinComponent {
  val homeNavigationModel: MutableLiveData<HomeNavigationModel> =
      MutableLiveData(HomeNavigationModel())

  var navArguments: Bundle? = null

  val cardsList: MutableLiveData<MutableList<Cards2RowModel>> = MutableLiveData(mutableListOf())

  val cardsNewRecipList: MutableLiveData<MutableList<CardsnewrecipRowModel>> =
      MutableLiveData(mutableListOf())
}
