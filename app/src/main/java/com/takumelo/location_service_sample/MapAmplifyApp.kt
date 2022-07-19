package com.takumelo.location_service_sample

import android.app.Application
import android.util.Log
import com.amplifyframework.AmplifyException
import com.amplifyframework.core.Amplify
import com.amplifyframework.auth.cognito.AWSCognitoAuthPlugin
import com.amplifyframework.geo.location.AWSLocationGeoPlugin

class MapAmplifyApp : Application(){
    override fun onCreate() {
        super.onCreate()

        try {
            Amplify.addPlugin(AWSCognitoAuthPlugin())
            Amplify.addPlugin(AWSLocationGeoPlugin())
            Amplify.configure(applicationContext)
            Log.i("MyAmplifyApp", "Initialized Amplify")
        } catch (error: AmplifyException) {
            Log.e("MyAmplifyApp", "Could not initialize Amplify", error)
        }
    }
}