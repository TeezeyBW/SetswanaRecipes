package com.tswanarecipe.app.modules.recipeingridentraterecipeone.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityRecipeIngridentRateRecipeOneBinding
import com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.model.Recipe2RowModel
import com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.viewmodel.RecipeIngridentRateRecipeOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecipeIngridentRateRecipeOneActivity :
    BaseActivity<ActivityRecipeIngridentRateRecipeOneBinding>(R.layout.activity_recipe_ingrident_rate_recipe_one)
    {
  private val viewModel: RecipeIngridentRateRecipeOneVM by
      viewModels<RecipeIngridentRateRecipeOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recipeAdapter = RecipeAdapter(viewModel.recipeList.value?:mutableListOf())
    binding.recyclerRecipe.adapter = recipeAdapter
    recipeAdapter.setOnItemClickListener(
    object : RecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Recipe2RowModel) {
        onClickRecyclerRecipe(view, position, item)
      }
    }
    )
    viewModel.recipeList.observe(this) {
      recipeAdapter.updateData(it)
    }
    binding.recipeIngridentRateRecipeOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerRecipe(
    view: View,
    position: Int,
    item: Recipe2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_RATE_RECIPE_ONE_ACTIVITY"

  }
}
