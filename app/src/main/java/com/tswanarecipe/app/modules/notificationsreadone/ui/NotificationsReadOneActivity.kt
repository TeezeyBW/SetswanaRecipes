package com.tswanarecipe.app.modules.notificationsreadone.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityNotificationsReadOneBinding
import com.tswanarecipe.app.modules.notificationsreadone.`data`.model.ListunsplashRowModel
import com.tswanarecipe.app.modules.notificationsreadone.`data`.viewmodel.NotificationsReadOneVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsReadOneActivity :
    BaseActivity<ActivityNotificationsReadOneBinding>(R.layout.activity_notifications_read_one) {
  private val viewModel: NotificationsReadOneVM by viewModels<NotificationsReadOneVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listunsplashAdapter =
    ListunsplashAdapter(viewModel.listunsplashList.value?:mutableListOf())
    binding.recyclerListunsplash.adapter = listunsplashAdapter
    listunsplashAdapter.setOnItemClickListener(
    object : ListunsplashAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListunsplashRowModel) {
        onClickRecyclerListunsplash(view, position, item)
      }
    }
    )
    viewModel.listunsplashList.observe(this) {
      listunsplashAdapter.updateData(it)
    }
    binding.notificationsReadOneVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListunsplash(
    view: View,
    position: Int,
    item: ListunsplashRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_READ_ONE_ACTIVITY"

  }
}
