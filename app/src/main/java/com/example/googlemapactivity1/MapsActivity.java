package com.example.googlemapactivity1;

import androidx.fragment.app.FragmentActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolylineOptions;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        //Riego Rovelyn
        LatLng StoTomas = new LatLng(15.870465,120.571128);
        mMap.addMarker(new MarkerOptions().position(StoTomas).title("Santo Tomas"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(StoTomas));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.870465,120.571128),
                        new LatLng(15.86670, 120.56658),
                        new LatLng(15.87265, 120.56966),
                        new LatLng(15.87298, 120.57172),
                        new LatLng(15.87974, 120.58693),
                        new LatLng(15.88733, 120.59688),
                        new LatLng(15.89691, 120.59070),
                        new LatLng(15.91177, 120.58349),
                        new LatLng(15.92134, 120.58178),
                        new LatLng(15.928276435901243, 120.58006093884173),
                        new LatLng(15.937850302658529, 120.58109090703617),
                        new LatLng(15.946763492097253, 120.5804042615732),
                        new LatLng(15.962608183854806, 120.57319448421217),
                        new LatLng(15.962938268277002, 120.56598470685114),
                        new LatLng(15.961287840726692, 120.5574016385642),
                        new LatLng(15.960957753584882, 120.55705831583273),
                        new LatLng(15.971850342028898, 120.55499837944386),
                        new LatLng(15.983670608100802, 120.5555133558256),
                        new LatLng(15.984000657791798, 120.5563716626543),
                        new LatLng(15.981855324872255, 120.56014821286875),
                        new LatLng(15.980535108682686, 120.56057736628307))
                .width(10)
                .color(Color.BLUE));

        //Raymond Pablo
        LatLng Nancalobasan = new LatLng(16.001862052804643, 120.61098819895534);
        mMap.addMarker(new MarkerOptions().position(Nancalobasan).title("Nancalobasan"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Nancalobasan));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.001862052804643, 120.61098819895534),
                        new LatLng(16.001903305327424, 120.61081653815452),
                        new LatLng(16.001862052840366, 120.61068779213022),
                        new LatLng(16.001841426593625, 120.61012989269159),
                        new LatLng(16.00188267908496, 120.60946470489934),
                        new LatLng(16.001655790277248, 120.60822015999774),
                        new LatLng(16.00163516400922, 120.60727602248616),
                        new LatLng(16.00138764862685, 120.6064606309989),
                        new LatLng(16.00144952750119, 120.60622459662102),
                        new LatLng(16.001655790277248, 120.60560232417022),
                        new LatLng(16.00144952750119, 120.60530191678019),
                        new LatLng(16.00163516400922, 120.6045938136465),
                        new LatLng(16.00171766906855, 120.60401445653712),
                        new LatLng(16.00969987238824, 120.60146099315682),


                        new LatLng(16.007224804694687, 120.59888607267074),
                        new LatLng(15.999139369826148, 120.59201961804119),
                        new LatLng(15.987588181082147, 120.58189159746262),
                        new LatLng(15.982076042007927, 120.57924189265255),
                        new LatLng(15.981745989141453, 120.57615198806924),

                        new LatLng(15.979435603829888, 120.5727187607545),
                        new LatLng(15.97894051779212, 120.5687705493425),
                        new LatLng(15.979105546607528, 120.56533732202769),
                        new LatLng(15.981580962504049, 120.56035914242126),
                        new LatLng(15.981745989141453, 120.57615198806924),

                        new LatLng(15.980535108682686, 120.56057736628307))
                .width(10)
                .color(Color.BLUE));
//Pacetes Kristan Pauk
        LatLng SanManuel = new LatLng(16.082435464544428, 120.68073157793239);
        mMap.addMarker(new MarkerOptions().position(SanManuel).title("San Manuel"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(SanManuel));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(16.082435464544428, 120.68073157793239),
                        new LatLng(16.07418813069389, 120.67798499608055),
                        new LatLng(16.08061493338292, 120.68069498210411),
                        new LatLng(16.079460316667394, 120.67919294515393),
                        new LatLng(16.077357247559565, 120.67842046900809),
                        new LatLng(16.06667661209049, 120.67537347976621),
                        new LatLng(16.065645631438024, 120.67133943453133),
                        new LatLng(16.063583655965385, 120.67176858794568),
                        new LatLng(16.063583655968603, 120.66885034472811),
                        new LatLng(16.060944296183962, 120.66850702199665),
                        new LatLng(16.05929467854278, 120.6686786833624),
                        new LatLng(16.00501464090622, 120.66919366593442),

                        new LatLng(16.00435461037063, 120.66679040681409),
                        new LatLng(16.052531103284966, 120.66816369926515),
                        new LatLng(16.045932271870804, 120.667477053802227),
                        new LatLng(16.039663179555106, 120.66713373107073),
                        new LatLng(16.008314760868405, 120.66850702047148),
                        new LatLng(16.001384445409087, 120.6582073347143),


                        new LatLng(15.995774014414584, 120.6492809436959),
                        new LatLng(15.981252167692748, 120.62662164341837),
                        new LatLng(15.977951600934372, 120.61048547503891),
                        new LatLng(15.977951600934372, 120.60190240675198),
                        new LatLng(15.976631358986953, 120.57546655642821),
                        new LatLng(15.976301297139152, 120.57271997457637),
                        new LatLng(15.976301297139152, 120.5696300699931),
                        new LatLng(15.9782003382142, 120.57066003818751))


                .width(10)
                .color(Color.BLUE));
        //Saura John Michael
        LatLng Matulong = new LatLng(15.991995230709788, 120.49144335638519);
        mMap.addMarker(new MarkerOptions().position(Matulong).title("Matulong"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(Matulong));

        mMap.addPolyline(new PolylineOptions()
                .add(new LatLng(15.991995230709788, 120.49144335638519),
                        new LatLng(15.991417666483317, 120.49110003365371),
                        new LatLng(15.990180023236748, 120.49238749389677),
                        new LatLng(15.98621951336834, 120.49513407574858),
                        new LatLng(15.982258925068473, 120.49616404394301),
                        new LatLng(15.979618489304103, 120.49719401213744),
                        new LatLng(15.977968199256056, 120.49753733486891),
                        new LatLng(15.977968199256056, 120.50440378949847),
                        new LatLng(15.980938711542311, 120.51539011690573),
                        new LatLng(15.982588977088678, 120.52088328060938),
                        new LatLng(15.98357912988196, 120.5236298624612),
                        new LatLng(15.98159881939444, 120.53324289894259),
                        new LatLng(15.980278601512179, 120.53633280352587),
                        new LatLng(15.977968199256056, 120.54010935357213),
                        new LatLng(15.974667578455195, 120.55478640261937))


                .width(10)
                .color(Color.BLUE));










        LatLng urdaneta = new LatLng(15.980535108682686, 120.56057736628307);
        mMap.addMarker(new MarkerOptions().position(urdaneta).title("Marker in Urdaneta City"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(urdaneta));







    }
}
