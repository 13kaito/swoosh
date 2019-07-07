package com.kk.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlin.math.log

class SkillActivity : BaseActivity() {
    var League = "";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        League = intent.getStringExtra(EXTRA_LEAGUE)
        println(League)
    }
}
