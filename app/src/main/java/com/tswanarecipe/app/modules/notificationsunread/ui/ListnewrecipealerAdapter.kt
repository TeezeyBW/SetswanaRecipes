package com.tswanarecipe.app.modules.notificationsunread.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealer2Binding
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.Listnewrecipealer2RowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerAdapter(
  var list: List<Listnewrecipealer2RowModel>
) : RecyclerView.Adapter<ListnewrecipealerAdapter.RowListnewrecipealer2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealer2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer2,parent,false)
    return RowListnewrecipealer2VH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealer2VH, position: Int) {
    val listnewrecipealer2RowModel = Listnewrecipealer2RowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealer2RowModel = list[position]
    holder.binding.listnewrecipealer2RowModel = listnewrecipealer2RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listnewrecipealer2RowModel>) {
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
      item: Listnewrecipealer2RowModel
    ) {
    }
  }

  inner class RowListnewrecipealer2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealer2Binding = RowListnewrecipealer2Binding.bind(itemView)
  }
}
