package com.tswanarecipe.app.modules.filter.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowFilterBinding
import com.tswanarecipe.app.modules.filter.`data`.model.FilterRowModel
import kotlin.Int
import kotlin.collections.List

class FilterAdapter(
  var list: List<FilterRowModel>
) : RecyclerView.Adapter<FilterAdapter.RowFilterVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowFilterVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_filter,parent,false)
    return RowFilterVH(view)
  }

  override fun onBindViewHolder(holder: RowFilterVH, position: Int) {
    val filterRowModel = FilterRowModel()
    // TODO uncomment following line after integration with data source
    // val filterRowModel = list[position]
    holder.binding.filterRowModel = filterRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<FilterRowModel>) {
    list = newData
    notifyDataSetChanged()
  }

  fun setOnItemClickListener(clickListener: OnItemClickListener) {
    this.clickListener = clickListener
  }

  interface OnItemClickListener {
    fun onItemClick(
      view: View,
      position: Int,
      item: FilterRowModel
    ) {
    }
  }

  inner class RowFilterVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowFilterBinding = RowFilterBinding.bind(itemView)
  }
}
