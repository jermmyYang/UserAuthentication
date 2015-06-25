var style = {
    fillColor: '#fff',
    fillOpacity: 0.1,
    strokeWidth: 0
};

var map = new OpenLayers.Map('Map');
var layer = new OpenLayers.Layer.OSM( "Simple OSM Map");
var vector = new OpenLayers.Layer.Vector('vector');
map.addLayers([layer, vector]);
map_marker = new OpenLayers.Layer.Markers( "Markers" );
map.addLayer(map_marker);
// map.setCenter(
//     new OpenLayers.LonLat(map.getCenter()).transform(
//         new OpenLayers.Projection("EPSG:4326"),
//         map.getProjectionObject()
//     ), 10
// );

var pulsate = function(feature) {
    var point = feature.geometry.getCentroid(),
        bounds = feature.geometry.getBounds(),
        radius = Math.abs((bounds.right - bounds.left)/2),
        count = 0,
        grow = 'up';

    var resize = function(){
        if (count>16) {
            clearInterval(window.resizeInterval);
        }
        var interval = radius * 0.03;
        var ratio = interval/radius;
        switch(count) {
            case 4:
            case 12:
                grow = 'down'; break;
            case 8:
                grow = 'up'; break;
        }
        if (grow!=='up') {
            ratio = - Math.abs(ratio);
        }
        feature.geometry.resize(1+ratio, point);
        vector.drawFeature(feature);
        count++;
    };
    window.resizeInterval = window.setInterval(resize, 50, point, radius);
};

//var geolocate = new OpenLayers.Control.Geolocate({
//    bind: false,
//    geolocationOptions: {
//        enableHighAccuracy: true,
//        maximumAge: 0,
//        timeout: 7000
//    }
//});
function init_map(lon,lat){
//    map.destroy();

    map_marker.clearMarkers();
    if(lon == undefined || lat == undefined){
        //current_position = new OpenLayers.LonLat(103.850679,1.289744).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
        current_position = new OpenLayers.LonLat(103.8505155,1.3595968).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
    }
    else{
        current_position = new OpenLayers.LonLat(lon,lat).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
    }
    //map.setCenter(current_position,16);   // zoom:  {Integer} Optional zoom level.
    map.setCenter(current_position,11);

    if(lon != undefined && lat != undefined){
        var marker_position = new OpenLayers.LonLat(lon, lat).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
        var init_marker = new OpenLayers.Marker(marker_position);
        map_marker.addMarker(init_marker);
    }
    map.events.register('click',map,function(evt){
        var lonlat = map.getLonLatFromPixel(evt.xy);
        lonlat.transform(map.getProjectionObject(),map.projection);
        var urlStr = '';

        var ie9Below = false;
        if(navigator.userAgent.indexOf("MSIE")>0){
            if(navigator.userAgent.indexOf("MSIE 9.0")>0){
                ie9Below = true;
            }else if(navigator.userAgent.indexOf("MSIE 8.0")>0){
                ie9Below = true;
            }else if(navigator.userAgent.indexOf("MSIE 7.0")>0){
                ie9Below = true;
            }else if(navigator.userAgent.indexOf("MSIE 6.0")>0){
                ie9Below = true;
            }
        }
        if(ie9Below){
            urlStr = '/map/reverse?lat=' + lonlat.lat+'&lon='+lonlat.lon;
        }else{
            urlStr = 'http://nominatim.openstreetmap.org/reverse?format=json&lat='+lonlat.lat+'&lon='+lonlat.lon+'&accept-language=en-us';
        }

        $.ajax({
            url: urlStr,
            type:'get',
            cache : false,
            success:function(data){
//                console.log(data);
                map_marker.clearMarkers();
                $("#location").val(data.display_name);
                var longitude = data.lon;
                var latitude = data.lat;
                $("#longitude").val(longitude);
                $("#latitude").val(latitude);
                var point_position = new OpenLayers.LonLat(longitude, latitude).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
                var point_marker = new OpenLayers.Marker(point_position);
                map_marker.addMarker(point_marker);
            }
        })
    });
}

//map.addControl(geolocate);
var firstGeolocation = true;
var current_position;
var map_marker;
var current_marker;
//geolocate.events.register("locationupdated",geolocate,function(e) {
//    current_position = new OpenLayers.LonLat(e.position.coords.longitude, e.position.coords.latitude).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
//    map_marker = new OpenLayers.Layer.Markers( "Markers" );
//
//    map.addLayer(map_marker);
//    map.events.register('click',map,function(evt){
//        var lonlat = map.getLonLatFromPixel(evt.xy);
//        lonlat.transform(map.getProjectionObject(),map.projection);
//        $.ajax({
//            url:'http://nominatim.openstreetmap.org/reverse?format=json&lat='+lonlat.lat+'&lon='+lonlat.lon+'&accept-language=en-us',
//            type:'get',
//            success:function(data){
////                console.log(data);
//                map_marker.clearMarkers();
//                $("#location").val(data.display_name);
//                var longitude = data.lon;
//                var latitude = data.lat;
//                $("#longitude").val(longitude);
//                $("#latitude").val(latitude);
//                var point_position = new OpenLayers.LonLat(longitude, latitude).transform(new OpenLayers.Projection("EPSG:4326"),map.getProjectionObject());
//                var point_marker = new OpenLayers.Marker(point_position)
//                map_marker.addMarker(point_marker);
//            }
//        })
//    });
////    current_marker = new OpenLayers.Marker(current_position)
////    map_marker.addMarker(current_marker);
//    map.setCenter(current_position,16);
//    vector.removeAllFeatures();
//    var circle = new OpenLayers.Feature.Vector(
//        OpenLayers.Geometry.Polygon.createRegularPolygon(
//            new OpenLayers.Geometry.Point(e.point.x, e.point.y),
//            e.position.coords.accuracy/2,
//            40,
//            0
//        ),
//        {},
//        style
//    );
//    vector.addFeatures([
//        // new OpenLayers.Feature.Vector(
//        //     e.point,
//        //     {},
//        //     {
//        //         graphicName: '',
//        //         strokeColor: '#f00',
//        //         strokeWidth: 2,
//        //         fillOpacity: 0,
//        //         pointRadius: 8,
//        //         title:'2 Reports'
//        //     }
//        // ),
//        circle
//    ]);
//    // if (firstGeolocation) {
//    //     map.zoomToExtent(vector.getDataExtent());
//    //     pulsate(circle);
//    //     firstGeolocation = false;
//    //     this.bind = true;
//    // }
//
//    OpenLayers.Control.Click = OpenLayers.Class(OpenLayers.Control, {
//        defaultHandlerOptions: {
//            'single': true,
//            'double': false,
//            'pixelTolerance': 0,
//            'stopSingle': false,
//            'stopDouble': false
//        },
//
//        initialize: function(options) {
//            this.handlerOptions = OpenLayers.Util.extend(
//                {}, this.defaultHandlerOptions
//            );
//            OpenLayers.Control.prototype.initialize.apply(
//                this, arguments
//            );
//            this.handler = new OpenLayers.Handler.Click(
//                this, {
//                    'click': this.trigger
//                }, this.handlerOptions
//            );
//        },
//
//        trigger: function(e) {
//            var lonlat = map.getLonLatFromPixel(e.xy);
//            alert("You clicked near " + lonlat.lat + " N, " +
//                                      + lonlat.lon + " E");
//        }
//
//    });
//
//});
//geolocate.events.register("locationfailed",this,function() {
//    OpenLayers.Console.log('Location detection failed');
//});