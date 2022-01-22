package com.example.toast_preview

import android.content.Context
import android.widget.Toast



class ToastPreview {

    companion object {

        
        fun toastShort(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_SHORT).show()
        }

        fun toastLong(context: Context, msg: String) {
            Toast.makeText(context, msg, Toast.LENGTH_LONG).show()
        }


    }
}

