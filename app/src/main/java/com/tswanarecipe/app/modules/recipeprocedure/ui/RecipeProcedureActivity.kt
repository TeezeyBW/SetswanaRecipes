package com.tswanarecipe.app.modules.recipeprocedure.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityRecipeProcedureBinding
import com.tswanarecipe.app.modules.recipeingrident.ui.RecipeIngridentActivity
import com.tswanarecipe.app.modules.recipeprocedure.`data`.viewmodel.RecipeProcedureVM
import kotlin.String
import kotlin.Unit

class RecipeProcedureActivity :
    BaseActivity<ActivityRecipeProcedureBinding>(R.layout.activity_recipe_procedure) {
  private val viewModel: RecipeProcedureVM by viewModels<RecipeProcedureVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.recipeProcedureVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLabelTwo.setOnClickListener {
      val destIntent = RecipeIngridentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnIngrident.setOnClickListener {
      val destIntent = RecipeIngridentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "RECIPE_PROCEDURE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, RecipeProcedureActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
