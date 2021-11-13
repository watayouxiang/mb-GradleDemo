package com.watayouxiang.gradlerouter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.watayouxiang.router.annotations.Destination

@Destination(url = "router://watayouxiang/profile", description = "个人信息")
class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)
    }
}