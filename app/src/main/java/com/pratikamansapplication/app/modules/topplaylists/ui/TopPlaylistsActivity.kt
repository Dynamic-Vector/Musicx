package com.pratikamansapplication.app.modules.topplaylists.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityTopPlaylistsBinding
import com.pratikamansapplication.app.modules.topplaylists.`data`.model.TopPlaylistsRowModel
import com.pratikamansapplication.app.modules.topplaylists.`data`.viewmodel.TopPlaylistsVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class TopPlaylistsActivity :
    BaseActivity<ActivityTopPlaylistsBinding>(R.layout.activity_top_playlists) {
  private val viewModel: TopPlaylistsVM by viewModels<TopPlaylistsVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val topPlaylistsAdapter =
    TopPlaylistsAdapter(viewModel.topPlaylistsList.value?:mutableListOf())
    binding.recyclerTopPlaylists.adapter = topPlaylistsAdapter
    topPlaylistsAdapter.setOnItemClickListener(
    object : TopPlaylistsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : TopPlaylistsRowModel) {
        onClickRecyclerTopPlaylists(view, position, item)
      }
    }
    )
    viewModel.topPlaylistsList.observe(this) {
      topPlaylistsAdapter.updateData(it)
    }
    binding.topPlaylistsVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerTopPlaylists(
    view: View,
    position: Int,
    item: TopPlaylistsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "TOP_PLAYLISTS_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, TopPlaylistsActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
