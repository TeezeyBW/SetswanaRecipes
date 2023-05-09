package com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class Recipe2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTomatos: String? = MyApp.getInstance().resources.getString(R.string.lbl_tomatos)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWeight: String? = MyApp.getInstance().resources.getString(R.string.lbl_500g)

)
