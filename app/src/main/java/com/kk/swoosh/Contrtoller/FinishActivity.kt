package com.kk.swoosh.Contrtoller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kk.swoosh.App_Code.EXTRA_PLAYER
import com.kk.swoosh.Model.Player
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        SearchLeagueTxt.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}
