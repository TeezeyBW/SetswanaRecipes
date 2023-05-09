package com.tswanarecipe.app.modules.recipeingridentraterecipe.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityRecipeIngridentRateRecipeBinding
import com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.model.Recipe1RowModel
import com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.viewmodel.RecipeIngridentRateRecipeVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecipeIngridentRateRecipeActivity :
    BaseActivity<ActivityRecipeIngridentRateRecipeBinding>(R.layout.activity_recipe_ingrident_rate_recipe)
    {
  private val viewModel: RecipeIngridentRateRecipeVM by viewModels<RecipeIngridentRateRecipeVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recipeAdapter = RecipeAdapter(viewModel.recipeList.value?:mutableListOf())
    binding.recyclerRecipe.adapter = recipeAdapter
    recipeAdapter.setOnItemClickListener(
    object : RecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Recipe1RowModel) {
        onClickRecyclerRecipe(view, position, item)
      }
    }
    )
    viewModel.recipeList.observe(this) {
      recipeAdapter.updateData(it)
    }
    binding.recipeIngridentRateRecipeVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerRecipe(
    view: View,
    position: Int,
    item: Recipe1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_RATE_RECIPE_ACTIVITY"

  }
}
