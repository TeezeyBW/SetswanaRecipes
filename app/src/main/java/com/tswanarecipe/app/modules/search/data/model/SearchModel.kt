package com.tswanarecipe.app.modules.search.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class SearchModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_search_recipes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRecentSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_recent_search)

)
