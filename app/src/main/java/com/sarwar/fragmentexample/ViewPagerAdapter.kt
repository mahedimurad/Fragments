package com.sarwar.fragmentexample

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getCount(): Int {
        return 3
    }

    override fun getItem(position: Int): Fragment {
        var fragmet : Fragment? = null
        fragmet = when(position){
            0 -> PhotosFragment()
            1 -> VideosFragment()
            2 -> AudiosFragment()
            else -> PhotosFragment()
        }

        return fragmet
    }

    override fun getPageTitle(position: Int): CharSequence? {
        var title : String? = null
        title = when(position){
            0 -> "Photos"
            1 -> "Videos"
            2 -> "Audio"
            else -> ""
        }

        return title
    }
}