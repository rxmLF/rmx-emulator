package com.swordfish.lemuroid.app.mobile.feature.game

import android.app.Activity

interface AdManager {
    fun loadInterstitial(activity: Activity)
    fun showInterstitial(activity: Activity, onAdClosed: () -> Unit)
}
