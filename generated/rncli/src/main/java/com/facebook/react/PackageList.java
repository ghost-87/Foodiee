
package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import java.util.Arrays;
import java.util.ArrayList;

import com.ionicfirebaseapp.restaurantappreactnative.BuildConfig;
import com.ionicfirebaseapp.restaurantappreactnative.R;

// react-native-image-picker
import com.imagepicker.ImagePickerPackage;
// react-native-languages
import com.reactcommunity.rnlanguages.RNLanguagesPackage;
// react-native-onesignal
import com.geektime.rnonesignalandroid.ReactNativeOneSignalPackage;
// react-native-smart-splash-screen
import com.reactnativecomponent.splashscreen.RCTSplashScreenPackage;
// react-native-vector-icons
import com.oblador.vectoricons.VectorIconsPackage;

public class PackageList {
  private Application application;
  private ReactNativeHost reactNativeHost;
  public PackageList(ReactNativeHost reactNativeHost) {
    this.reactNativeHost = reactNativeHost;
  }

  public PackageList(Application application) {
    this.reactNativeHost = null;
    this.application = application;
  }

  private ReactNativeHost getReactNativeHost() {
    return this.reactNativeHost;
  }

  private Resources getResources() {
    return this.getApplication().getResources();
  }

  private Application getApplication() {
    if (this.reactNativeHost == null) return this.application;
    return this.reactNativeHost.getApplication();
  }

  private Context getApplicationContext() {
    return this.getApplication().getApplicationContext();
  }

  public ArrayList<ReactPackage> getPackages() {
    return new ArrayList<>(Arrays.<ReactPackage>asList(
      new MainReactPackage(),
      new ImagePickerPackage(),
      new RNLanguagesPackage(),
      new ReactNativeOneSignalPackage(),
      new RCTSplashScreenPackage(),
      new VectorIconsPackage()
    ));
  }
}
