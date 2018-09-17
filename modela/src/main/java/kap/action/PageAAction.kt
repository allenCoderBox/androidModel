package kap.action

import android.app.Activity
import android.content.Intent
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.IAction
import kap.coder.allen.com.modela.PageAActivity

class PageAAction : IAction {
    override fun action(context: ActionContext) {
        val content = context.target as Activity
        content.startActivity(Intent(content, PageAActivity::class.java))
    }
}