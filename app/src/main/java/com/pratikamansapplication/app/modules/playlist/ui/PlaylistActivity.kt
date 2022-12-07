package com.pratikamansapplication.app.modules.playlist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityPlaylistBinding
import com.pratikamansapplication.app.modules.playlist.`data`.model.PlaylistRowModel
import com.pratikamansapplication.app.modules.playlist.`data`.viewmodel.PlaylistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class PlaylistActivity : BaseActivity<ActivityPlaylistBinding>(R.layout.activity_playlist) {
  private val viewModel: PlaylistVM by viewModels<PlaylistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val playlistAdapter = PlaylistAdapter(viewModel.playlistList.value?:mutableListOf())
    binding.recyclerPlaylist.adapter = playlistAdapter
    playlistAdapter.setOnItemClickListener(
    object : PlaylistAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : PlaylistRowModel) {
        onClickRecyclerPlaylist(view, position, item)
      }
    }
    )
    viewModel.playlistList.observe(this) {
      playlistAdapter.updateData(it)
    }
    binding.playlistVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  fun onClickRecyclerPlaylist(
    view: View,
    position: Int,
    item: PlaylistRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "PLAYLIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, PlaylistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
