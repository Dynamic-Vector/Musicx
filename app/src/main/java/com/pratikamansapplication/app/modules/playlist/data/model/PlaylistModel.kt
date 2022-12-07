package com.pratikamansapplication.app.modules.playlist.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class PlaylistModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtPlayNowPlayl: String? =
      MyApp.getInstance().resources.getString(R.string.msg_play_now_playl)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodvalCaplella: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podval_caplella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTime: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_36)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtTimeOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMusicList: String? = MyApp.getInstance().resources.getString(R.string.lbl_music_list)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtBurningCopy: String? = MyApp.getInstance().resources.getString(R.string.lbl_burning)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtFlashbacks: String? = MyApp.getInstance().resources.getString(R.string.lbl_flashbacks)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtEmika: String? = MyApp.getInstance().resources.getString(R.string.lbl_emika)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtRenaissance: String? = MyApp.getInstance().resources.getString(R.string.lbl_renaissance)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtPodvalCaplellaOne: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_podval_caplella)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtNOW: String? = MyApp.getInstance().resources.getString(R.string.lbl_now)

)
