package com.example.brian.sample;

import java.util.ArrayList;
import com.example.brian.sample.Card;
import com.google.gson.annotations.SerializedName;


/**
 * Created by brian on 8/16/15.
 */
public class CardList {
    @SerializedName("Card_list")
    public ArrayList<Card> Card;
}
