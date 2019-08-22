package com.example.momstrongmove

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.ShareActionProvider
import kotlinx.android.synthetic.main.activity_refer_friend.*

class ReferFriendActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_refer_friend)

        val shareButton = google_play_button


        shareButton.setOnClickListener {
            shareApp()
        }
    }

    private fun shareApp () {

        val intent = Intent(Intent.ACTION_SEND)

        val shareSubject = "Share Momstrong!"
        val shareBody : String = "This is the body"

        intent.setType("text/plain")

        intent.putExtra(Intent.EXTRA_SUBJECT, shareSubject)
        intent.putExtra(Intent.EXTRA_TEXT, shareBody)

        startActivity(Intent.createChooser(intent, "Share Via"))

    }

//    var shareActionProvider: ShareActionProvider? = null
//
//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        // Inflate menu resource file.
//        menuInflater.inflate(R.menu.share_menu, menu)
//
//        // Locate MenuItem with ShareActionProvider
//        menu.findItem(R.id.menu_item_share).also { menuItem ->
//            // Fetch and store ShareActionProvider
//            shareActionProvider = menuItem.actionProvider as? ShareActionProvider
//        }
//
//        // Return true to display menu
//        return true
//    }
//
//    // Call to update the share intent
//    private fun setShareIntent(shareIntent: Intent) {
//        shareActionProvider?.setShareIntent(shareIntent)
//    }

}
