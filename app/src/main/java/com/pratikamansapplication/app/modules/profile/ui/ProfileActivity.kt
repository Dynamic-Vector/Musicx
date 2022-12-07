package com.pratikamansapplication.app.modules.profile.ui

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import com.pratikamansapplication.app.R
import com.pratikamansapplication.app.appcomponents.base.BaseActivity
import com.pratikamansapplication.app.databinding.ActivityProfileBinding
import com.pratikamansapplication.app.modules.profile.`data`.viewmodel.ProfileVM
import kotlin.String
import kotlin.Unit

class ProfileActivity : BaseActivity<ActivityProfileBinding>(R.layout.activity_profile) {
  private val viewModel: ProfileVM by viewModels<ProfileVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    binding.profileVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.imageArrowleft.setOnClickListener {
      finish()
    }
  }

  companion object {
    const val TAG: String = "PROFILE_ACTIVITY"


    fun getIntent(context: Context, bundle: Bundle?): Intent {
      val destIntent = Intent(context, ProfileActivity::class.java)
      destIntent.putExtra("bundle", bundle)
      return destIntent
    }
  }
}
