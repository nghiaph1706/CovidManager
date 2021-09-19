package modelTmp;



import com.teamdev.jxmaps.swing.MapView;
import javax.swing.JFrame;
import com.teamdev.jxmaps.*;
import java.awt.BorderLayout;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Admin
 */
public class truyvanmap extends MapView {

    private Map ap;

    public truyvanmap(String name) {
        JFrame frame = new JFrame(name);
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus ms) {
                if (ms == MapStatus.MAP_STATUS_OK) {
                    ap = (Map) getMap();
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions control = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(control);
                    ap.setOptions(mapOptions);
                    ap.setCenter(new LatLng(10.793953239142011, 106.62808464608757));
                    ap.setZoom(11.0);
                }
            }
        });
        frame.add(this,BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
            truyvanmap ten = new truyvanmap("Bản đồ số khu vực nhiễm");
    }
}
