package com.tswanarecipe.app.modules.searchresult.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class SearchResultModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_recipes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchResult: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_result)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtResultsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_results)

)
