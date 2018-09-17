package kap.coder.allen.com.modela

import android.app.Activity
import android.os.Bundle
import kap.coder.allen.com.testmodel.R

class PageAActivity :Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_a_layout)
    }
}