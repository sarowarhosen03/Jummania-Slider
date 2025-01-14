package com.jummania.animations

import android.view.View
import androidx.viewpager.widget.ViewPager
import kotlin.math.abs

/**
 * Created by Jummania on 17,November,2023.
 * Email: sharifuddinjumman@gmail.com
 * Dhaka, Bangladesh.
 */
class ZoomFade : ViewPager.PageTransformer {
    override fun transformPage(page: View, position: Float) {
        page.alpha = 1 - abs(position)
        page.scaleX = 1 + abs(position) / 5
        page.scaleY = 1 + abs(position) / 5
    }
}