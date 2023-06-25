package com.example.baseactivity_erkinbekovbilim_month6_dz2

import com.example.baseactivity_erkinbekovbilim_month6_dz2.baseActivity.BaseActivity
import com.example.baseactivity_erkinbekovbilim_month6_dz2.databinding.ActivityMainBinding


class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun inflateViewBinding() = ActivityMainBinding.inflate(layoutInflater)
}