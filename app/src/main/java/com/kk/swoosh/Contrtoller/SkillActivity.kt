package com.kk.swoosh.Contrtoller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.kk.swoosh.App_Code.EXTRA_LEAGUE
import com.kk.swoosh.App_Code.EXTRA_SKILL
import com.kk.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {
    var League = "";
    var SelletedSkill =""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        League = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun OnToggleClicked(view: View){

        when(view.id){

            R.id.BeginnerBtn ->{
                BallerBtn.isChecked = false
                SelletedSkill = "Beginner"
            }

            R.id.BallerBtn -> {
                BeginnerBtn.isChecked = false
                SelletedSkill = "Baller"
            }
        }
        //Log.d(TAG, "OnToggleClicked:" + view.id )
    }


    fun OnNextClicked(view : View){
        if(SelletedSkill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, League)
            finishActivity.putExtra(EXTRA_SKILL, SelletedSkill)
            startActivity(finishActivity)
        }else{
            Toast.makeText(this, "Please select a skill level." , Toast.LENGTH_SHORT).show()
        }

    }
}
