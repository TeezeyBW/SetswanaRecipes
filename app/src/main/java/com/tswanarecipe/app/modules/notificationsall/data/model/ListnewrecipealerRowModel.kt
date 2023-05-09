package com.tswanarecipe.app.modules.notificationsall.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class ListnewrecipealerRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtNewRecipeAler: String? =
      MyApp.getInstance().resources.getString(R.string.msg_new_recipe_aler)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.msg_lorem_ipsum_tem3)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_mins_ago)

)
