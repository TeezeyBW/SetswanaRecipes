package com.tswanarecipe.app.modules.notificationsall.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealerBinding
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerRowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerAdapter(
  var list: List<ListnewrecipealerRowModel>
) : RecyclerView.Adapter<ListnewrecipealerAdapter.RowListnewrecipealerVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealerVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer,parent,false)
    return RowListnewrecipealerVH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealerVH, position: Int) {
    val listnewrecipealerRowModel = ListnewrecipealerRowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealerRowModel = list[position]
    holder.binding.listnewrecipealerRowModel = listnewrecipealerRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewrecipealerRowModel>) {
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
      item: ListnewrecipealerRowModel
    ) {
    }
  }

  inner class RowListnewrecipealerVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealerBinding = RowListnewrecipealerBinding.bind(itemView)
  }
}
