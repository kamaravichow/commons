package io.github.kamaravichow.common;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;

public class LogUtils {
    public static final String LOG_TAG = "LOG_UTILS";
    private static LogUtils instance;
    private Context context;
    private boolean isDebuggable = false;

    public static LogUtils getInstance(Context context) {
        if (null == instance) {
            instance = new LogUtils(context);
        }
        return instance;
    }

    public LogUtils(Context context) {
        this.context = context;
        this.isDebuggable = (0 != (context.getApplicationInfo().flags & ApplicationInfo.FLAG_DEBUGGABLE));
    }

    public void logInfo(String message) {
        if (isDebuggable) {
            Log.i(LOG_TAG, message);
        }
    }

    public void logError(Exception e) {
        if (isDebuggable) {
            Log.e(LOG_TAG, e.getMessage());
        }
    }

    public void logVerbose(String message) {
        if (isDebuggable) {
            Log.v(LOG_TAG, message);
        }
    }
}
