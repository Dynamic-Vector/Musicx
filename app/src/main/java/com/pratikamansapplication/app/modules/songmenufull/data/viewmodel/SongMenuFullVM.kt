package com.pratikamansapplication.app.modules.songmenufull.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pratikamansapplication.app.modules.songmenufull.`data`.model.SongMenuFullModel
import org.koin.core.KoinComponent

class SongMenuFullVM : ViewModel(), KoinComponent {
  val songMenuFullModel: MutableLiveData<SongMenuFullModel> = MutableLiveData(SongMenuFullModel())

  var navArguments: Bundle? = null
}
