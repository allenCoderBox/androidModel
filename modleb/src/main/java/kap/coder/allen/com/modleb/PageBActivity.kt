package kap.coder.allen.com.modleb

import android.app.Activity
import android.os.Bundle
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.ModelBus
import kotlinx.android.synthetic.main.page_b_activity.*

class PageBActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page_b_activity)
        this.button.setOnClickListener {
            ModelBus.buildAction("kap.action.PageAAction")?.action(ActionContext.create(this@PageBActivity))
        }
    }
}