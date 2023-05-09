package com.tswanarecipe.app.modules.recipeingridentshare.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingridentshare.`data`.model.RecipeIngridentShareModel
import org.koin.core.KoinComponent

class RecipeIngridentShareVM : ViewModel(), KoinComponent {
  val recipeIngridentShareModel: MutableLiveData<RecipeIngridentShareModel> =
      MutableLiveData(RecipeIngridentShareModel())

  var navArguments: Bundle? = null
}
