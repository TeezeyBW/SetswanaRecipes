package com.tswanarecipe.app.modules.recipeprocedure.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.tswanarecipe.app.modules.recipeprocedure.`data`.model.RecipeProcedureModel
import org.koin.core.KoinComponent

class RecipeProcedureVM : ViewModel(), KoinComponent {
  val recipeProcedureModel: MutableLiveData<RecipeProcedureModel> =
      MutableLiveData(RecipeProcedureModel())

  var navArguments: Bundle? = null
}
