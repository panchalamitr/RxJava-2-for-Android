package com.panchalamitr.rxjavaoperators

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.panchalamitr.rxjavaoperators.databinding.ActivityMainBinding
import timber.log.Timber
import timber.log.Timber.DebugTree


class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var activityMainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(activityMainBinding.root)

        activityMainBinding.btnMap.setOnClickListener(this)
        activityMainBinding.btnFlatMap.setOnClickListener(this)
        activityMainBinding.btnConcatMap.setOnClickListener(this)
        activityMainBinding.btnSwitchMap.setOnClickListener(this)

        Timber.plant(DebugTree())
    }

    override fun onClick(v: View?) {
        when(v!!.id){
            R.id.btnMap -> {
                startActivity(Intent(MainActivity@ this, MapActivity::class.java))
            }

            R.id.btnFlatMap -> {
                startActivity(Intent(MainActivity@ this, FlatMapActivity::class.java))
            }

            R.id.btnConcatMap -> {
                startActivity(Intent(MainActivity@ this, ConcatMapActivity::class.java))
            }

            R.id.btnSwitchMap -> {
                startActivity(Intent(MainActivity@ this, SwitchMapActivity::class.java))
            }
        }
    }


}