package com.pratikamansapplication.app.modules.login.`data`.model

import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.di.MyApp
import kotlin.String

data class LoginModel(
  /**
   * TODO Replace with dynamic value
   */
  var txtSignin: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtSigninOne: String? = MyApp.getInstance().resources.getString(R.string.lbl_sign_in)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtForgotyourlog: String? =
      MyApp.getInstance().resources.getString(R.string.msg_forgot_your_log)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var txtCreateaccount: String? =
      MyApp.getInstance().resources.getString(R.string.lbl_create_account)
  ,
  /**
   * TODO Replace with dynamic value
   */
  var etEmainfieldValue: String? = null,
  /**
   * TODO Replace with dynamic value
   */
  var etPasswordfieldValue: String? = null
)
