package com.pratikamansapplication.app.modules.homepage.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class HomePageModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtDashboard: String? = MyApp.getInstance().resources.getString(R.string.lbl_dashboard)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtListentomusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_listen_to_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtWithoutrestric: String? =
      MyApp.getInstance().resources.getString(R.string.msg_without_restric)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPrice: String? = MyApp.getInstance().resources.getString(R.string.msg_free_for_3_mont)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNewreleases: String? = MyApp.getInstance().resources.getString(R.string.lbl_new_releases)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtViewAll: String? = MyApp.getInstance().resources.getString(R.string.lbl_view_all)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtUrgentSiegeTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_urgent_siege)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDamnedAnthemTwo: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_damned_anthem)
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
