package com.tswanarecipe.app.modules.recipeingridentmore.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class RecipeIngridentMoreModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtForty: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_0)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_20_min)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFoodtitle: String? = MyApp.getInstance().resources.getString(R.string.msg_quarter_and_atc)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTotalreviews: String? = MyApp.getInstance().resources.getString(R.string.lbl_13k_reviews)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabel: String? = MyApp.getInstance().resources.getString(R.string.lbl_laura_wilson)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lagos_nigeria)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtServeCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_serve)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtItemsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_10_items)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_procedure)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_share)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLanguage: String? = MyApp.getInstance().resources.getString(R.string.lbl_rate_recipe)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_review)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLabelFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_unsave)

)
