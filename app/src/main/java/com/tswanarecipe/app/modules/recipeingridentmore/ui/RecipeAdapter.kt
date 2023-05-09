package com.tswanarecipe.app.modules.recipeingridentmore.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowRecipeBinding
import com.tswanarecipe.app.modules.recipeingridentmore.`data`.model.RecipeRowModel
import kotlin.Int
import kotlin.collections.List

class RecipeAdapter(
  var list: List<RecipeRowModel>
) : RecyclerView.Adapter<RecipeAdapter.RowRecipeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowRecipeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_recipe,parent,false)
    return RowRecipeVH(view)
  }

  override fun onBindViewHolder(holder: RowRecipeVH, position: Int) {
    val recipeRowModel = RecipeRowModel()
    // TODO uncomment following line after integration with data source
    // val recipeRowModel = list[position]
    holder.binding.recipeRowModel = recipeRowModel
  }

  override fun getItemCount(): Int = 14
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<RecipeRowModel>) {
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
      item: RecipeRowModel
    ) {
    }
  }

  inner class RowRecipeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowRecipeBinding = RowRecipeBinding.bind(itemView)
  }
}
