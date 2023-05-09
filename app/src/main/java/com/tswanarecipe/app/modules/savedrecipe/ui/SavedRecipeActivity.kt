package com.tswanarecipe.app.modules.savedrecipe.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivitySavedRecipeBinding
import com.tswanarecipe.app.modules.savedrecipe.`data`.model.SavedRecipeRowModel
import com.tswanarecipe.app.modules.savedrecipe.`data`.viewmodel.SavedRecipeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class SavedRecipeActivity : BaseActivity<ActivitySavedRecipeBinding>(R.layout.activity_saved_recipe)
    {
  private val viewModel: SavedRecipeVM by viewModels<SavedRecipeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val savedRecipeAdapter =
    SavedRecipeAdapter(viewModel.savedRecipeList.value?:mutableListOf())
    binding.recyclerSavedRecipe.adapter = savedRecipeAdapter
    savedRecipeAdapter.setOnItemClickListener(
    object : SavedRecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SavedRecipeRowModel) {
        onClickRecyclerSavedRecipe(view, position, item)
      }
    }
    )
    viewModel.savedRecipeList.observe(this) {
      savedRecipeAdapter.updateData(it)
    }
    binding.savedRecipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerSavedRecipe(
    view: View,
    position: Int,
    item: SavedRecipeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "SAVED_RECIPE_ACTIVITY"

  }
}
