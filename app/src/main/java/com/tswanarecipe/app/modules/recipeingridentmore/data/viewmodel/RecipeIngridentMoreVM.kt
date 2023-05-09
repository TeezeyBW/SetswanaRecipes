package com.tswanarecipe.app.modules.recipeingridentmore.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingridentmore.`data`.model.RecipeIngridentMoreModel
import com.tswanarecipe.app.modules.recipeingridentmore.`data`.model.RecipeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class RecipeIngridentMoreVM : ViewModel(), KoinComponent {
  val recipeIngridentMoreModel: MutableLiveData<RecipeIngridentMoreModel> =
      MutableLiveData(RecipeIngridentMoreModel())

  var navArguments: Bundle? = null

  val recipeList: MutableLiveData<MutableList<RecipeRowModel>> = MutableLiveData(mutableListOf())
}
