package kap.coder.allen.com.testmodel

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.ModelBus
import kap.coder.allen.com.baselib.ModleBuss
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        this.pageA.setOnClickListener {
//            ModelBus.buildAction("kap.action.PageAAction")?.action(ActionContext.create(this@MainActivity))
            Toast.makeText(this, ModleBuss.list.size.toString(), Toast.LENGTH_LONG).show()
        }


        this.pageB.setOnClickListener {
            ModelBus.buildAction("kap.action.PageBAction")?.action(ActionContext.create(this@MainActivity))
        }

    }
}
