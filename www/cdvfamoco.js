

window.getImei = function(str, callback) {
    cordova.exec(callback, function(err) {
        callback('Fetching imei failed.');
    }, "Famoco", "getImei", [str]);
};