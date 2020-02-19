package com.example.experimentalapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import com.teresaholfeld.stories.StoriesProgressView
import kotlinx.android.synthetic.main.activity_main.*
import tech.posit.android.data.repository.model.Product
import tech.posit.android.posit.PositCallback

class MainActivity : AppCompatActivity(), StoriesProgressView.StoriesListener {

    val wallpaperList = listOf(
        "https://source.unsplash.com/daily",
        "https://source.unsplash.com/user/erondu/daily",
        "https://source.unsplash.com/weekly?water",
        "https://source.unsplash.com/weekly?sun",
        "https://source.unsplash.com/weekly?girl"
    )
    private var currentStory = -1
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        stories.setStoriesCount(5) // <- set stories
        stories.setStoryDuration(3000L) // <- set a story duration
        stories.setStoriesListener(this) // <- set listener
        stories.startStories()
    }

    override fun onComplete() {
//        PositCallback
    }

    override fun onNext() {
        currentStory++
        Picasso.get().load(wallpaperList[currentStory])
            .into(imageView)
    }

    override fun onPrev() {
        currentStory--
        Picasso.get()
            .load(wallpaperList[currentStory])
            .into(imageView)
    }
}
