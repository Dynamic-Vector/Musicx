package com.pratikamansapplication.app.modules.favorites.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityFavoritesBinding
import com.pratikamansapplication.app.modules.favorites.`data`.viewmodel.FavoritesVM
import kotlin.String
import kotlin.Unit

class FavoritesActivity : BaseActivity<ActivityFavoritesBinding>(R.layout.activity_favorites) {
  private val viewModel: FavoritesVM by viewModels<FavoritesVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.favoritesVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "FAVORITES_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, FavoritesActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
