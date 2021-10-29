package com.example.myapplication.util

import android.content.Context
import android.content.DialogInterface
import android.view.View
import android.view.Window
import android.view.WindowManager
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.myapplication.R
import com.google.android.material.snackbar.Snackbar
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

object ViewCommonFunctions {

    fun showAlertDialogInformative(context: Context, title: String, message: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val builder = AlertDialog.Builder(context)
            builder.setTitle(title)
                .setMessage(message)
                .setPositiveButton(R.string.accept) { dialog, _ -> dialog.dismiss() }
                .create().show()
        }
    }

    fun showAlertDialogInformative(context: Context, title: Int, message: Int) {
        val builder = AlertDialog.Builder(context)
        builder.setTitle(title)
            .setMessage(message)
            .setPositiveButton(R.string.accept) { dialog, _ -> dialog.dismiss() }
            .create().show()
    }

    fun showAlertDialogDecision(
        context: Context, titleResource: Int, messageResource: String,
        confirmMessage: String, cancelMessage: String,
        positive: DialogInterface.OnClickListener,
        negative: DialogInterface.OnClickListener
    ) {
        CoroutineScope(Dispatchers.Main).launch {
            val builder = AlertDialog.Builder(context)
            builder.setTitle(titleResource)
                .setMessage(messageResource)
                .setPositiveButton(confirmMessage, positive)
                .setNegativeButton(cancelMessage, negative)
                .create().show()
        }
    }

    fun showShortToast(context: Context, message: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val toast = Toast.makeText(context, message, Toast.LENGTH_SHORT)
            toast.show()
        }
    }

    fun showLongToast(context: Context, message: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val toast = Toast.makeText(context, message, Toast.LENGTH_LONG)
            toast.show()
        }
    }

    fun showNoInternetDialog(context: Context) {
        CoroutineScope(Dispatchers.Main).launch {
            showAlertDialogInformative(
                context, context.getString(R.string.error),
                context.getString(R.string.no_internet)
            )
        }
    }

    fun showUnknowError(context: Context) {
        CoroutineScope(Dispatchers.Main).launch {
            showAlertDialogInformative(
                context, context.getString(R.string.error),
                context.getString(R.string.unknown_error)
            )
        }
    }

    fun getCommonCancelDialogListener(): DialogInterface.OnClickListener {
        return DialogInterface.OnClickListener { dialog, _ -> dialog.dismiss() }
    }

    fun showShortSnackBar(contextView: View, message: String) {
        CoroutineScope(Dispatchers.Main).launch {
            Snackbar.make(contextView, message, Snackbar.LENGTH_SHORT).show()
        }
    }

    fun showShortSnackBar(contextView: View, messageResource: Int) {
        Snackbar.make(contextView, messageResource, Snackbar.LENGTH_SHORT).show()
    }

    fun showLongSnackBar(contextView: View, message: String) {
        CoroutineScope(Dispatchers.Main).launch {
            Snackbar.make(contextView, message, Snackbar.LENGTH_LONG).show()
        }
    }

    fun disableScreeen(window : Window?){
        window!!.setFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE, WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }
    fun enableScreen(window : Window?){
        window!!.clearFlags(WindowManager.LayoutParams.FLAG_NOT_TOUCHABLE)
    }

}