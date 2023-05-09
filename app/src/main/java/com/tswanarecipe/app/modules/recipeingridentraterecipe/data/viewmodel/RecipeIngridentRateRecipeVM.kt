package com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.model.Recipe1RowModel
import com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.model.RecipeIngridentRateRecipeModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecipeIngridentRateRecipeVM : ViewModel(), KoinComponent {
  val recipeIngridentRateRecipeModel: MutableLiveData<RecipeIngridentRateRecipeModel> =
      MutableLiveData(RecipeIngridentRateRecipeModel())

  var navArguments: Bundle? = null

  val recipeList: MutableLiveData<MutableList<Recipe1RowModel>> = MutableLiveData(mutableListOf())
}
