package com.tswanarecipe.app.modules.homenavigation.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class CardsnewrecipRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPapandBraai: String? = MyApp.getInstance().resources.getString(R.string.lbl_pap_and_braai)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamelabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_by_james_milner)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_50_mins)

)
