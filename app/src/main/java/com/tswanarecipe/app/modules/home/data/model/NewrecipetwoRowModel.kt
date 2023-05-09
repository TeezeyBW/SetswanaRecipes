package com.tswanarecipe.app.modules.home.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class NewrecipetwoRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPilafsweetwit: String? =
      MyApp.getInstance().resources.getString(R.string.msg_pilaf_sweet_wit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNamelabelOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_by_laura_wilson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_mins)

)
