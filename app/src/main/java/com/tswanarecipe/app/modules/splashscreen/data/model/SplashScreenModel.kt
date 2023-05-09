package com.tswanarecipe.app.modules.splashscreen.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class SplashScreenModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.msg_100_tswana_cui)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHeadertitle: String? =
      MyApp.getInstance().resources.getString(R.string.msg_setswana_cookin)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCaption: String? = MyApp.getInstance().resources.getString(R.string.msg_simple_way_to_f)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_start_cooking)

)
