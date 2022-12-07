package com.pratikamansapplication.app.modules.artist.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.databinding.RowSongs1Binding
import com.pratikamansapplication.app.modules.artist.`data`.model.Songs1RowModel
import kotlin.Int
import kotlin.collections.List

class SongsAdapter(
  var list: List<Songs1RowModel>
) : RecyclerView.Adapter<SongsAdapter.RowSongs1VH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowSongs1VH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_songs1,parent,false)
    return RowSongs1VH(view)
  }

  override fun onBindViewHolder(holder: RowSongs1VH, position: Int) {
    val songs1RowModel = Songs1RowModel()
    // TODO uncomment following line after integration with data source
    // val songs1RowModel = list[position]
    holder.binding.songs1RowModel = songs1RowModel
  }

  override fun getItemCount(): Int = 2
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<Songs1RowModel>) {
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
      item: Songs1RowModel
    ) {
    }
  }

  inner class RowSongs1VH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowSongs1Binding = RowSongs1Binding.bind(itemView)
  }
}
