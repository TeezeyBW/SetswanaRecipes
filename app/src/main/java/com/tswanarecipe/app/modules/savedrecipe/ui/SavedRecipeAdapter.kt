package com.tswanarecipe.app.modules.savedrecipe.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.tswanarecipe.app.R
import com.tswanarecipe.app.databinding.RowSavedRecipeBinding
import com.tswanarecipe.app.modules.savedrecipe.`data`.model.SavedRecipeRowModel
import kotlin.Int
import kotlin.collections.List

class SavedRecipeAdapter(
  var list: List<SavedRecipeRowModel>
) : RecyclerView.Adapter<SavedRecipeAdapter.RowSavedRecipeVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSavedRecipeVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_saved_recipe,parent,false)
    return RowSavedRecipeVH(view)
  }

  override fun onBindViewHolder(holder: RowSavedRecipeVH, position: Int) {
    val savedRecipeRowModel = SavedRecipeRowModel()
    // TODO uncomment following line after integration with data source
    // val savedRecipeRowModel = list[position]
    holder.binding.savedRecipeRowModel = savedRecipeRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<SavedRecipeRowModel>) {
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
      item: SavedRecipeRowModel
    ) {
    }
  }

  inner class RowSavedRecipeVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSavedRecipeBinding = RowSavedRecipeBinding.bind(itemView)
  }
}
