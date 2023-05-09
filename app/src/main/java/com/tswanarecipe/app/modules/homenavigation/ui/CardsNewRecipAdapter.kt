package com.tswanarecipe.app.modules.homenavigation.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowCardsnewrecipBinding
import com.tswanarecipe.app.modules.homenavigation.`data`.model.CardsnewrecipRowModel
import kotlin.Int
import kotlin.collections.List

class CardsNewRecipAdapter(
  var list: List<CardsnewrecipRowModel>
) : RecyclerView.Adapter<CardsNewRecipAdapter.RowCardsnewrecipVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowCardsnewrecipVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_cardsnewrecip,parent,false)
    return RowCardsnewrecipVH(view)
  }

  override fun onBindViewHolder(holder: RowCardsnewrecipVH, position: Int) {
    val cardsnewrecipRowModel = CardsnewrecipRowModel()
    // TODO uncomment following line after integration with data source
    // val cardsnewrecipRowModel = list[position]
    holder.binding.cardsnewrecipRowModel = cardsnewrecipRowModel
  }

  override fun getItemCount(): Int = 5
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<CardsnewrecipRowModel>) {
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
      item: CardsnewrecipRowModel
    ) {
    }
  }

  inner class RowCardsnewrecipVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowCardsnewrecipBinding = RowCardsnewrecipBinding.bind(itemView)
  }
}
