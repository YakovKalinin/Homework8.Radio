package ru.netology;

public class Radio {
    private int radioStation;
    private int currentVolume;
    private int numberOfRadioStationsInfo = 10;
    private int maxRadioStation = numberOfRadioStationsInfo - 1;

    public Radio(int numberOfRadioStationsInfo) {
        this.numberOfRadioStationsInfo = numberOfRadioStationsInfo;
    }

    public Radio(int radioStation, int currentVolume, int numberOfRadioStationsInfo) {
        this.radioStation = radioStation;
        this.currentVolume = currentVolume;
        this.numberOfRadioStationsInfo = numberOfRadioStationsInfo;
    }

    public Radio() {
    }

    public Radio(int radioStation, int currentVolume) {
        this.radioStation = radioStation;
        this.currentVolume = currentVolume;
    }

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > maxRadioStation) {
            return;
        }
        return;
    }

    public void setNextRadioStation() {
        radioStation++;
        if (radioStation > maxRadioStation) {
            radioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        radioStation--;
        if (radioStation < 0) {
            radioStation = maxRadioStation;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 99) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void setIncreaseVolume() {

        if (currentVolume < 98) {
            currentVolume++;
        }
        return;
    }

    public void setDecreaseVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        }
        return;
    }

    public int getNumberOfRadioStationsInfo() {
        return numberOfRadioStationsInfo;
    }

    public void setNumberOfRadioStationsInfo(int numberOfRadioStationsInfo) {
        if (numberOfRadioStationsInfo < 0) {
            return;
        }
        if (numberOfRadioStationsInfo > 999) {
            return;
        }
        this.numberOfRadioStationsInfo = numberOfRadioStationsInfo;
    }
}


