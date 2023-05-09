package com.tswanarecipe.app.modules.homenavigation.ui

import android.view.View
import androidx.activity.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseActivity
import com.tswanarecipe.app.appcomponents.views.ImagePickerFragmentDialog
import com.tswanarecipe.app.databinding.ActivityHomeNavigationBinding
import com.tswanarecipe.app.modules.homenavigation.`data`.model.Cards2RowModel
import com.tswanarecipe.app.modules.homenavigation.`data`.model.CardsnewrecipRowModel
import com.tswanarecipe.app.modules.homenavigation.`data`.viewmodel.HomeNavigationVM
import com.tswanarecipe.app.modules.recipeingrident.ui.RecipeIngridentActivity
import com.tswanarecipe.app.modules.search.ui.SearchActivity
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeNavigationActivity :
    BaseActivity<ActivityHomeNavigationBinding>(R.layout.activity_home_navigation) {
  private val viewModel: HomeNavigationVM by viewModels<HomeNavigationVM>()

  override fun onInitialized(): Unit {
    viewModel.navArguments = intent.extras?.getBundle("bundle")
    val cardsAdapter = CardsAdapter(viewModel.cardsList.value?:mutableListOf())
    binding.recyclerCards.adapter = cardsAdapter
    cardsAdapter.setOnItemClickListener(
    object : CardsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : Cards2RowModel) {
        onClickRecyclerCards(view, position, item)
      }
    }
    )
    viewModel.cardsList.observe(this) {
      cardsAdapter.updateData(it)
    }
    val cardsNewRecipAdapter =
    CardsNewRecipAdapter(viewModel.cardsNewRecipList.value?:mutableListOf())
    binding.recyclerCardsNewRecip.adapter = cardsNewRecipAdapter
    cardsNewRecipAdapter.setOnItemClickListener(
    object : CardsNewRecipAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardsnewrecipRowModel) {
        onClickRecyclerCardsNewRecip(view, position, item)
      }
    }
    )
    viewModel.cardsNewRecipList.observe(this) {
      cardsNewRecipAdapter.updateData(it)
    }
    binding.homeNavigationVM = viewModel
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(supportFragmentManager)
      { path ->//TODO HANDLE DATA
      }

          }
      binding.searchViewSearch.setOnClickListener {
        val destIntent = SearchActivity.getIntent(this, null)
        startActivity(destIntent)
      }
    }

    fun onClickRecyclerCards(
      view: View,
      position: Int,
      item: Cards2RowModel
    ): Unit {
      when(view.id) {
        R.id.frameFoodPhoto ->  {
          val destIntent = RecipeIngridentActivity.getIntent(this, null)
          startActivity(destIntent)
        }
      }
    }

    fun onClickRecyclerCardsNewRecip(
      view: View,
      position: Int,
      item: CardsnewrecipRowModel
    ): Unit {
      when(view.id) {
      }
    }

    companion object {
      const val TAG: String = "HOME_NAVIGATION_ACTIVITY"

    }
  }
