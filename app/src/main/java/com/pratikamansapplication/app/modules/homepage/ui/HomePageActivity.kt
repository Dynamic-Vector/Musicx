package com.pratikamansapplication.app.modules.homepage.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityHomePageBinding
import com.pratikamansapplication.app.modules.homepage.`data`.model.SongsRowModel
import com.pratikamansapplication.app.modules.homepage.`data`.viewmodel.HomePageVM
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomePageActivity : BaseActivity<ActivityHomePageBinding>(R.layout.activity_home_page) {
  private val viewModel: HomePageVM by viewModels<HomePageVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val songsAdapter = SongsAdapter(viewModel.songsList.value?:mutableListOf())
    binding.recyclerSongs.adapter = songsAdapter
    songsAdapter.setOnItemClickListener(
    object : SongsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : SongsRowModel) {
        onClickRecyclerSongs(view, position, item)
      }
    }
    )
    viewModel.songsList.observe(this) {
      songsAdapter.updateData(it)
    }
    binding.homePageVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  fun onClickRecyclerSongs(
    view: View,
    position: Int,
    item: SongsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  companion object {
    const val TAG: String = "HOME_PAGE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, HomePageActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
