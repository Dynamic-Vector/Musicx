package com.pratikamansapplication.app.modules.setting.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class SettingModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtEqualizer: String? = MyApp.getInstance().resources.getString(R.string.lbl_equalizer)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDbCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHzCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_60_hz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDbCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_3_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHzCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_150_hz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDbCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtHzCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_400_hz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDbCounterThree: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhzCounter: String? = MyApp.getInstance().resources.getString(R.string.lbl_1_0_khz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDB: String? = MyApp.getInstance().resources.getString(R.string.lbl_4_db2)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhzCounterOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_2_4_khz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDbCounterFour: String? = MyApp.getInstance().resources.getString(R.string.lbl_0_db)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtKhzCounterTwo: String? = MyApp.getInstance().resources.getString(R.string.lbl_15_khz)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtMySettings: String? = MyApp.getInstance().resources.getString(R.string.lbl_my_settings)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDefault: String? = MyApp.getInstance().resources.getString(R.string.lbl_default)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClubmusic: String? = MyApp.getInstance().resources.getString(R.string.lbl_club_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtClassicalmusic: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_classical_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtDancemusic: String? = MyApp.getInstance().resources.getString(R.string.lbl_dance_music)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowfrequencyg: String? =
      MyApp.getInstance().resources.getString(R.string.msg_low_frequency_g)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtLowfrequencygOne: String? =
      MyApp.getInstance().resources.getString(R.string.msg_low_frequency_g)

)
