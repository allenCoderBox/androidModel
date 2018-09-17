package kap.coder.allen.com.testmodel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.modelA.ModelAAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.pageA.setOnClickListener {
            ModelAAdapter.buildAction("kap.action.PageAAction")?.action(ActionContext.create(this@MainActivity))
        }


        this.pageB.setOnClickListener {
            ModelAAdapter.buildAction("kap.action.PageBAction")?.action(ActionContext.create(this@MainActivity))
        }

    }
}
