package com.tswanarecipe.app.modules.filter.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.databinding.ActivityFilterBinding
import com.tswanarecipe.app.modules.filter.`data`.model.FilterRowModel
import com.tswanarecipe.app.modules.filter.`data`.viewmodel.FilterVM
import com.tswanarecipe.app.modules.searchresult.ui.SearchResultActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class FilterActivity : BaseActivity<ActivityFilterBinding>(R.layout.activity_filter) {
  private val viewModel: FilterVM by viewModels<FilterVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val filterAdapter = FilterAdapter(viewModel.filterList.value?:mutableListOf())
    binding.recyclerFilter.adapter = filterAdapter
    filterAdapter.setOnItemClickListener(
    object : FilterAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : FilterRowModel) {
        onClickRecyclerFilter(view, position, item)
      }
    }
    )
    viewModel.filterList.observe(this) {
      filterAdapter.updateData(it)
    }
    binding.filterVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnFilter.setOnClickListener {
      val destIntent = SearchResultActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  fun onClickRecyclerFilter(
    view: View,
    position: Int,
    item: FilterRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "FILTER_ACTIVITY"

  }
}
