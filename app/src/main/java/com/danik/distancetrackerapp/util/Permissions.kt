package com.danik.distancetrackerapp.util

import android.Manifest
import android.content.Context
import android.os.Build
import androidx.fragment.app.Fragment
import com.danik.distancetrackerapp.util.Constants.PERMISSION_BACKGROUND_LOCATION_REQUEST_CODE
import com.danik.distancetrackerapp.util.Constants.PERMISSION_LOCATION_REQUEST_CODE
import com.vmadalin.easypermissions.EasyPermissions

object Permissions {

    fun hasLocationPermission(context: Context) =
        EasyPermissions.hasPermissions(
            context = context,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION
        )

    fun requestLocationPermissions(fragment: Fragment){
        EasyPermissions.requestPermissions(
            fragment,
            "This app can't work properly without location permissions",
            PERMISSION_LOCATION_REQUEST_CODE,
            Manifest.permission.ACCESS_FINE_LOCATION,
            Manifest.permission.ACCESS_COARSE_LOCATION

        )
    }
    fun hasBackgroundLocationPermission(context: Context): Boolean{
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            return EasyPermissions.hasPermissions(
                context,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            )
        }
        return true
    }
    fun requestBackgroundLocationPermission(fragment: Fragment){
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q){
            EasyPermissions.requestPermissions(
                fragment,
                "Background location permission is required for proper work of this app",
                PERMISSION_BACKGROUND_LOCATION_REQUEST_CODE,
                Manifest.permission.ACCESS_BACKGROUND_LOCATION
            )
        }
    }
}