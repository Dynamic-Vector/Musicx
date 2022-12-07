package com.pratikamansapplication.app.modules.artist.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ArtistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRenaissance: String? = MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTracksCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_843_tracks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAlbumsCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_23_albums)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewreleases: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_releases)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewall: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
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
