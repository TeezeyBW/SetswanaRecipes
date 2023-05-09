package com.tswanarecipe.app.modules.recipeingridentraterecipeone.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowRecipe2Binding
import com.tswanarecipe.app.modules.recipeingridentraterecipeone.`data`.model.Recipe2RowModel
import kotlin.Int
import kotlin.collections.List

class RecipeAdapter(
  var list: List<Recipe2RowModel>
) : RecyclerView.Adapter<RecipeAdapter.RowRecipe2VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecipe2VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recipe2,parent,false)
    return RowRecipe2VH(view)
  }

  override fun onBindViewHolder(holder: RowRecipe2VH, position: Int) {
    val recipe2RowModel = Recipe2RowModel()
    // TODO uncomment following line after integration with data source
    // val recipe2RowModel = list[position]
    holder.binding.recipe2RowModel = recipe2RowModel
  }

  override fun getItemCount(): Int = 14
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Recipe2RowModel>) {
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
      item: Recipe2RowModel
    ) {
    }
  }

  inner class RowRecipe2VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRecipe2Binding = RowRecipe2Binding.bind(itemView)
  }
}
