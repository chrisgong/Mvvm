package com.cim120.retrofitstudy;

import android.app.Application;

/**
 * Created by chrisgong on 16/1/9.
 */
public class App extends Application {

    public static App INSTANCE = null;

    public static App getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new App();
        }
        return INSTANCE;
    }
}
