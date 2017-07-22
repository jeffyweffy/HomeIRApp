package com.example.jeffhawker.homeirapp;

import android.app.Activity;
import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import org.json.JSONArray;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button tvPower = (Button) findViewById(R.id.tvPower); // Retrieve the button from the XML file
        tvPower.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVPower();
            }
        });

        Button sonyPowerButton = (Button) findViewById(R.id.sonyPowerButton); // Retrieve the button from the XML file
        sonyPowerButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateSonyPower();
            }
        });

        Button tvVolumeUpButton = (Button) findViewById(R.id.tvVolumeUpButton); // Retrieve the button from the XML file
        tvVolumeUpButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVVolumeUp();
            }
        });

        Button tvVolumeDownButton = (Button) findViewById(R.id.tvVolumeDownButton); // Retrieve the button from the XML file
        tvVolumeDownButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVVolumeDown();
            }
        });

        Button tvChannelUpButton = (Button) findViewById(R.id.tvChannelUpButton); // Retrieve the button from the XML file
        tvChannelUpButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVChannelUp();
            }
        });

        Button tvChannelDownButton = (Button) findViewById(R.id.tvChannelDownButton); // Retrieve the button from the XML file
        tvChannelDownButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVChannelDown();
            }
        });

        Button funKidsRadioButton = (Button) findViewById(R.id.funKidsRadioButton); // Retrieve the button from the XML file
        funKidsRadioButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateFunKidsRadio();
            }
        });

        Button classicRadioButton = (Button) findViewById(R.id.classicRadioButton); // Retrieve the button from the XML file
        classicRadioButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateClassicalRadio();
            }
        });

        Button astraHitsRadioButton = (Button) findViewById(R.id.astraHitsRadioButton); // Retrieve the button from the XML file
        astraHitsRadioButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateAstraHitsRadio();
            }
        });


        Button sonyVolumeUpButton = (Button) findViewById(R.id.sonyVolumeUpButton); // Retrieve the button from the XML file
        sonyVolumeUpButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateSonyVolumeUp();
            }
        });

        Button sonyVolumeDownButton = (Button) findViewById(R.id.sonyVolumeDownButton); // Retrieve the button from the XML file
        sonyVolumeDownButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateSonyVolumeDown();
            }
        });

        Button appleTVPlayPauseButton = (Button) findViewById(R.id.appleTVPlayPauseButton); // Retrieve the button from the XML file
        appleTVPlayPauseButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateAppleTVPlayPause();
            }
        });

        Button tvChangeLanguageButton = (Button) findViewById(R.id.tvChangeLanguageButton); // Retrieve the button from the XML file
        tvChangeLanguageButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVLanguageChange();
            }
        });

        Button tvRecordingListTVButton = (Button) findViewById(R.id.tvRecordingListTVButton); // Retrieve the button from the XML file
        tvRecordingListTVButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVRecodingList();
            }
        });

        Button tvUpButton = (Button) findViewById(R.id.tvUpButton); // Retrieve the button from the XML file
        tvUpButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVUp();
            }
        });

        Button tvDownButton = (Button) findViewById(R.id.tvDownButton); // Retrieve the button from the XML file
        tvDownButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVDown();
            }
        });

        Button tvLeftButton = (Button) findViewById(R.id.tvLeftButton); // Retrieve the button from the XML file
        tvLeftButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVLeft();
            }
        });

        Button tvRightButton = (Button) findViewById(R.id.tvRightButton); // Retrieve the button from the XML file
        tvRightButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVRight();
            }
        });

        Button tvSelectButton = (Button) findViewById(R.id.tvSelectButton); // Retrieve the button from the XML file
        tvSelectButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVSelect();
            }
        });

        Button tvBackButton = (Button) findViewById(R.id.tvBackButton); // Retrieve the button from the XML file
        tvBackButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVBack();
            }
        });

        Button tvYellowButton = (Button) findViewById(R.id.tvYellowButton); // Retrieve the button from the XML file
        tvYellowButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVYellow();
            }
        });

        Button tvChangeInputButton = (Button) findViewById(R.id.tvChangeInputButton); // Retrieve the button from the XML file
        tvChangeInputButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateTVChangeInput();
            }
        });

        Button kodiPlayPauseButton = (Button) findViewById(R.id.kodiPlayPauseButton); // Retrieve the button from the XML file
        kodiPlayPauseButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activatekodiPlayPause();
            }
        });

        Button airconPowerOnButton = (Button) findViewById(R.id.airconPowerOnButton); // Retrieve the button from the XML file
        airconPowerOnButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateAirconPowerOn();
            }
        });

        Button airconPowerOffButton = (Button) findViewById(R.id.airconPowerOffButton); // Retrieve the button from the XML file
        airconPowerOffButton.setOnClickListener(new View.OnClickListener() {  //Add a listener for when the button is pressed
            @Override
            public void onClick(View v) {
                activateAirconPowerOff();
            }
        });

        //imageViewOffline set visible if true when no wifi
        WifiManager wifiman = (WifiManager) getSystemService (Context.WIFI_SERVICE);
        if (wifiman.getConnectionInfo().getNetworkId() == -1)
        {
            ImageView imageViewOffline = (ImageView) findViewById(R.id.imageViewOffline);
            imageViewOffline.setVisibility(View.VISIBLE);
        }

    }

    private void activateTVPower() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107:8080/redeye/rooms/0/devices/61/commands/send?commandId=58");
    }

    private void activateSonyPower() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuDuYx6z%201");
    }

    private void activateTVVolumeUp() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuVKOgma%201");
    }

    private void activateTVUp() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuzFfznI%201");
    }

    private void activateTVDown() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captum2gBN2%201");
    }

    private void activateTVLeft() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuieJb1P%201");
    }

    private void activateTVRight() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuN3kmQi%201");
    }

    private void activateTVSelect() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captu1RsX1Q%201");
    }

    private void activateSonyVolumeUp() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1253-99999-42.isi%201");
    }

    private void activateSonyVolumeDown() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1253-99999-43.isi%201");
    }

    private void activateTVVolumeDown() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptutajrGv%201");
    }

    private void activateTVChannelUp() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuS4n9lx%201");
    }

    private void activateTVChannelDown() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuKNk7qU%201");
    }

    private void activateTVLanguageChange() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuzR5tEf%201");
    }

    private void activateTVRecodingList() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captuul85Jc%201");
    }

    private void activateTVBack() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captux0KmgZ%201");
    }

    private void activateTVChangeInput() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captum7FztG%201");
    }

    private void activateAppleTVDown() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1088-99999-04.isi%201");
    }

    private void activateAppleTVMenu() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1088-99999-01.isi%201");
    }

    private void activateAppleTVRight() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1088-99999-06.isi%201");
    }

    private void activateAppleTVSelect() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1088-99999-02.isi%201");
    }

    private void activateAppleTVUp() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/1088-99999-03.isi%201");
    }

    private void activateAppleTVPlayPause() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captumu962a%201");
    }

    private void activateAppleTVLongMenu() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captu2Kzue3%201");
    }

    private void activateTVYellow() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuViqwXw%201");
    }

    private void activatekodiPlayPause() {
        CatalogClient client = new CatalogClient();

        //Scripting.SendHttpMessage("/jsonrpc?request=%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Player.PlayPause%22%2C%20%22params%22%3A%20%7B%20%22playerid%22%3A%200%20%7D%2C%20%22id%22%3A%201%7D")
        //<a href="http://10.0.1.103:8080/jsonrpc?request=%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Player.PlayPause%22%2C%20%22params%22%3A%20%7B%20%22playerid%22%3A%200%20%7D%2C%20%22id%22%3A%201%7D">
        //        10.0.1.101:8041


        client.execute("http://10.0.1.101:8041/jsonrpc?request=%7B%22jsonrpc%22%3A%20%222.0%22%2C%20%22method%22%3A%20%22Player.PlayPause%22%2C%20%22params%22%3A%20%7B%20%22playerid%22%3A%201%20%7D%2C%20%22id%22%3A%201%7D");
    }

    private void activateAirconPowerOn() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuGvH07N%201");

        // OFF http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuJwo1DS%201
        // ON http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/Captu8kAixi%201
    }

    private void activateAirconPowerOff() {
        CatalogClient client = new CatalogClient();
        client.execute("http://10.0.1.107/cgi-bin/play_iph.sh?/devicedata/CaptuJGz48b%201");

    }

    private void activateFunKidsRadio() {

        activateAppleTVLongMenu();
        activateAppleTVMenu();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVDown();
        activateAppleTVDown();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateSonyPower();

    }

    private void activateClassicalRadio() {
        activateAppleTVLongMenu();
        activateAppleTVMenu();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVDown();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateSonyPower();
    }

    private void activateAstraHitsRadio() {
        activateAppleTVLongMenu();
        activateAppleTVMenu();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVUp();
        activateAppleTVDown();
        activateAppleTVSelect();
        activateSonyPower();
    }

