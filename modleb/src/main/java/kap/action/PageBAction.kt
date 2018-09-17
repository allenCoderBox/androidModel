package kap.action

import android.app.Activity
import android.content.Intent
import kap.coder.allen.com.baselib.ActionContext
import kap.coder.allen.com.baselib.IAction
import kap.coder.allen.com.modleb.PageBActivity

class PageBAction : IAction {
    override fun action(context: ActionContext) {
        val activity = context.target as Activity
        activity.startActivity(Intent(activity, PageBActivity::class.java))
    }
}