package com.tswanarecipe.app.modules.recipeingridentmore.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityRecipeIngridentMoreBinding
import com.tswanarecipe.app.modules.recipeingridentmore.`data`.model.RecipeRowModel
import com.tswanarecipe.app.modules.recipeingridentmore.`data`.viewmodel.RecipeIngridentMoreVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecipeIngridentMoreActivity :
    BaseActivity<ActivityRecipeIngridentMoreBinding>(R.layout.activity_recipe_ingrident_more) {
  private val viewModel: RecipeIngridentMoreVM by viewModels<RecipeIngridentMoreVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val recipeAdapter = RecipeAdapter(viewModel.recipeList.value?:mutableListOf())
    binding.recyclerRecipe.adapter = recipeAdapter
    recipeAdapter.setOnItemClickListener(
    object : RecipeAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : RecipeRowModel) {
        onClickRecyclerRecipe(view, position, item)
      }
    }
    )
    viewModel.recipeList.observe(this) {
      recipeAdapter.updateData(it)
    }
    binding.recipeIngridentMoreVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerRecipe(
    view: View,
    position: Int,
    item: RecipeRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_MORE_ACTIVITY"

  }
}
