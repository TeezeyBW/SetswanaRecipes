package com.tswanarecipe.app.modules.savedrecipe.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class SavedRecipeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_saved_recipes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtThirty: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoodtitleThree: String? =
      MyApp.getInstance().resources.getString(R.string.msg_lamb_chops_with)

)
