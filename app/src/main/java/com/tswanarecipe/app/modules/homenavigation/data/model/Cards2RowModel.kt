package com.tswanarecipe.app.modules.homenavigation.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class Cards2RowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtMagwinyaandSe: String? =
      MyApp.getInstance().resources.getString(R.string.msg_magwinya_and_se)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_120_mins)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFortyFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_5)

)
