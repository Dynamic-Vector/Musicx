package com.pratikamansapplication.app.modules.album.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityAlbumBinding
import com.pratikamansapplication.app.modules.album.`data`.model.AlbumRowModel
import com.pratikamansapplication.app.modules.album.`data`.viewmodel.AlbumVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class AlbumActivity : BaseActivity<ActivityAlbumBinding>(R.layout.activity_album) {
  private val viewModel: AlbumVM by viewModels<AlbumVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val albumAdapter = AlbumAdapter(viewModel.albumList.value?:mutableListOf())
    binding.recyclerAlbum.adapter = albumAdapter
    albumAdapter.setOnItemClickListener(
    object : AlbumAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : AlbumRowModel) {
        onClickRecyclerAlbum(view, position, item)
      }
    }
    )
    viewModel.albumList.observe(this) {
      albumAdapter.updateData(it)
    }
    binding.albumVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerAlbum(
    view: View,
    position: Int,
    item: AlbumRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "ALBUM_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, AlbumActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
