package com.tswanarecipe.app.modules.home.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowNewrecipetwoBinding
import com.tswanarecipe.app.modules.home.`data`.model.NewrecipetwoRowModel
import kotlin.Int
import kotlin.collections.List

class NewRecipeTwoAdapter(
  var list: List<NewrecipetwoRowModel>
) : RecyclerView.Adapter<NewRecipeTwoAdapter.RowNewrecipetwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowNewrecipetwoVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_newrecipetwo,parent,false)
    return RowNewrecipetwoVH(view)
  }

  override fun onBindViewHolder(holder: RowNewrecipetwoVH, position: Int) {
    val newrecipetwoRowModel = NewrecipetwoRowModel()
    // TODO uncomment following line after integration with data source
    // val newrecipetwoRowModel = list[position]
    holder.binding.newrecipetwoRowModel = newrecipetwoRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<NewrecipetwoRowModel>) {
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
      item: NewrecipetwoRowModel
    ) {
    }
  }

  inner class RowNewrecipetwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowNewrecipetwoBinding = RowNewrecipetwoBinding.bind(itemView)
  }
}