/*
    protected void playAbsolute00s() {
        String url = "http://stream.timlradio.co.uk/ABSOLUTE00SIRMP3?ats=1"; // You could have this at the top of the class as a constant, or pass it in as a method variable, if you wish to send to multiple websites
        Intent i = new Intent(Intent.ACTION_VIEW); // Create a new intent - stating you want to 'view something'
        i.setData(Uri.parse(url));  // Add the url data (allowing android to realise you want to open the browser)
        startActivity(i); // Go go go!
    }
*/



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    public class CatalogClient extends AsyncTask<String, String, JSONArray> {

        @Override
        protected JSONArray doInBackground(String... params) {
            URL url;
            HttpURLConnection urlConnection = null;
            JSONArray response = new JSONArray();

            try {
                url = new URL(params[0]);
                urlConnection = (HttpURLConnection) url.openConnection();
                int responseCode = urlConnection.getResponseCode();

                if(responseCode == 200){
                    String responseString = readStream(urlConnection.getInputStream());
                    Log.v("CatalogClient", responseString);
                    response = new JSONArray(responseString);
                }else{
                    Log.v("CatalogClient", "Response code:"+ responseCode);
                }

            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if(urlConnection != null)
                    urlConnection.disconnect();
            }

            return response;
        }

        private String readStream(InputStream in) {
            BufferedReader reader = null;
            StringBuffer response = new StringBuffer();
            try {
                reader = new BufferedReader(new InputStreamReader(in));
                String line = "";
                while ((line = reader.readLine()) != null) {
                    response.append(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                if (reader != null) {
                    try {
                        reader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return response.toString();
        }
    }



}


