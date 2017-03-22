package com.movenium.plugin;

import android.telephony.TelephonyManager;

import org.apache.cordova.*;
import org.json.JSONArray;
import org.json.JSONException;

import static android.content.Context.TELEPHONY_SERVICE;

public class famoco extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray data, CallbackContext callbackContext) throws JSONException {

        if (action.equals("getImei")) {

            TelephonyManager mngr = (TelephonyManager) this.cordova.getActivity().getSystemService(TELEPHONY_SERVICE);
            String imei = mngr.getDeviceId();

            callbackContext.success(imei);

            return true;

        } else {
            
            return false;

        }
    }
}
