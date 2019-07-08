package com.kk.swoosh.Contrtoller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.kk.swoosh.App_Code.EXTRA_LEAGUE
import com.kk.swoosh.App_Code.EXTRA_SKILL
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val League = intent.getStringExtra(EXTRA_LEAGUE)
        val Skill = intent.getStringExtra(EXTRA_SKILL)


        SearchLeagueTxt.text = "Looking for $League $Skill league near you..."
    }
}
