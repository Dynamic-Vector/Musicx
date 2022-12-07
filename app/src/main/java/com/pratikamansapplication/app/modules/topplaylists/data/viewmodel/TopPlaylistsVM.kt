package com.pratikamansapplication.app.modules.topplaylists.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pratikamansapplication.app.modules.topplaylists.`data`.model.TopPlaylistsModel
import com.pratikamansapplication.app.modules.topplaylists.`data`.model.TopPlaylistsRowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class TopPlaylistsVM : ViewModel(), KoinComponent {
  val topPlaylistsModel: MutableLiveData<TopPlaylistsModel> = MutableLiveData(TopPlaylistsModel())

  var navArguments: Bundle? = null

  val topPlaylistsList: MutableLiveData<MutableList<TopPlaylistsRowModel>> =
      MutableLiveData(mutableListOf())
}
