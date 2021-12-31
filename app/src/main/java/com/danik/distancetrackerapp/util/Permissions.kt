package com.danik.distancetrackerapp.util

import android.Manifest
import android.content.Context
import androidx.fragment.app.Fragment
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
}