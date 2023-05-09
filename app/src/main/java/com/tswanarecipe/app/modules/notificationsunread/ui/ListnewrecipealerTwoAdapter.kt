package com.tswanarecipe.app.modules.notificationsunread.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealerTwo2Binding
import com.tswanarecipe.app.modules.notificationsunread.`data`.model.ListnewrecipealerTwo2RowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerTwoAdapter(
  var list: List<ListnewrecipealerTwo2RowModel>
) : RecyclerView.Adapter<ListnewrecipealerTwoAdapter.RowListnewrecipealerTwo2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealerTwo2VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer_two2,parent,false)
    return RowListnewrecipealerTwo2VH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealerTwo2VH, position: Int) {
    val listnewrecipealerTwo2RowModel = ListnewrecipealerTwo2RowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealerTwo2RowModel = list[position]
    holder.binding.listnewrecipealerTwo2RowModel = listnewrecipealerTwo2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewrecipealerTwo2RowModel>) {
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
      item: ListnewrecipealerTwo2RowModel
    ) {
    }
  }

  inner class RowListnewrecipealerTwo2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealerTwo2Binding = RowListnewrecipealerTwo2Binding.bind(itemView)
  }
}
