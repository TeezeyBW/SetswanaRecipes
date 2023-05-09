package com.tswanarecipe.app.modules.savedrecipe.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.savedrecipe.`data`.model.SavedRecipeModel
import com.tswanarecipe.app.modules.savedrecipe.`data`.model.SavedRecipeRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class SavedRecipeVM : ViewModel(), KoinComponent {
  val savedRecipeModel: MutableLiveData<SavedRecipeModel> = MutableLiveData(SavedRecipeModel())

  var navArguments: Bundle? = null

  val savedRecipeList: MutableLiveData<MutableList<SavedRecipeRowModel>> =
      MutableLiveData(mutableListOf())
}
