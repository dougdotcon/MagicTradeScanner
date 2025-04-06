package com.example.brian.sample;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import android.widget.ListView;

import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

// API KEY
// btsheridan94ATgmailDOTcom-ThuAug2020-29-14UTC2015 -
// http://www.mtgprice.com/api?apiKey=btsheridan94ATgmailDOTcom-ThuAug2020-29-14UTC2015&s=M14



public class MainActivity extends Activity {
        ListView ReceivingListView ;
        ListView TradingListView ;
        ListView SetListView;
        ArrayAdapter<String> ReceivingListAdapter ;
        ArrayAdapter<String> TradingListAdapter ;
        ArrayAdapter<String> SetListAdapter ;
        EditText SearchText;
        TextView cardName;
        TextView cardPrice;
        TextView TradingTotal;
        TextView ReceivingTotal;
        Button TradingAddCard;
        Button ReceivingAddCard;
        Button SearchCard;
        Button clearButton;
        ArrayList<String> ReceivingList;
        ArrayList<String> SetList;
        ArrayList<String> TradingList;
        final Context context = this;
        Dialog dialog;


        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);

            if (android.os.Build.VERSION.SDK_INT > 9) {
                StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
                StrictMode.setThreadPolicy(policy);
            }

            SearchText = (EditText) findViewById(R.id.SearchText);
            SearchCard = (Button) findViewById(R.id.button);
            TradingAddCard = (Button) findViewById(R.id.button2);
            ReceivingAddCard = (Button) findViewById(R.id.button3);
            cardPrice = (TextView) findViewById(R.id.price);
            clearButton = (Button) findViewById(R.id.clear);
            TradingListView = (ListView) findViewById(R.id.listView);
            ReceivingListView = (ListView) findViewById(R.id.listView2);
            cardName = (TextView) findViewById(R.id.textView);
            ReceivingTotal = (TextView) findViewById(R.id.ReceivingTotal);
            TradingTotal = (TextView) findViewById(R.id.TradingTotal);

          /*  String[] Trading = new String[] { "Tasigur",
                    "Goyf",
                    "Bob"
            };

            String[] Receiving = new String[] { "Karn",
                    "Wurmcoil",
                    "Gary"
            };*/

            String[] Trading = new String[] {
            };

            String[] Receiving = new String[] {
            };

            TradingList = new ArrayList<String>();
            ReceivingList = new ArrayList<String>();

            TradingList.addAll(Arrays.asList(Trading));
            ReceivingList.addAll(Arrays.asList(Receiving));

            TradingListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, TradingList);
            ReceivingListAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, ReceivingList);

            TradingListView.setAdapter(TradingListAdapter);
            ReceivingListView.setAdapter(ReceivingListAdapter);


           SearchCard.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {

                   final Dialog dialog = new Dialog(context);
                   dialog.setContentView(R.layout.custom);

                   SetListView = (ListView) dialog.findViewById(R.id.SelectSet);
                   String[] Set = new String[]{"Magic Origins",
                           "Modern Masters 2015",
                           "Dragons of Tarkir",
                           "Fate Reforged",
                           "Commander 2014",
                           "Khans of Tarkir",
                           "M15",
                           "Conspiracy",
                           "Journey Into Nyx",
                           "Born of the Gods",
                           "Commander 2013",
                           "Theros",
                           "M14",
                           "Modern Masters",
                           "Dragons Maze",
                           "Gatecrash",
                           "Commanders Arsenal",
                           "Return to Ravnica",
                           "M13",
                           "Avacyn Restored",
                           "Dark Ascension",
                           "Inistrad",
                           "M12",
                           "Commander"
                   };

                   SetList = new ArrayList<String>();
                   SetList.addAll(Arrays.asList(Set));
                   SetListAdapter = new ArrayAdapter<String>(context, android.R.layout.simple_list_item_1, SetList);
                   SetListView.setAdapter(SetListAdapter);

                   dialog.setCancelable(true);
                   dialog.setTitle("Please Select the Set");

                   SetListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                       @Override
                       public void onItemClick(AdapterView<?> parent, View view,
                                               int position, long id) {

                           int itemPosition = position;
                           String itemValue = (String) SetListView.getItemAtPosition(position);

                           String apiKey = "btsheridan94ATgmailDOTcom-ThuAug2020-29-14UTC2015";
                           String SetURL = itemValue.replace(" ", "_");
                           //cardName.setText(SetURL);

                           String sURL = "http://www.mtgprice.com/api?apiKey=" + apiKey + "&s=" + SetURL;

                           URL url = null;
                           try {
                               url = new URL(sURL);
                           } catch (MalformedURLException e) {
                               e.printStackTrace();
                           }


                           JsonElement root = null;
                           JsonParser jp = new JsonParser();
                           try {
                               HttpURLConnection request = (HttpURLConnection) url.openConnection();
                               request.connect();
                               root = jp.parse(new InputStreamReader((InputStream) request.getContent()));
                           } catch (IOException e) {
                               e.printStackTrace();
                           }


                           JsonObject rootobj = root.getAsJsonObject();
                           JsonArray rootArray = rootobj.get("cards").getAsJsonArray();


                           for (int i = 0; i < rootArray.size(); i++) {
                               JsonElement cardData = rootArray.get(i);
                               String name = cardData.getAsJsonObject().get("name").getAsString();
                               String price = cardData.getAsJsonObject().get("fairPrice").getAsString();
                               if ((SearchText.getText().toString()).equals(name)) {
                                   cardName.setText(name);
                                   cardPrice.setText(price);
                               }
                           }


                           dialog.dismiss();
                       }

                   });
                   dialog.show();

               }
           });

            TradingAddCard.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    TradingList.add(cardName.getText().toString() + " " + cardPrice.getText().toString());
                    TradingListAdapter.notifyDataSetChanged();
                    double sum = Double.parseDouble((TradingTotal.getText().toString()).replace("Total: $", ""));
                    sum = sum + Double.parseDouble((cardPrice.getText().toString()).replace("$", ""));
                    DecimalFormat df = new DecimalFormat("#.##");
                    sum = Double.valueOf(df.format(sum));
                    TradingTotal.setText("Total: $" + sum);
                    Toast.makeText(getApplicationContext(),
                            cardName.getText().toString()+" added to Trading list", Toast.LENGTH_LONG)
                            .show();
                }
            });

            ReceivingAddCard.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    ReceivingList.add(cardName.getText().toString() + " " +  cardPrice.getText().toString());
                    ReceivingListAdapter.notifyDataSetChanged();
                    double sum = Double.parseDouble((ReceivingTotal.getText().toString()).replace("Total: $", ""));
                    sum = sum + Double.parseDouble((cardPrice.getText().toString()).replace("$", ""));
                    DecimalFormat df = new DecimalFormat("#.##");
                    sum = Double.valueOf(df.format(sum));
                    ReceivingTotal.setText("Total: $" + sum);
                    Toast.makeText(getApplicationContext(),
                            cardName.getText().toString() + " added to Receiving list", Toast.LENGTH_LONG)
                            .show();
                }
            });

            clearButton.setOnClickListener(new View.OnClickListener() {

                public void onClick(View v) {
                    TradingListAdapter.clear();
                    TradingListAdapter.notifyDataSetChanged();
                    ReceivingListAdapter.clear();
                    ReceivingListAdapter.notifyDataSetChanged();
                    TradingTotal.setText("Total: $0.00");
                    ReceivingTotal.setText("Total: $0.00");
                    Toast.makeText(getApplicationContext(),
                            "Lists have been cleared", Toast.LENGTH_LONG)
                            .show();
                }
            });

            TradingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        final int position, long id) {
                    int itemPosition = position;
                    /*tring itemValue = (String) TradingListView.getItemAtPosition(position);
                    Toast.makeText(getApplicationContext(),
                            "Position :" + itemPosition + " ListItem : " + itemValue, Toast.LENGTH_LONG)
                            .show();*/


                    AlertDialog.Builder builder = new AlertDialog.Builder(context);

                    builder.setTitle("Remove Card?");
                    builder.setMessage("Are you sure?");

                    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // Do nothing but close the dialog
                            double sum = Double.parseDouble((TradingTotal.getText().toString()).replace("Total: $", ""));
                            sum = sum - Double.parseDouble((TradingList.get(position)).substring(((TradingList.get(position)).indexOf("$")) + 1));
                            //sum = Math.round(sum,2);
                            DecimalFormat df = new DecimalFormat("#.##");
                            sum = Double.valueOf(df.format(sum));
                            if (sum < 0.0) {
                                sum = 0.00;
                            }
                            TradingTotal.setText("Total: $" + sum);
                            TradingListAdapter.remove(TradingList.get(position));
                            TradingListAdapter.notifyDataSetChanged();

                            dialog.dismiss();
                        }

                    });

                    builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Do nothing
                            dialog.dismiss();
                        }
                    });

                    AlertDialog alert = builder.create();
                    alert.show();

                }

            });


            ReceivingListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                @Override
                public void onItemClick(AdapterView<?> parent, View view,
                                        final int position, long id) {
                    int itemPosition = position;
                    /*tring itemValue = (String) TradingListView.getItemAtPosition(position);
                    Toast.makeText(getApplicationContext(),
                            "Position :" + itemPosition + " ListItem : " + itemValue, Toast.LENGTH_LONG)
                            .show();*/


                    AlertDialog.Builder builder = new AlertDialog.Builder(context);

                    builder.setTitle("Remove Card?");
                    builder.setMessage("Are you sure?");

                    builder.setPositiveButton("YES", new DialogInterface.OnClickListener() {

                        public void onClick(DialogInterface dialog, int which) {
                            // Do nothing but close the dialog
                            double sum = Double.parseDouble((ReceivingTotal.getText().toString()).replace("Total: $", ""));
                            sum = sum - Double.parseDouble((ReceivingList.get(position)).substring(((ReceivingList.get(position)).indexOf("$")) + 1));
                            DecimalFormat df = new DecimalFormat("#.##");
                            sum = Double.valueOf(df.format(sum));
                            if (sum < 0.0) {
                                sum = 0.00;
                            }
                            ReceivingTotal.setText("Total: $" + sum);
                            ReceivingListAdapter.remove(ReceivingList.get(position));
                            ReceivingListAdapter.notifyDataSetChanged();

                            dialog.dismiss();
                        }

                    });

                    builder.setNegativeButton("NO", new DialogInterface.OnClickListener() {

                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            // Do nothing
                            dialog.dismiss();
                        }
                    });

                    AlertDialog alert = builder.create();
                    alert.show();

                }

            });




        }

    }