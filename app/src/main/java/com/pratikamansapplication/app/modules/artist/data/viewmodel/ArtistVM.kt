package com.pratikamansapplication.app.modules.artist.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pratikamansapplication.app.modules.artist.`data`.model.ArtistModel
import com.pratikamansapplication.app.modules.artist.`data`.model.Songs1RowModel
import kotlin.collections.MutableList
import org.koin.core.KoinComponent

class ArtistVM : ViewModel(), KoinComponent {
  val artistModel: MutableLiveData<ArtistModel> = MutableLiveData(ArtistModel())

  var navArguments: Bundle? = null

  val songsList: MutableLiveData<MutableList<Songs1RowModel>> = MutableLiveData(mutableListOf())
}
