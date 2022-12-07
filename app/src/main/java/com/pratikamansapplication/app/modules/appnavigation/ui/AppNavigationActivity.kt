package com.pratikamansapplication.app.modules.appnavigation.ui

import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityAppNavigationBinding
import com.pratikamansapplication.app.modules.album.ui.AlbumActivity
import com.pratikamansapplication.app.modules.albums.ui.AlbumsActivity
import com.pratikamansapplication.app.modules.appnavigation.`data`.viewmodel.AppNavigationVM
import com.pratikamansapplication.app.modules.artist.ui.ArtistActivity
import com.pratikamansapplication.app.modules.artists.ui.ArtistsActivity
import com.pratikamansapplication.app.modules.favorites.ui.FavoritesActivity
import com.pratikamansapplication.app.modules.homepage.ui.HomePageActivity
import com.pratikamansapplication.app.modules.list.ui.ListActivity
import com.pratikamansapplication.app.modules.login.ui.LoginActivity
import com.pratikamansapplication.app.modules.playlist.ui.PlaylistActivity
import com.pratikamansapplication.app.modules.profile.ui.ProfileActivity
import com.pratikamansapplication.app.modules.setting.ui.SettingActivity
import com.pratikamansapplication.app.modules.songmenufull.ui.SongMenuFullActivity
import com.pratikamansapplication.app.modules.topplaylists.ui.TopPlaylistsActivity
import kotlin.String
import kotlin.Unit

class AppNavigationActivity :
    BaseActivity<ActivityAppNavigationBinding>(R.layout.activity_app_navigation) {
  private val viewModel: AppNavigationVM by viewModels<AppNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.appNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.linearAlbum.setOnClickListener {
      val destIntent = AlbumActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearAlbums.setOnClickListener {
      val destIntent = AlbumsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearPlaylist.setOnClickListener {
      val destIntent = PlaylistActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSetting.setOnClickListener {
      val destIntent = SettingActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearFavorites.setOnClickListener {
      val destIntent = FavoritesActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearTopPlaylists.setOnClickListener {
      val destIntent = TopPlaylistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearList.setOnClickListener {
      val destIntent = ListActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearProfile.setOnClickListener {
      val destIntent = ProfileActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArtists.setOnClickListener {
      val destIntent = ArtistsActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearHomePage.setOnClickListener {
      val destIntent = HomePageActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearArtist.setOnClickListener {
      val destIntent = ArtistActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearLogin.setOnClickListener {
      val destIntent = LoginActivity.getIntent(this, null)
      startActivity(destIntent)
    }
    binding.linearSongMenuFull.setOnClickListener {
      val destIntent = SongMenuFullActivity.getIntent(this, null)
      startActivity(destIntent)
    }
  }

  companion object {
    const val TAG: String = "APP_NAVIGATION_ACTIVITY"

  }
}
