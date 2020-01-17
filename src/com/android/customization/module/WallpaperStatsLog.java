// This file is autogenerated

package com.android.customization.module;

import static java.nio.charset.StandardCharsets.UTF_8;

import android.util.StatsLog;
import android.os.SystemClock;

import java.util.ArrayList;


/**
 * Utility class for logging statistics events.
 */
public class WallpaperStatsLog {
    private static final int LOGGER_ENTRY_MAX_PAYLOAD = 4068;
    private static final int MAX_EVENT_PAYLOAD = LOGGER_ENTRY_MAX_PAYLOAD - 4;
    private static final byte INT_TYPE = 0;
    private static final byte LONG_TYPE = 1;
    private static final byte STRING_TYPE = 2;
    private static final byte LIST_TYPE = 3;
    private static final byte FLOAT_TYPE = 4;
    private static final int INT_TYPE_SIZE = 5;
    private static final int FLOAT_TYPE_SIZE = 5;
    private static final int LONG_TYPE_SIZE = 9;
    private static final int STRING_TYPE_OVERHEAD = 5;
    private static final int LIST_TYPE_OVERHEAD = 2;
    // Constants for atom codes.

    /**
     * StyleUIChanged style_ui_changed<br>
     * Usage: StatsLog.write(StatsLog.STYLE_UI_CHANGED, int action, int color_package_hash, int font_package_hash, int shape_package_hash, int clock_package_hash, int launcher_grid, int wallpaper_category_hash, int wallpaper_id_hash, int color_preference, int location_preference);<br>
     */
    public static final int STYLE_UI_CHANGED = 179;

    // Constants for enum values.

    // Values for StyleUIChanged.action
    public static final int STYLE_UICHANGED__ACTION__DEFAULT_ACTION = 0;
    public static final int STYLE_UICHANGED__ACTION__ONRESUME = 1;
    public static final int STYLE_UICHANGED__ACTION__ONSTOP = 2;
    public static final int STYLE_UICHANGED__ACTION__PICKER_SELECT = 3;
    public static final int STYLE_UICHANGED__ACTION__PICKER_APPLIED = 4;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_OPEN_CATEGORY = 5;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_SELECT = 6;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_APPLIED = 7;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_EXPLORE = 8;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_DOWNLOAD = 9;
    public static final int STYLE_UICHANGED__ACTION__WALLPAPER_REMOVE = 10;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_DOWNLOAD_SUCCESS = 11;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_DOWNLOAD_FAILED = 12;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_DOWNLOAD_CANCELLED = 13;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_DELETE_SUCCESS = 14;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_DELETE_FAILED = 15;
    public static final int STYLE_UICHANGED__ACTION__LIVE_WALLPAPER_APPLIED = 16;

    // Values for StyleUIChanged.location_preference
    public static final int STYLE_UICHANGED__LOCATION_PREFERENCE__LOCATION_PREFERENCE_UNSPECIFIED = 0;
    public static final int STYLE_UICHANGED__LOCATION_PREFERENCE__LOCATION_UNAVAILABLE = 1;
    public static final int STYLE_UICHANGED__LOCATION_PREFERENCE__LOCATION_CURRENT = 2;
    public static final int STYLE_UICHANGED__LOCATION_PREFERENCE__LOCATION_MANUAL = 3;

    // Write methods
    public static void write(int code, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        // Initial overhead of the list, timestamp, and atom tag.
        int needed = LIST_TYPE_OVERHEAD + LONG_TYPE_SIZE + INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        needed += INT_TYPE_SIZE;
        if (needed > MAX_EVENT_PAYLOAD) {
            return;
        }
        byte[] buff = new byte[needed];
        int pos = 0;
        buff[pos] = LIST_TYPE;
        buff[pos + 1] = 12;
        pos += LIST_TYPE_OVERHEAD;
        long elapsedRealtime = SystemClock.elapsedRealtimeNanos();
        buff[pos] = LONG_TYPE;
        copyLong(buff, pos + 1, elapsedRealtime);
        pos += LONG_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, code);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg1);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg2);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg3);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg4);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg5);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg6);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg7);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg8);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg9);
        pos += INT_TYPE_SIZE;
        buff[pos] = INT_TYPE;
        copyInt(buff, pos + 1, arg10);
        pos += INT_TYPE_SIZE;
        StatsLog.writeRaw(buff, pos);
    }

    // Helper methods for copying primitives
    private static void copyInt(byte[] buff, int pos, int val) {
        buff[pos] = (byte) (val);
        buff[pos + 1] = (byte) (val >> 8);
        buff[pos + 2] = (byte) (val >> 16);
        buff[pos + 3] = (byte) (val >> 24);
        return;
    }

    private static void copyLong(byte[] buff, int pos, long val) {
        buff[pos] = (byte) (val);
        buff[pos + 1] = (byte) (val >> 8);
        buff[pos + 2] = (byte) (val >> 16);
        buff[pos + 3] = (byte) (val >> 24);
        buff[pos + 4] = (byte) (val >> 32);
        buff[pos + 5] = (byte) (val >> 40);
        buff[pos + 6] = (byte) (val >> 48);
        buff[pos + 7] = (byte) (val >> 56);
        return;
    }

}