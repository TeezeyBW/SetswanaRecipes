package com.tswanarecipe.app.modules.profile.ui

import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityProfileBinding
import com.tswanarecipe.app.modules.notificationsread.ui.NotificationsReadActivity
import com.tswanarecipe.app.modules.notificationsunread.ui.NotificationsUnreadActivity
import com.tswanarecipe.app.modules.profile.`data`.viewmodel.ProfileVM
import com.tswanarecipe.app.modules.recipeingrident.ui.RecipeIngridentActivity
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLabelThree.setOnClickListener {
      val destIntent = NotificationsReadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLabelFour.setOnClickListener {
      val destIntent = NotificationsUnreadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.recyclerProfile.setOnClickListener {
      val destIntent = RecipeIngridentActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"

  }
}
