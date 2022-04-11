package com.cahrusat.surveyapplication

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.WindowManager
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_family_members.*
import kotlinx.android.synthetic.main.member_dialog.*

class FamilyMembersActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var viewModel: FamilyHeadActivityVillageViewModel
        lateinit var viewModelFamilyHead: FamilyHeadActivityViewModel
        lateinit var adapter1: ArrayAdapter<String>
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_family_members)
        addFamilyMember.setOnClickListener {
            var dialog=Dialog(this)
            dialog.setContentView(R.layout.member_dialog)
            dialog.setCancelable(false)
            val lp = WindowManager.LayoutParams()
            lp.copyFrom(dialog.window!!.attributes)
            lp.width = WindowManager.LayoutParams.MATCH_PARENT
            lp.height = WindowManager.LayoutParams.WRAP_CONTENT
            lp.gravity = Gravity.CENTER

            dialog.window!!.attributes = lp
            dialog.show()

            btnAddMemberDialogue.setOnClickListener{

            }
        }
    }
}