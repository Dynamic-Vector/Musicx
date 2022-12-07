package com.pratikamansapplication.app.modules.album.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AlbumModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtArtists: String? = MyApp.getInstance().resources.getString(R.string.lbl_wunder_king)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWunderKing: String? = MyApp.getInstance().resources.getString(R.string.lbl_wunder_king)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)
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
