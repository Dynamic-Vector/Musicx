package com.pratikamansapplication.app.modules.appnavigation.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AppNavigationModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtAppNavigation: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_app_navigation)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCheckYourAppsUIFromTheBelowDemoScreensOfYourApp: String? =
      MyApp.getInstance().resources.getString(R.string.msg_check_your_app)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbums: String? = MyApp.getInstance().resources.getString(R.string.lbl_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomePage: String? = MyApp.getInstance().resources.getString(R.string.lbl_home_page)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSongMenuFull: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_song_menu_full)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPlaylist: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTopPlaylists: String? = MyApp.getInstance().resources.getString(R.string.lbl_top_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSetting: String? = MyApp.getInstance().resources.getString(R.string.lbl_setting)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorites: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtProfile: String? = MyApp.getInstance().resources.getString(R.string.lbl_profile)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_artists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtArtist: String? = MyApp.getInstance().resources.getString(R.string.lbl_artist)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbum: String? = MyApp.getInstance().resources.getString(R.string.lbl_album)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtList: String? = MyApp.getInstance().resources.getString(R.string.lbl_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLogin: String? = MyApp.getInstance().resources.getString(R.string.lbl_login)

)
