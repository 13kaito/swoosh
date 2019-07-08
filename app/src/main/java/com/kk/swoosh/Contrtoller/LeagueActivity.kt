package com.kk.swoosh.Contrtoller

import android.content.Intent
import android.view.View
import android.os.Bundle
import android.widget.Toast
import com.kk.swoosh.App_Code.EXTRA_PLAYER
import com.kk.swoosh.Model.Player
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player( "","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }
    fun LeagueNextClicked(view : View){
        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
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
                player.league = "Co-ed"
            }

            R.id.MensLeagueBtn -> {
                WomensLeagueBtn.isChecked = false
                CoedLeagueBtn.isChecked=false
                player.league = "Men"
            }

            R.id.WomensLeagueBtn -> {
                MensLeagueBtn.isChecked = false
                CoedLeagueBtn.isChecked=false
                player.league = "Women"
            }
        }
        //Log.d(TAG, "OnToggleClicked:" + view.id )
    }
}
