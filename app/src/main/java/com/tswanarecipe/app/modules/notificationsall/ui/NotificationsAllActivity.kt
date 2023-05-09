package com.tswanarecipe.app.modules.notificationsall.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityNotificationsAllBinding
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerRowModel
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerTwoRowModel
import com.tswanarecipe.app.modules.notificationsall.`data`.viewmodel.NotificationsAllVM
import com.tswanarecipe.app.modules.notificationsread.ui.NotificationsReadActivity
import com.tswanarecipe.app.modules.notificationsunread.ui.NotificationsUnreadActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsAllActivity :
    BaseActivity<ActivityNotificationsAllBinding>(R.layout.activity_notifications_all) {
  private val viewModel: NotificationsAllVM by viewModels<NotificationsAllVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnewrecipealerAdapter =
    ListnewrecipealerAdapter(viewModel.listnewrecipealerList.value?:mutableListOf())
    binding.recyclerListnewrecipealer.adapter = listnewrecipealerAdapter
    listnewrecipealerAdapter.setOnItemClickListener(
    object : ListnewrecipealerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnewrecipealerRowModel) {
        onClickRecyclerListnewrecipealer(view, position, item)
      }
    }
    )
    viewModel.listnewrecipealerList.observe(this) {
      listnewrecipealerAdapter.updateData(it)
    }
    val listnewrecipealerTwoAdapter =
    ListnewrecipealerTwoAdapter(viewModel.listnewrecipealerTwoList.value?:mutableListOf())
    binding.recyclerListnewrecipealerTwo.adapter = listnewrecipealerTwoAdapter
    listnewrecipealerTwoAdapter.setOnItemClickListener(
    object : ListnewrecipealerTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : ListnewrecipealerTwoRowModel) {
        onClickRecyclerListnewrecipealerTwo(view, position, item)
      }
    }
    )
    viewModel.listnewrecipealerTwoList.observe(this) {
      listnewrecipealerTwoAdapter.updateData(it)
    }
    binding.notificationsAllVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = NotificationsUnreadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtLabel.setOnClickListener {
      val destIntent = NotificationsReadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerListnewrecipealer(
    view: View,
    position: Int,
    item: ListnewrecipealerRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListnewrecipealerTwo(
    view: View,
    position: Int,
    item: ListnewrecipealerTwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_ALL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsAllActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
