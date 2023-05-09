package com.tswanarecipe.app.modules.recipeingrident.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingrident.`data`.model.IngridientlistRowModel
import com.tswanarecipe.app.modules.recipeingrident.`data`.model.RecipeIngridentModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecipeIngridentVM : ViewModel(), KoinComponent {
  val recipeIngridentModel: MutableLiveData<RecipeIngridentModel> =
      MutableLiveData(RecipeIngridentModel())

  var navArguments: Bundle? = null

  val ingridientListList: MutableLiveData<MutableList<IngridientlistRowModel>> =
      MutableLiveData(mutableListOf())
}
