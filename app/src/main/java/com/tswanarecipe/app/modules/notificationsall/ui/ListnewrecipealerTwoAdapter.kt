package com.tswanarecipe.app.modules.notificationsall.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListnewrecipealerTwoBinding
import com.tswanarecipe.app.modules.notificationsall.`data`.model.ListnewrecipealerTwoRowModel
import kotlin.Int
import kotlin.collections.List

class ListnewrecipealerTwoAdapter(
  var list: List<ListnewrecipealerTwoRowModel>
) : RecyclerView.Adapter<ListnewrecipealerTwoAdapter.RowListnewrecipealerTwoVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListnewrecipealerTwoVH {
    val
        view=LayoutInflater.from(parent.context).inflate(R.layout.row_listnewrecipealer_two,parent,false)
    return RowListnewrecipealerTwoVH(view)
  }

  override fun onBindViewHolder(holder: RowListnewrecipealerTwoVH, position: Int) {
    val listnewrecipealerTwoRowModel = ListnewrecipealerTwoRowModel()
    // TODO uncomment following line after integration with data source
    // val listnewrecipealerTwoRowModel = list[position]
    holder.binding.listnewrecipealerTwoRowModel = listnewrecipealerTwoRowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListnewrecipealerTwoRowModel>) {
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
      item: ListnewrecipealerTwoRowModel
    ) {
    }
  }

  inner class RowListnewrecipealerTwoVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListnewrecipealerTwoBinding = RowListnewrecipealerTwoBinding.bind(itemView)
  }
}
