package com.pratikamansapplication.app.modules.songmenufull.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SongMenuFullModel(
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
  var txtTimeTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_43)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtAddtoPlaylist: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_add_to_playlist)
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
  var txtIdontlikeit: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_i_don_t_like_it)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSonglyrics: String? = MyApp.getInstance().resources.getString(R.string.lbl_song_lyrics)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDownloadOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_download)

)
