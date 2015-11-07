package com.lysbon.gronefc;

import android.app.Application;

import com.lysbon.gronefc.ents.Constants;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;
import com.twitter.sdk.android.tweetui.TweetUi;

import io.fabric.sdk.android.Fabric;

public class MyApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        TwitterAuthConfig authConfig =  new TwitterAuthConfig(Constants.SigningKey.TWITTER_KEY,Constants.SigningKey.TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new TweetUi());

    }
}