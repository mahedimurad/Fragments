package com.sarwar.fragmentexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(),PhotosFragment.PhotoFragmentActions {
    private lateinit var videosFragment: VideosFragment
    private lateinit var photosFragment: PhotosFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Fragment

         photosFragment = PhotosFragment()

         videosFragment = VideosFragment()


        // Fragment Manager

        supportFragmentManager.beginTransaction().add(container1.id,photosFragment).commit()
        supportFragmentManager.beginTransaction().add(container2.id,videosFragment).commit()


        btnNextPage.setOnClickListener {
            startActivity(Intent(this,TabLayoutExample::class.java))
        }
    }

    override fun onTextClick() {
        videosFragment.updateText("hello from photos fragment")
    }
}