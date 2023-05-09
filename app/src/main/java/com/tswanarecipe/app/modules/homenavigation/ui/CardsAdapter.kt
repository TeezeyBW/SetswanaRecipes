package com.tswanarecipe.app.modules.homenavigation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowCards2Binding
import com.tswanarecipe.app.modules.homenavigation.`data`.model.Cards2RowModel
import kotlin.Int
import kotlin.collections.List

class CardsAdapter(
  var list: List<Cards2RowModel>
) : RecyclerView.Adapter<CardsAdapter.RowCards2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCards2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cards2,parent,false)
    return RowCards2VH(view)
  }

  override fun onBindViewHolder(holder: RowCards2VH, position: Int) {
    val cards2RowModel = Cards2RowModel()
    // TODO uncomment following line after integration with data source
    // val cards2RowModel = list[position]
    holder.binding.cards2RowModel = cards2RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Cards2RowModel>) {
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
      item: Cards2RowModel
    ) {
    }
  }

  inner class RowCards2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCards2Binding = RowCards2Binding.bind(itemView)
    init {
      binding.frameFoodPhoto.setOnClickListener {
        // TODO replace with value from datasource
        clickListener?.onItemClick(it, adapterPosition, Cards2RowModel())
      }
    }
  }
}
