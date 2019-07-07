package com.kk.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_welcome.*

class LeagueActivity : BaseActivity() {
    var selectedLeague = "";
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    fun LeagueNextClicked(view : View){
        if(selectedLeague != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_LEAGUE, selectedLeague)
            startActivity(skillActivity)
        }else{
            Toast.makeText(this, "Please select a league." , Toast.LENGTH_SHORT).show()
        }

    }

    fun OnToggleClicked(view:View){

        when(view.id){

            R.id.CoedLeagueBtn ->{
                WomensLeagueBtn.isChecked = false
                MensLeagueBtn.isChecked=false
                selectedLeague = "Coed"
            }

            R.id.MensLeagueBtn -> {
                WomensLeagueBtn.isChecked = false
                CoedLeagueBtn.isChecked=false
                selectedLeague = "Men"
            }

            R.id.WomensLeagueBtn -> {
                MensLeagueBtn.isChecked = false
                CoedLeagueBtn.isChecked=false
                selectedLeague = "Women"
            }
        }
        //Log.d(TAG, "OnToggleClicked:" + view.id )
    }
}
