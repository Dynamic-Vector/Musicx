package com.pratikamansapplication.app.modules.artist.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityArtistBinding
import com.pratikamansapplication.app.modules.artist.`data`.model.Songs1RowModel
import com.pratikamansapplication.app.modules.artist.`data`.viewmodel.ArtistVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class ArtistActivity : BaseActivity<ActivityArtistBinding>(R.layout.activity_artist) {
  private val viewModel: ArtistVM by viewModels<ArtistVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val songsAdapter = SongsAdapter(viewModel.songsList.value?:mutableListOf())
    binding.recyclerSongs.adapter = songsAdapter
    songsAdapter.setOnItemClickListener(
    object : SongsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Songs1RowModel) {
        onClickRecyclerSongs(view, position, item)
      }
    }
    )
    viewModel.songsList.observe(this) {
      songsAdapter.updateData(it)
    }
    binding.artistVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSongs(
    view: View,
    position: Int,
    item: Songs1RowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ARTIST_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ArtistActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
