package com.tswanarecipe.app.modules.recipeingridentmore.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class RecipeRowModel(
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
