/*******************************************************************************
 * Copyright (c) 2012 Pursuer (http://pursuer.me).
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at
 * http://www.gnu.org/licenses/gpl.html
 * 
 * Contributors:
 *     Pursuer - initial API and implementation
 ******************************************************************************/

package com.pursuer.reader.easyrss.data;

import android.content.Context;
import com.google.analytics.tracking.android.GoogleAnalytics;
import com.google.analytics.tracking.android.Tracker;

public class GoogleAnalyticsMgr {
    final static private String UUID = "UA-25717510-1";
    final static public int SCOPE_VISITOR_LEVEL = 1;
    final static public int SCOPE_SESSION_LEVEL = 2;
    final static public int SCOPE_PAGE_LEVEL = 3;

    final static public String ACTION_SYNCING_TAGS = "syncingTags";
    final static public String ACTION_SYNCING_SUBSCRIPTIONS = "syncingSubscriptions";
    final static public String ACTION_SYNCING_UNREADCOUNTS = "syncingUnreadCounts";
    final static public String CATEGORY_SYNCING = "syncing";
    final static public String CUSTOM_VAR_VERSION = "version";
    final static public String CUSTOM_VAR_READING_SETTING = "readingSettings";
    final static public String CUSTOM_VAR_STORAGE_SETTING = "storageSettings";
    final static public String CUSTOM_VAR_SYNCING_SETTING = "syncingSettings";

    private static GoogleAnalyticsMgr instance = null;

    public static GoogleAnalyticsMgr getInstance() {
        return instance;
    }

    public static synchronized void init(final Context context) {
        if (instance == null) {
            instance = new GoogleAnalyticsMgr(context);
        }
    }

    final private Tracker tracker;
    final private Context context;

    private GoogleAnalyticsMgr(final Context context) {
        this.tracker = GoogleAnalytics.getInstance(context).getTracker("?");
        this.context = context;
    }

    public void dispatch() {
        tracker.close();
    }

    public void setCustomVar(final int index, final String name, final String value, final int scope) {
        //tracker.setCustomVar(index, name, value, scope);
    }

    public void startTracking() {
        /*tracker.startNewSession(UUID, context);
        tracker.setCustomVar(1, CUSTOM_VAR_VERSION, context.getString(R.string.Version));
        final DataMgr dataMgr = DataMgr.getInstance();
        {
            final StringBuffer buffer = new StringBuffer();
            buffer.append(new SettingSyncMethod(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingImageFetching(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingImagePrefetching(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingImmediateStateSyncing(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingHttpsConnection(dataMgr).getData());
            tracker.setCustomVar(2, CUSTOM_VAR_SYNCING_SETTING, buffer.toString());
        }
        {
            tracker.setCustomVar(3, CUSTOM_VAR_STORAGE_SETTING, String.valueOf(new SettingMaxItems(dataMgr)));
        }
        {
            final StringBuffer buffer = new StringBuffer();
            buffer.append(new SettingFontSize(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingTheme(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingDescendingItemsOrdering(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingNotificationOn(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingMarkAllAsReadConfirmation(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingBrowserChoice(dataMgr).getData());
            buffer.append('_');
            buffer.append(new SettingVolumeKeySwitching(dataMgr).getData());
            tracker.setCustomVar(4, CUSTOM_VAR_READING_SETTING, buffer.toString());
        }*/
    }

    public void trackEvent(final String category, final String action, final String label, final int value) {
        //tracker.trackEvent(category, action, label, value);
    }

    public void trackPageView(final String page) {
        //tracker.trackPageView(page);
    }
}
