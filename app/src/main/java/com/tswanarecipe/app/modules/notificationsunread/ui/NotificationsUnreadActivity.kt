package com.tswanarecipe.app.modules.notificationsunread.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityNotificationsUnreadBinding
import com.tswanarecipe.app.modules.notificationsall.ui.NotificationsAllActivity
import com.tswanarecipe.app.modules.notificationsread.ui.NotificationsReadActivity
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.Listnewrecipealer2RowModel
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.ListnewrecipealerTwo2RowModel
import com.tswanarecipe.app.modules.notificationsunread.`data`.viewmodel.NotificationsUnreadVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsUnreadActivity :
    BaseActivity<ActivityNotificationsUnreadBinding>(R.layout.activity_notifications_unread) {
  private val viewModel: NotificationsUnreadVM by viewModels<NotificationsUnreadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnewrecipealerAdapter =
    ListnewrecipealerAdapter(viewModel.listnewrecipealerList.value?:mutableListOf())
    binding.recyclerListnewrecipealer.adapter = listnewrecipealerAdapter
    listnewrecipealerAdapter.setOnItemClickListener(
    object : ListnewrecipealerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listnewrecipealer2RowModel) {
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
      override fun onItemClick(view:View, position:Int, item :
      ListnewrecipealerTwo2RowModel) {
        onClickRecyclerListnewrecipealerTwo(view, position, item)
      }
    }
    )
    viewModel.listnewrecipealerTwoList.observe(this) {
      listnewrecipealerTwoAdapter.updateData(it)
    }
    binding.notificationsUnreadVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtTabsOne.setOnClickListener {
      val destIntent = NotificationsReadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.txtTabs.setOnClickListener {
      val destIntent = NotificationsAllActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerListnewrecipealer(
    view: View,
    position: Int,
    item: Listnewrecipealer2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListnewrecipealerTwo(
    view: View,
    position: Int,
    item: ListnewrecipealerTwo2RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_UNREAD_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsUnreadActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
