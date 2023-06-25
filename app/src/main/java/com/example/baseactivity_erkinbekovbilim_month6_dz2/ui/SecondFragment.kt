package com.example.baseactivity_erkinbekovbilim_month6_dz2.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.baseactivity_erkinbekovbilim_month6_dz2.R
import com.example.baseactivity_erkinbekovbilim_month6_dz2.baseFragment.BaseFragment
import com.example.baseactivity_erkinbekovbilim_month6_dz2.data.Movie
import com.example.baseactivity_erkinbekovbilim_month6_dz2.databinding.FragmentSecondBinding
import com.example.baseactivity_erkinbekovbilim_month6_dz2.viewModel.TextViewModel

class SecondFragment : BaseFragment<FragmentSecondBinding>() {

    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?,
    )= FragmentSecondBinding.inflate(inflater, container, false)

    override fun getData() {
        super.getData()
        arguments?.apply {
                val getText = getString(FirstFragment.KEY_TEXT)
                binding.apply {
                    tvText.text = getText
            }
        }
    }
    override fun setData() {
        super.setData()
        val movie = Movie(title = "Сверху картинка", image = R.drawable.ic_heart)
        binding.apply {
            tvTile.text = movie.title
            image.setImageResource(movie.image)
        }
    }
}