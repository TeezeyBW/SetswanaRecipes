package com.tswanarecipe.app.modules.savedrecipe.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class SavedRecipeRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoodtitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_gemere)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreator: String? = MyApp.getInstance().resources.getString(R.string.lbl_by_boity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_320_min)

)
