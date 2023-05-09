package com.tswanarecipe.app.modules.filter.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.filter.`data`.model.FilterModel
import com.tswanarecipe.app.modules.filter.`data`.model.FilterRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class FilterVM : ViewModel(), KoinComponent {
  val filterModel: MutableLiveData<FilterModel> = MutableLiveData(FilterModel())

  var navArguments: Bundle? = null

  val filterList: MutableLiveData<MutableList<FilterRowModel>> = MutableLiveData(mutableListOf())
}
