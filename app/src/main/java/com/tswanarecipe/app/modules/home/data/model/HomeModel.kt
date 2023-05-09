package com.tswanarecipe.app.modules.home.`data`.model

import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.di.MyApp
import kotlin.String

data class HomeModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtHelloTetlo: String? = MyApp.getInstance().resources.getString(R.string.lbl_hello_tetlo)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWhatareyouco: String? =
      MyApp.getInstance().resources.getString(R.string.msg_what_are_you_co)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButton: String? = MyApp.getInstance().resources.getString(R.string.lbl_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_lunch)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_snacks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_beverages)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_fruit)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonFive: String? = MyApp.getInstance().resources.getString(R.string.lbl_vegetables)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonSix: String? = MyApp.getInstance().resources.getString(R.string.lbl_protein)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonSeven: String? = MyApp.getInstance().resources.getString(R.string.lbl_cereal)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtButtonEight: String? = MyApp.getInstance().resources.getString(R.string.lbl_local_dishes)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewRecipes: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_recipes)
  ,
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
