package com.tswanarecipe.app.modules.notificationsreadone.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class NotificationsReadOneModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtTitle: String? = MyApp.getInstance().resources.getString(R.string.lbl_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCommentsCounter: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_200_comments)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSavedCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_155_saved)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_leave_a_comment)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaceholder: String? = MyApp.getInstance().resources.getString(R.string.msg_say_something)

)
