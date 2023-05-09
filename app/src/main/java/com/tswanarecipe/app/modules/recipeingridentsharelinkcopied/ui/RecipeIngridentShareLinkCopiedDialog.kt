package com.tswanarecipe.app.modules.recipeingridentsharelinkcopied.ui

import android.content.Context
import androidx.fragment.app.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseDialogFragment
import com.tswanarecipe.app.databinding.DialogRecipeIngridentShareLinkCopiedBinding
import com.tswanarecipe.app.modules.recipeingridentsharelinkcopied.`data`.viewmodel.RecipeIngridentShareLinkCopiedVM
import kotlin.String
import kotlin.Unit

class RecipeIngridentShareLinkCopiedDialog :
    BaseDialogFragment<DialogRecipeIngridentShareLinkCopiedBinding>(R.layout.dialog_recipe_ingrident_share_link_copied)
    {
  private val viewModel: RecipeIngridentShareLinkCopiedVM by
      viewModels<RecipeIngridentShareLinkCopiedVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    binding.recipeIngridentShareLinkCopiedVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      dismiss()
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_SHARE_LINK_COPIED_DIALOG"

  }
}
