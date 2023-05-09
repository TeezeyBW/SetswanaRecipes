package com.tswanarecipe.app.modules.notificationsread.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealerTwo1Binding
import com.tswanarecipe.app.modules.notificationsread.`data`.model.ListnewrecipealerTwo1RowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerTwoAdapter(
  var list: List<ListnewrecipealerTwo1RowModel>
) : RecyclerView.Adapter<ListnewrecipealerTwoAdapter.RowListnewrecipealerTwo1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealerTwo1VH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer_two1,parent,false)
    return RowListnewrecipealerTwo1VH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealerTwo1VH, position: Int) {
    val listnewrecipealerTwo1RowModel = ListnewrecipealerTwo1RowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealerTwo1RowModel = list[position]
    holder.binding.listnewrecipealerTwo1RowModel = listnewrecipealerTwo1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewrecipealerTwo1RowModel>) {
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
      item: ListnewrecipealerTwo1RowModel
    ) {
    }
  }

  inner class RowListnewrecipealerTwo1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealerTwo1Binding = RowListnewrecipealerTwo1Binding.bind(itemView)
  }
}
