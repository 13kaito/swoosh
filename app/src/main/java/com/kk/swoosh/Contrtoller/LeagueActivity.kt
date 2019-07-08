package com.kk.swoosh.Contrtoller

import android.content.Intent
import android.view.View
import android.os.Bundle
import android.widget.Toast
import com.kk.swoosh.App_Code.EXTRA_LEAGUE
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

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
                selectedLeague = "Co-ed"
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
