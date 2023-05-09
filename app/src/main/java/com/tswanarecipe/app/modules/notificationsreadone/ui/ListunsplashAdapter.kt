package com.tswanarecipe.app.modules.notificationsreadone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowListunsplashBinding
import com.tswanarecipe.app.modules.notificationsreadone.`data`.model.ListunsplashRowModel
import kotlin.Int
import kotlin.collections.List

class ListunsplashAdapter(
  var list: List<ListunsplashRowModel>
) : RecyclerView.Adapter<ListunsplashAdapter.RowListunsplashVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowListunsplashVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_listunsplash,parent,false)
    return RowListunsplashVH(view)
  }

  override fun onBindViewHolder(holder: RowListunsplashVH, position: Int) {
    val listunsplashRowModel = ListunsplashRowModel()
    // TODO uncomment following line after integration with data source
    // val listunsplashRowModel = list[position]
    holder.binding.listunsplashRowModel = listunsplashRowModel
  }

  override fun getItemCount(): Int = 6
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<ListunsplashRowModel>) {
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
      item: ListunsplashRowModel
    ) {
    }
  }

  inner class RowListunsplashVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowListunsplashBinding = RowListunsplashBinding.bind(itemView)
  }
}
