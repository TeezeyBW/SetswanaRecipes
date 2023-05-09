package com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.model.Recipe2RowModel
import com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.model.RecipeIngridentRateRecipeOneModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecipeIngridentRateRecipeOneVM : ViewModel(), KoinComponent {
  val recipeIngridentRateRecipeOneModel: MutableLiveData<RecipeIngridentRateRecipeOneModel> =
      MutableLiveData(RecipeIngridentRateRecipeOneModel())

  var navArguments: Bundle? = null

  val recipeList: MutableLiveData<MutableList<Recipe2RowModel>> = MutableLiveData(mutableListOf())
}
