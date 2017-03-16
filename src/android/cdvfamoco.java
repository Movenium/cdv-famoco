package org.apache.cordova.plugin;

import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CallbackContext;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
* This class echoes a string called from JavaScript.
*/
public class Famoco extends CordovaPlugin {

    @Override
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("getImei")) {
            String message = args.getString(0);
            this.getImei(message, callbackContext);
            return true;
        }
        return false;
    }

    private void getImei(String message, CallbackContext callbackContext) {
        callbackContext.success("tassa imei");
    }
}