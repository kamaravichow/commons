package io.github.kamaravichow.common;

import android.content.Context;
import android.content.DialogInterface;
import android.content.pm.ApplicationInfo;

import com.google.android.material.dialog.MaterialAlertDialogBuilder;

public class DialogUtils {
    private static DialogUtils instance;
    private Context context;

    public static DialogUtils getInstance(Context context) {
        if (null == instance) {
            instance = new DialogUtils(context);
        }
        return instance;
    }

    public DialogUtils(Context context) {
        this.context = context;
    }

    public void askRatingDialog() {
        new MaterialAlertDialogBuilder(context)
                .setTitle("How was your experience ?")
                .setMessage("Would you mind telling me you experience with the application. Feel free to send feedback or drop rating in app page.")
                .setPositiveButton("I loved it \uD83D\uDE0D", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .setNegativeButton("It needs work \uD83D\uDC4E", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                })
                .show();

    }

}
