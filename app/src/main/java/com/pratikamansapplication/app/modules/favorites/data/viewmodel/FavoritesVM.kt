package com.pratikamansapplication.app.modules.favorites.`data`.viewmodel

import android.os.Bundle
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.pratikamansapplication.app.modules.favorites.`data`.model.FavoritesModel
import org.koin.core.KoinComponent

class FavoritesVM : ViewModel(), KoinComponent {
  val favoritesModel: MutableLiveData<FavoritesModel> = MutableLiveData(FavoritesModel())

  var navArguments: Bundle? = null
}
