package com.pratikamansapplication.app.modules.songmenufull.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivitySongMenuFullBinding
import com.pratikamansapplication.app.modules.songmenufull.`data`.viewmodel.SongMenuFullVM
import kotlin.String
import kotlin.Unit

class SongMenuFullActivity :
    BaseActivity<ActivitySongMenuFullBinding>(R.layout.activity_song_menu_full) {
  private val viewModel: SongMenuFullVM by viewModels<SongMenuFullVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.songMenuFullVM = viewModel
  }

  override fun setUpClicks(): Unit {
  }

  companion object {
    const val TAG: String = "SONG_MENU_FULL_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, SongMenuFullActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
