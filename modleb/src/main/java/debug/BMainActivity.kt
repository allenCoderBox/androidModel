package debug

import android.app.Activity
import android.os.Bundle
import android.widget.Toast
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.ModelBus
import kap.coder.allen.com.modleb.R
import kotlinx.android.synthetic.main.modle_b_layout.*

class BMainActivity : Activity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.modle_b_layout)
        this.button.setOnClickListener {
            ModelBus.buildAction("kap.action.PageAAction", unSupport = {
                Toast.makeText(this@BMainActivity, "不支持",Toast.LENGTH_LONG).show()
            })?.action(ActionContext.create(this@BMainActivity))
        }
    }
}