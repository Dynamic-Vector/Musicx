package com.pratikamansapplication.app.modules.favorites.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class FavoritesModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_favourites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDidyoulikeit: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_did_you_like_it)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTracksCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_tracks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTracks: String? = MyApp.getInstance().resources.getString(R.string.lbl_tracks)
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
  var txtPlaylists: String? = MyApp.getInstance().resources.getString(R.string.lbl_playlists)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUrgentSiege: String? = MyApp.getInstance().resources.getString(R.string.lbl_urgent_siege)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDamnedAnthem: String? = MyApp.getInstance().resources.getString(R.string.lbl_damned_anthem)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHomeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_home)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTop: String? = MyApp.getInstance().resources.getString(R.string.lbl_top)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFavorites: String? = MyApp.getInstance().resources.getString(R.string.lbl_favorites)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSearchOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_search)

)
