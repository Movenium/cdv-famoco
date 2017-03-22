# Cordova Plugin for fetching device information from famoco device

Simple plugin that returns imei of famoco device. http://www.famoco.com/

## Install

    $ cordova plugin add cdv-famoco --save
  
## Usage

```js
    var success = function(message) {
        alert(message);
    }

    var failure = function() {
        alert("Error calling cdv-famoco plugin");
    }

    famoco.getImei(success, failure);
```
