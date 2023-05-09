package com.tswanarecipe.app.modules.home.ui

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import com.tswanarecipe.app.R
import com.tswanarecipe.app.appcomponents.base.BaseFragment
import com.tswanarecipe.app.appcomponents.views.ImagePickerFragmentDialog
import com.tswanarecipe.app.databinding.FragmentHomeBinding
import com.tswanarecipe.app.modules.home.`data`.model.CardsRowModel
import com.tswanarecipe.app.modules.home.`data`.model.NewrecipetwoRowModel
import com.tswanarecipe.app.modules.home.`data`.viewmodel.HomeVM
import com.tswanarecipe.app.modules.homecontainer.ui.HomeContainerActivity
import kotlin.Boolean
import kotlin.Int
import kotlin.String
import kotlin.Unit

class HomeFragment : BaseFragment<FragmentHomeBinding>(R.layout.fragment_home) {
  private val viewModel: HomeVM by viewModels<HomeVM>()

  private val REQUEST_CODE_HOME_CONTAINER_ACTIVITY: Int = 315


  override fun onInitialized(): Unit {
    viewModel.navArguments = arguments
    val cardsAdapter = CardsAdapter(viewModel.cardsList.value?:mutableListOf())
    binding.recyclerCards.adapter = cardsAdapter
    cardsAdapter.setOnItemClickListener(
    object : CardsAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : CardsRowModel) {
        onClickRecyclerCards(view, position, item)
      }
    }
    )
    viewModel.cardsList.observe(requireActivity()) {
      cardsAdapter.updateData(it)
    }
    val newRecipeTwoAdapter =
    NewRecipeTwoAdapter(viewModel.newRecipeTwoList.value?:mutableListOf())
    binding.recyclerNewRecipeTwo.adapter = newRecipeTwoAdapter
    newRecipeTwoAdapter.setOnItemClickListener(
    object : NewRecipeTwoAdapter.OnItemClickListener {
      override fun onItemClick(view:View, position:Int, item : NewrecipetwoRowModel) {
        onClickRecyclerNewRecipeTwo(view, position, item)
      }
    }
    )
    viewModel.newRecipeTwoList.observe(requireActivity()) {
      newRecipeTwoAdapter.updateData(it)
    }
    binding.homeVM = viewModel
    setUpSearchViewSearchListener()
  }

  override fun setUpClicks(): Unit {
    binding.btnCamera.setOnClickListener {
      ImagePickerFragmentDialog().show(childFragmentManager)
      { path ->//TODO HANDLE DATA
      }

    }
    binding.horizontalScrollHorizontalscroll.setOnClickListener {
      val destIntent = HomeContainerActivity.getIntent(requireActivity(), null)
      startActivityForResult(destIntent, REQUEST_CODE_HOME_CONTAINER_ACTIVITY)
      requireActivity().onBackPressed()
    }
  }

  fun onClickRecyclerCards(
    view: View,
    position: Int,
    item: CardsRowModel
  ): Unit {
    when(view.id) {
    }
  }

  fun onClickRecyclerNewRecipeTwo(
    view: View,
    position: Int,
    item: NewrecipetwoRowModel
  ): Unit {
    when(view.id) {
    }
  }

  private fun setUpSearchViewSearchListener(): Unit {
    binding.searchViewSearch.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
      override fun onQueryTextSubmit(p0 : String) : Boolean {
        // Performs search when user hit
        // the search button on the keyboard
        return false
      }
      override fun onQueryTextChange(p0 : String) : Boolean {
        // Start filtering the list as user
        // start entering the characters
        return false
      }
      })
    }

    companion object {
      const val TAG: String = "HOME_FRAGMENT"


      fun getInstance(bundle: Bundle?): HomeFragment {
        val fragment = HomeFragment()
        fragment.arguments = bundle
        return fragment
      }
    }
  }
