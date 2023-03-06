package com.example.worldcupapp;

public class ModelClass {
    private String countryNames,worldCupWins;
    private int imgFlag;

    public ModelClass(String countryNames, String worldCupWins, int imgFlag) {
        this.countryNames = countryNames;
        this.worldCupWins = worldCupWins;
        this.imgFlag = imgFlag;
    }

    public String getCountryNames() {
        return countryNames;
    }

    public void setCountryNames(String countryNames) {
        this.countryNames = countryNames;
    }

    public int getImgFlag() {
        return imgFlag;
    }

    public void setImgFlag(int imgFlag) {
        this.imgFlag = imgFlag;
    }



    public String getWorldCupWins() {
        return worldCupWins;
    }

    public void setWorldCupWins(String worldCupWins) {
        this.worldCupWins = worldCupWins;
    }
}
