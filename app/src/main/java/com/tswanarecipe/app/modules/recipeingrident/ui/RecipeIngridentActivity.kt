package com.tswanarecipe.app.modules.recipeingrident.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityRecipeIngridentBinding
import com.tswanarecipe.app.modules.recipeingrident.`data`.model.IngridientlistRowModel
import com.tswanarecipe.app.modules.recipeingrident.`data`.viewmodel.RecipeIngridentVM
import com.tswanarecipe.app.modules.recipeprocedure.ui.RecipeProcedureActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class RecipeIngridentActivity :
    BaseActivity<ActivityRecipeIngridentBinding>(R.layout.activity_recipe_ingrident) {
  private val viewModel: RecipeIngridentVM by viewModels<RecipeIngridentVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val ingridientListAdapter =
    IngridientListAdapter(viewModel.ingridientListList.value?:mutableListOf())
    binding.recyclerIngridientList.adapter = ingridientListAdapter
    ingridientListAdapter.setOnItemClickListener(
    object : IngridientListAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : IngridientlistRowModel) {
        onClickRecyclerIngridientList(view, position, item)
      }
    }
    )
    viewModel.ingridientListList.observe(this) {
      ingridientListAdapter.updateData(it)
    }
    binding.recipeIngridentVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
    binding.txtLabelTwo.setOnClickListener {
      val destIntent = RecipeProcedureActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerIngridientList(
    view: View,
    position: Int,
    item: IngridientlistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "RECIPE_INGRIDENT_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecipeIngridentActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
