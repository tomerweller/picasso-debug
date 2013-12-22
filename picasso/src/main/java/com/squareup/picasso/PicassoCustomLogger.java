package com.squareup.picasso;

/**
 * Created by tomerweller on 12/19/13.
 */
public class PicassoCustomLogger {
    private static CustomLogger sLogger = null;

    public interface CustomLogger {
        void logError(String msg);
    }

    public static void setupCustomLogger(CustomLogger logger) {
        sLogger = logger;
    }

    public static void logError(String msg) {
        if (sLogger != null) {
            sLogger.logError(msg);
        }
    }
}
