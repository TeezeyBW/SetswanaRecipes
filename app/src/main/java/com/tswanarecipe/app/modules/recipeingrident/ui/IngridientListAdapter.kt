package com.tswanarecipe.app.modules.recipeingrident.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowIngridientlistBinding
import com.tswanarecipe.app.modules.recipeingrident.`data`.model.IngridientlistRowModel
import kotlin.Int
import kotlin.collections.List

class IngridientListAdapter(
  var list: List<IngridientlistRowModel>
) : RecyclerView.Adapter<IngridientListAdapter.RowIngridientlistVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowIngridientlistVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_ingridientlist,parent,false)
    return RowIngridientlistVH(view)
  }

  override fun onBindViewHolder(holder: RowIngridientlistVH, position: Int) {
    val ingridientlistRowModel = IngridientlistRowModel()
    // TODO uncomment following line after integration with data source
    // val ingridientlistRowModel = list[position]
    holder.binding.ingridientlistRowModel = ingridientlistRowModel
  }

  override fun getItemCount(): Int = 14
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<IngridientlistRowModel>) {
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
      item: IngridientlistRowModel
    ) {
    }
  }

  inner class RowIngridientlistVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowIngridientlistBinding = RowIngridientlistBinding.bind(itemView)
  }
}
