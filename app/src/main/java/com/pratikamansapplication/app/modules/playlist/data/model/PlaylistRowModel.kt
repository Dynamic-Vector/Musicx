package com.pratikamansapplication.app.modules.playlist.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PlaylistRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtIvarsRevenge: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_ivar_s_revenge)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDanheim: String? = MyApp.getInstance().resources.getString(R.string.lbl_danheim)

)
