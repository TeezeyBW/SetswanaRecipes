package com.tswanarecipe.app.modules.searchresult.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.searchresult.`data`.model.SearchResultModel
import org.koin.core.KoinComponent

class SearchResultVM : ViewModel(), KoinComponent {
  val searchResultModel: MutableLiveData<SearchResultModel> = MutableLiveData(SearchResultModel())

  var navArguments: Bundle? = null
}
