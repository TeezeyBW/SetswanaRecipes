package com.tswanarecipe.app.modules.recipeingridentraterecipe.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowRecipe1Binding
import com.tswanarecipe.app.modules.recipeingridentraterecipe.`data`.model.Recipe1RowModel
import kotlin.Int
import kotlin.collections.List

class RecipeAdapter(
  var list: List<Recipe1RowModel>
) : RecyclerView.Adapter<RecipeAdapter.RowRecipe1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecipe1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recipe1,parent,false)
    return RowRecipe1VH(view)
  }

  override fun onBindViewHolder(holder: RowRecipe1VH, position: Int) {
    val recipe1RowModel = Recipe1RowModel()
    // TODO uncomment following line after integration with data source
    // val recipe1RowModel = list[position]
    holder.binding.recipe1RowModel = recipe1RowModel
  }

  override fun getItemCount(): Int = 14
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Recipe1RowModel>) {
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
      item: Recipe1RowModel
    ) {
    }
  }

  inner class RowRecipe1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRecipe1Binding = RowRecipe1Binding.bind(itemView)
  }
}
