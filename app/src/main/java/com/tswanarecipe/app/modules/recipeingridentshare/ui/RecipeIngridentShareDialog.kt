package com.tswanarecipe.app.modules.recipeingridentshare.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseDialogFragment
import com.tswanarecipe.app.databinding.DialogRecipeIngridentShareBinding
import com.tswanarecipe.app.modules.recipeingridentshare.`data`.viewmodel.RecipeIngridentShareVM
import kotlin.String
import kotlin.Unit

class RecipeIngridentShareDialog :
    BaseDialogFragment<DialogRecipeIngridentShareBinding>(R.layout.dialog_recipe_ingrident_share) {
  private val viewModel: RecipeIngridentShareVM by viewModels<RecipeIngridentShareVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.recipeIngridentShareVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_SHARE_DIALOG"

  }
}
