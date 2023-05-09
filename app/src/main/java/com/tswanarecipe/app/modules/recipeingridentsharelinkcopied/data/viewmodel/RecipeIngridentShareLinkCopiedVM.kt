package com.tswanarecipe.app.modules.recipeingridentsharelinkcopied.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeingridentsharelinkcopied.`data`.model.RecipeIngridentShareLinkCopiedModel
import org.koin.core.KoinComponent

class RecipeIngridentShareLinkCopiedVM : ViewModel(), KoinComponent {
  val recipeIngridentShareLinkCopiedModel: MutableLiveData<RecipeIngridentShareLinkCopiedModel> =
      MutableLiveData(RecipeIngridentShareLinkCopiedModel())

  var navArguments: Bundle? = null
}
