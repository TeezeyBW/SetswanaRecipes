package com.tswanarecipe.app.modules.filter.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class FilterModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFilterSearch: String? = MyApp.getInstance().resources.getString(R.string.lbl_filter_search)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_time)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_newest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_oldest)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtComponentFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_popularity)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRate: String? = MyApp.getInstance().resources.getString(R.string.lbl_rate)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_52)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_4)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_32)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_22)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFiveFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_1)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCategory: String? = MyApp.getInstance().resources.getString(R.string.lbl_category)

)
