package com.example.dangerousbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import android.media.MediaPlayer

class MainActivity : AppCompatActivity() {
    var imgButton: ImageView? = null
    var play: MediaPlayer? = null
    var isRun = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imgButton = findViewById(R.id.imageButton)
        play  = MediaPlayer.create(this, R.raw.click_2)
    }

    fun Play(view: View) {
        view as ImageButton
        if (!isRun) {
            StartAudio()
            isRun = true
        } else {
            isRun = false
        }
    }

    fun StartAudio() {
        if (play == null) {
            play!!.isLooping = true
            play!!.start()
        } else {
            play!!.start()
        }
    }
}