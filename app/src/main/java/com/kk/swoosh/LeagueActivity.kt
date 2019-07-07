package com.kk.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_welcome.*

class LeagueActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun LeagueNextClicked(view : View){
        val skillActivity = Intent(this, SkillActivity::class.java)
        startActivity(skillActivity)
    }
}
