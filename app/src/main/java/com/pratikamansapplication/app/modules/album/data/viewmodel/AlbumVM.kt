package com.pratikamansapplication.app.modules.album.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pratikamansapplication.app.modules.album.`data`.model.AlbumModel
import com.pratikamansapplication.app.modules.album.`data`.model.AlbumRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class AlbumVM : ViewModel(), KoinComponent {
  val albumModel: MutableLiveData<AlbumModel> = MutableLiveData(AlbumModel())

  var navArguments: Bundle? = null

  val albumList: MutableLiveData<MutableList<AlbumRowModel>> = MutableLiveData(mutableListOf())
}
