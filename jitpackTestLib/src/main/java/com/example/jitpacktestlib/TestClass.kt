package com.example.jitpacktestlib

import android.content.Context
import android.widget.Toast

/**
 *
 * @author hunet
 * @date
 **/
class TestClass {
    companion object{
        fun showToast(context: Context, message: String){
            Toast.makeText(context, "테스트 : ${message}", Toast.LENGTH_SHORT).show()
        }
    }
}