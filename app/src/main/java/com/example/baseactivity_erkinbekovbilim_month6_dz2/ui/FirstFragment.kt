package com.example.baseactivity_erkinbekovbilim_month6_dz2.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.example.baseactivity_erkinbekovbilim_month6_dz2.baseFragment.BaseFragment
import com.example.baseactivity_erkinbekovbilim_month6_dz2.R
import com.example.baseactivity_erkinbekovbilim_month6_dz2.viewModel.TextViewModel
import com.example.baseactivity_erkinbekovbilim_month6_dz2.databinding.FragmentFirstBinding

class FirstFragment : BaseFragment<FragmentFirstBinding>() {

    val viewModel : TextViewModel by viewModels()

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    ) = FragmentFirstBinding.inflate(inflater, container, false)


    override fun initListener() {
        super.initListener()
        binding.apply {
            btnSend.setOnClickListener {
                val textToSend = binding.etText.text.toString()
                viewModel.textLiveData.value = textToSend
                findNavController().navigate(
                    R.id.secondFragment, bundleOf(
                        KEY_TEXT to textToSend
                    )
                )
            }
        }
    }
    companion object{
        const val KEY_TEXT = "text"
    }
}