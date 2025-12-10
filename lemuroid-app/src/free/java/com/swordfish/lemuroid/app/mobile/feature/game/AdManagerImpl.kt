package com.swordfish.lemuroid.app.mobile.feature.game

import android.app.Activity

class AdManagerImpl : AdManager {
    override fun loadInterstitial(activity: Activity) { /* Ne fait rien */ }
    override fun showInterstitial(activity: Activity, onAdClosed: () -> Unit) {
        // Pour la version 'free', on appelle directement le callback pour ne pas bloquer le jeu.
        onAdClosed()
    }
}
