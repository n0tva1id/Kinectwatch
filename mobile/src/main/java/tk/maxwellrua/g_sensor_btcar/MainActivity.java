package tk.maxwellrua.g_sensor_btcar;

import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothSocket;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.bluetooth.BluetoothAdapter;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.IOException;
import java.io.OutputStream;
import java.util.UUID;


public class MainActivity extends AppCompatActivity {
    private static final boolean D = true;
    private static final String TAG = "Maxwellrua";
    private BluetoothAdapter mBluetoothAdapter = null;

    private BluetoothSocket btSocket = null;

    private OutputStream outStream = null;
    Button mButtonF;
    Button mButtonB;
    Button mButtonL;
    Button mButtonR;
    Button mButtonS;

    private static final UUID MY_UUID = UUID.fromString("00001101-0000-1000-8000-00805F9B34FB");


    private static String address = "00:7F:00:1B:49:19"; // <==要连接的蓝牙设备MAC地址



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//前进
        mButtonF=(Button)findViewById(R.id.btnF);
        mButtonF.setOnTouchListener(new Button.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
// TODO Auto-generated method stub
                String message;
                byte[] msgBuffer;
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "1";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "0";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;
                }
                return false;
            }


        });
//后退
        mButtonB=(Button)findViewById(R.id.btnB);
        mButtonB.setOnTouchListener(new Button.OnTouchListener(){


            @Override
            public boolean onTouch(View v, MotionEvent event) {
// TODO Auto-generated method stub
                String message;
                byte[] msgBuffer;
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "3";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "0";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;
                }

                return false;
            }


        });
//左转
        mButtonL=(Button)findViewById(R.id.btnL);
        mButtonL.setOnTouchListener(new Button.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
// TODO Auto-generated method stub
                String message;
                byte[] msgBuffer;
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "2";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "0";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;
                }

                return false;

            }
        });
//右转
        mButtonR=(Button)findViewById(R.id.btnR);
        mButtonR.setOnTouchListener(new Button.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
// TODO Auto-generated method stub
                String message;
                byte[] msgBuffer;
                int action = event.getAction();
                switch(action)
                {
                    case MotionEvent.ACTION_DOWN:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "4";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;

                    case MotionEvent.ACTION_UP:
                        try {
                            outStream = btSocket.getOutputStream();

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                        }


                        message = "0";

                        msgBuffer = message.getBytes();

                        try {
                            outStream.write(msgBuffer);

                        } catch (IOException e) {
                            Log.e(TAG, "ON RESUME: Exception during write.", e);
                        }
                        break;
                }

                return false;

            }


        });

//停止
        mButtonS=(Button)findViewById(R.id.btnS);
        mButtonS.setOnTouchListener(new Button.OnTouchListener(){

            @Override
            public boolean onTouch(View v, MotionEvent event) {
// TODO Auto-generated method stub
                if(event.getAction()==MotionEvent.ACTION_DOWN)
                    try {
                        outStream = btSocket.getOutputStream();

                    } catch (IOException e) {
                        Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
                    }


                String message = "0";

                byte[] msgBuffer = message.getBytes();

                try {
                    outStream.write(msgBuffer);

                } catch (IOException e) {
                    Log.e(TAG, "ON RESUME: Exception during write.", e);
                }
                return false;
            }


        });

        if (D)
            Log.e(TAG, "+++ ON CREATE +++");
        mBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();

        if (mBluetoothAdapter == null) {
            Toast.makeText(this, "Bluetooth is not available.", Toast.LENGTH_LONG).show();
            finish();
            return;
        }


        if (!mBluetoothAdapter.isEnabled()) {
            Toast.makeText(this, "Please enable your Bluetooth and re-run this program.", Toast.LENGTH_LONG).show();
            finish();
            return;

        }


        if (D)
            Log.e(TAG, "+++ DONE IN ON CREATE, GOT LOCAL BT ADAPTER +++");


    }
    @Override

    public void onStart() {

        super.onStart();

        if (D) Log.e(TAG, "++ ON START ++");
    }


    @Override

    public void onResume() {

        super.onResume();
        if (D) {
            Log.e(TAG, "+ ON RESUME +");
            Log.e(TAG, "+ ABOUT TO ATTEMPT CLIENT CONNECT +");

        }

        BluetoothDevice device = mBluetoothAdapter.getRemoteDevice(address);

        try {

            btSocket = device.createRfcommSocketToServiceRecord(MY_UUID);

        } catch (IOException e) {

            Log.e(TAG, "ON RESUME: Socket creation failed.", e);

        }
        mBluetoothAdapter.cancelDiscovery();
        try {

            btSocket.connect();

            Log.e(TAG, "ON RESUME: BT connection established, data transfer link open.");

        } catch (IOException e) {

            try {
                btSocket.close();

            } catch (IOException e2) {

                Log .e(TAG,"ON RESUME: Unable to close socket during connection failure", e2);
            }

        }


// Create a data stream so we can talk to server.

        if (D)
            Log.e(TAG, "+ ABOUT TO SAY SOMETHING TO SERVER +");
/* try {
outStream = btSocket.getOutputStream();

} catch (IOException e) {
Log.e(TAG, "ON RESUME: Output stream creation failed.", e);
}


String message = "1";

byte[] msgBuffer = message.getBytes();

try {
outStream.write(msgBuffer);

} catch (IOException e) {
Log.e(TAG, "ON RESUME: Exception during write.", e);
}
*/

    }


    @Override

    public void onPause() {

        super.onPause();


        if (D)
            Log.e(TAG, "- ON PAUSE -");
        if (outStream != null) {
            try {
                outStream.flush();
            } catch (IOException e) {
                Log.e(TAG, "ON PAUSE: Couldn't flush output stream.", e);
            }

        }


        try {
            btSocket.close();
        } catch (IOException e2) {
            Log.e(TAG, "ON PAUSE: Unable to close socket.", e2);
        }

    }


    @Override

    public void onStop() {

        super.onStop();

        if (D)Log.e(TAG, "-- ON STOP --");

    }


    @Override

    public void onDestroy() {

        super.onDestroy();

        if (D) Log.e(TAG, "--- ON DESTROY ---");

    }
}

