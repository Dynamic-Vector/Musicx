package com.pratikamansapplication.app.modules.artists.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class ArtistsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtLorn: String? = MyApp.getInstance().resources.getString(R.string.lbl_lorn)
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

)
