package com.tswanarecipe.app.modules.filter.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class FilterRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentOneOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentFourOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_cereal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegetables)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_dinner)

)
