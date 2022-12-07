package com.pratikamansapplication.app.modules.album.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.databinding.RowAlbumBinding
import com.pratikamansapplication.app.modules.album.`data`.model.AlbumRowModel
import kotlin.Int
import kotlin.collections.List

class AlbumAdapter(
  var list: List<AlbumRowModel>
) : RecyclerView.Adapter<AlbumAdapter.RowAlbumVH>() {
  private var clickListener: OnItemClickListener? = null

  override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RowAlbumVH {
    val view=LayoutInflater.from(parent.context).inflate(R.layout.row_album,parent,false)
    return RowAlbumVH(view)
  }

  override fun onBindViewHolder(holder: RowAlbumVH, position: Int) {
    val albumRowModel = AlbumRowModel()
    // TODO uncomment following line after integration with data source
    // val albumRowModel = list[position]
    holder.binding.albumRowModel = albumRowModel
  }

  override fun getItemCount(): Int = 4
  // TODO uncomment following line after integration with data source
  // return list.size

  public fun updateData(newData: List<AlbumRowModel>) {
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
      item: AlbumRowModel
    ) {
    }
  }

  inner class RowAlbumVH(
    view: View
  ) : RecyclerView.ViewHolder(view) {
    val binding: RowAlbumBinding = RowAlbumBinding.bind(itemView)
  }
}
