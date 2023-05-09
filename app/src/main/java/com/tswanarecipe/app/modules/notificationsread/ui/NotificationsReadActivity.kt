package com.tswanarecipe.app.modules.notificationsread.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityNotificationsReadBinding
import com.tswanarecipe.app.modules.notificationsall.ui.NotificationsAllActivity
import com.tswanarecipe.app.modules.notificationsread.`data`.model.Listnewrecipealer1RowModel
import com.tswanarecipe.app.modules.notificationsread.`data`.model.ListnewrecipealerTwo1RowModel
import com.tswanarecipe.app.modules.notificationsread.`data`.viewmodel.NotificationsReadVM
import com.tswanarecipe.app.modules.notificationsunread.ui.NotificationsUnreadActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class NotificationsReadActivity :
    BaseActivity<ActivityNotificationsReadBinding>(R.layout.activity_notifications_read) {
  private val viewModel: NotificationsReadVM by viewModels<NotificationsReadVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val listnewrecipealerAdapter =
    ListnewrecipealerAdapter(viewModel.listnewrecipealerList.value?:mutableListOf())
    binding.recyclerListnewrecipealer.adapter = listnewrecipealerAdapter
    listnewrecipealerAdapter.setOnItemClickListener(
    object : ListnewrecipealerAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Listnewrecipealer1RowModel) {
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
      ListnewrecipealerTwo1RowModel) {
        onClickRecyclerListnewrecipealerTwo(view, position, item)
      }
    }
    )
    viewModel.listnewrecipealerTwoList.observe(this) {
      listnewrecipealerTwoAdapter.updateData(it)
    }
    binding.notificationsReadVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.txtLanguage.setOnClickListener {
      val destIntent = NotificationsUnreadActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.btnAll.setOnClickListener {
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
    item: Listnewrecipealer1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerListnewrecipealerTwo(
    view: View,
    position: Int,
    item: ListnewrecipealerTwo1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "NOTIFICATIONS_READ_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, NotificationsReadActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
