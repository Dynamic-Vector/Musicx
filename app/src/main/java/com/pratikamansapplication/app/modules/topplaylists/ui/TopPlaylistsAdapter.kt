package com.pratikamansapplication.app.modules.topplaylists.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.databinding.RowTopPlaylistsBinding
import com.pratikamansapplication.app.modules.topplaylists.`data`.model.TopPlaylistsRowModel
import kotlin.Int
import kotlin.collections.List

class TopPlaylistsAdapter(
  var list: List<TopPlaylistsRowModel>
) : RecyclerView.Adapter<TopPlaylistsAdapter.RowTopPlaylistsVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowTopPlaylistsVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_top_playlists,parent,false)
    return RowTopPlaylistsVH(view)
  }

  override fun onBindViewHolder(holder: RowTopPlaylistsVH, position: Int) {
    val topPlaylistsRowModel = TopPlaylistsRowModel()
    // TODO uncomment following line after integration with data source
    // val topPlaylistsRowModel = list[position]
    holder.binding.topPlaylistsRowModel = topPlaylistsRowModel
  }

  override fun getItemCount(): Int = 3
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<TopPlaylistsRowModel>) {
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
      item: TopPlaylistsRowModel
    ) {
    }
  }

  inner class RowTopPlaylistsVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowTopPlaylistsBinding = RowTopPlaylistsBinding.bind(itemView)
  }
}
