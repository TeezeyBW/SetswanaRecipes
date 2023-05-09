package com.tswanarecipe.app.modules.notificationsread.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealer1Binding
import com.tswanarecipe.app.modules.notificationsread.`data`.model.Listnewrecipealer1RowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerAdapter(
  var list: List<Listnewrecipealer1RowModel>
) : RecyclerView.Adapter<ListnewrecipealerAdapter.RowListnewrecipealer1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealer1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer1,parent,false)
    return RowListnewrecipealer1VH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealer1VH, position: Int) {
    val listnewrecipealer1RowModel = Listnewrecipealer1RowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealer1RowModel = list[position]
    holder.binding.listnewrecipealer1RowModel = listnewrecipealer1RowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Listnewrecipealer1RowModel>) {
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
      item: Listnewrecipealer1RowModel
    ) {
    }
  }

  inner class RowListnewrecipealer1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealer1Binding = RowListnewrecipealer1Binding.bind(itemView)
  }
}
