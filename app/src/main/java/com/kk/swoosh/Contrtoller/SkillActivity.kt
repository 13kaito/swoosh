package com.kk.swoosh.Contrtoller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kk.swoosh.App_Code.EXTRA_PLAYER
import com.kk.swoosh.Model.Player
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    lateinit var player : Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun OnToggleClicked(view: View){

        when(view.id){

            R.id.BeginnerBtn ->{
                BallerBtn.isChecked = false
                player.skill = "Beginner"
            }

            R.id.BallerBtn -> {
                BeginnerBtn.isChecked = false
                player.skill = "Baller"
            }
        }
        //Log.d(TAG, "OnToggleClicked:" + view.id )
    }


    fun OnNextClicked(view : View){
        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level." , Toast.LENGTH_SHORT).show()
        }

    }
}
