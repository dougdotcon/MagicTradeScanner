package com.example.brian.sample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by brian on 8/15/15.
 */
public class Card {
    @SerializedName("layout")
    private String layout;
    @SerializedName("name")
    private String name;
    @SerializedName("names")
    private String names;
    @SerializedName("manaCost")
    private String manaCost;
    @SerializedName("cmc")
    private String cmc;
    @SerializedName("colors")
    private String colors;
    @SerializedName("type")
    private String type;
    @SerializedName("supertypes")
    private String supertypes;
    @SerializedName("types")
    private String types;
    @SerializedName("subtypes")
    private String subtypes;
    @SerializedName("rarity")
    private String rarity;
    @SerializedName("text")
    private String text;
    @SerializedName("flavor")
    private String flavor;
    @SerializedName("artist")
    private String artist;
    @SerializedName("number")
    private String number;
    @SerializedName("power")
    private String power;
    @SerializedName("toughness")
    private String toughness;
    @SerializedName("loyalty")
    private String loyalty;
    @SerializedName("multiverseid")
    private String multiverseid;
    @SerializedName("variations")
    private String variations;
    @SerializedName("imageName")
    private String imageName;
    @SerializedName("watermark")
    private String watermark;
    @SerializedName("border")
    private String border;
    @SerializedName("timeshifted")
    private String timeshifted;
    @SerializedName("hand")
    private String hand;
    @SerializedName("reserved")
    private String reserved;
    @SerializedName("releaseDate")
    private String releaseDate;
    @SerializedName("starter")
    private String starter;


    public Card(String layout, String name, String names, String manaCost, String cmc, String colors, String type, String types, String supertypes, String subtypes, String rarity, String text, String flavor, String artist, String number, String power, String toughness, String loyalty, String multieverseid, String variations, String imageName, String watermark, String border, String timeshifted, String hand, String reserved, String releaseDate, String starter) {
        this.layout=layout;
        this.name=name;
        this.names=names;
        this.manaCost=manaCost;
        this.cmc=cmc;
        this.colors=colors;
        this.type=type;
        this.types=types;
        this.supertypes=supertypes;
        this.subtypes=subtypes;
        this.rarity=rarity;
        this.text=text;
        this.flavor=flavor;
        this.artist=artist;
        this.number=number;
        this.power=power;
        this.toughness=toughness;
        this.loyalty=loyalty;
        this.multiverseid=multiverseid;
        this.variations=variations;
        this.imageName=imageName;
        this.watermark=watermark;
        this.border=border;
        this.timeshifted=timeshifted;
        this.hand=hand;
        this.reserved=reserved;
        this.releaseDate=releaseDate;
        this.starter=starter;
    }

    public String getLayout() {
        return layout;
    }

    public void setLayout(String layout) {
        this.layout = layout;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    public String getNames() {
        return names;
    }

    public void setNames(String names) {
        this.names = names;
    }

    public String getManaCost() {
        return manaCost;
    }

    public void setManaCost(String manaCost) {
        this.manaCost = manaCost;
    }

    public String getCmc() {
        return cmc;
    }

    public void setCmc(String cmc) {
        this.cmc = cmc;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTypes() {
        return types;
    }

    public void setTypes(String types) {
        this.types = types;
    }

    public String getSupertypes() {
        return supertypes;
    }

    public void setSupertypes(String supertypes) {
        this.supertypes = supertypes;
    }

    public String getSubtypes() {
        return subtypes;
    }

    public void setSubtypes(String subtypes) {
        this.subtypes = subtypes;
    }

    public String getRarity() {
        return rarity;
    }

    public void setRarity(String rarity) {
        this.rarity = rarity;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getToughness() {
        return toughness;
    }

    public void setToughness(String toughness) {
        this.toughness = toughness;
    }

    public String getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(String loyalty) {
        this.loyalty = loyalty;
    }

    public String getmMultiverseid() {
        return multiverseid;

    }

    public void setMultiverseid(String multiverseid) {
        this.multiverseid = multiverseid;
    }

    public String getVariations() {
        return variations;
    }

    public void setVariations(String variations) {
        this.variations = variations;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public String getWatermark() {
        return watermark;
    }

    public void setWatermark(String watermark) {
        this.watermark = watermark;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public String getTimeshifted() {
        return timeshifted;
    }

    public void setTimeshifted(String timeshifted) {
        this.timeshifted = timeshifted;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getStarter() {
        return starter;
    }

    public void setStarter(String starter) {
        this.starter = starter;
    }

}



