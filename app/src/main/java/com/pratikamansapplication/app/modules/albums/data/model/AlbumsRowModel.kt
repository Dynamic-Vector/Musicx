package com.pratikamansapplication.app.modules.albums.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class AlbumsRowModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtFlowerPower: String? = MyApp.getInstance().resources.getString(R.string.lbl_flower_power)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRayCharles: String? = MyApp.getInstance().resources.getString(R.string.lbl_ray_charles)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtZipcode: String? = MyApp.getInstance().resources.getString(R.string.lbl_2018)

)
