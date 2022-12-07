package com.pratikamansapplication.app.modules.homepage.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SongsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtUrgentSiege: String? = MyApp.getInstance().resources.getString(R.string.lbl_urgent_siege)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDamnedAnthem: String? = MyApp.getInstance().resources.getString(R.string.lbl_damned_anthem)

)
