/*global cordova, module*/

module.exports = {
    getImei: function (successCallback, errorCallback) {
        cordova.exec(successCallback, errorCallback, "famoco", "getImei", []);
    }
};
