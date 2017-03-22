/*global cordova, module*/

module.exports = {
    getImei: function (name, successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "famoco", "getImei", [name]);
    }
};
