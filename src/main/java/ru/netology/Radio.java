package ru.netology;

public class Radio {
    private int radioStation;
    private int currentVolume;

    public int getRadioStation() {
        return radioStation;
    }

    public void setRadioStation(int radioStation) {
        if (radioStation < 0) {
            return;
        }
        if (radioStation > 9) {
            return;
        }
        this.radioStation = radioStation;
    }
    public void setNextRadioStation () {
        radioStation++;
        if (radioStation > 9) {
            radioStation = 0;
        }
    }
    public void setPrevRadioStation () {
        radioStation--;
        if (radioStation < 0) {
            radioStation = 9;
        }
    }
    public int getCurrentVolume() {
        return currentVolume;
    }
    public void setCurrentVolume(int currentVolume) {
        this.currentVolume = currentVolume;
    }
    public void setIncreaseVolume() {
        if (currentVolume < 10) {
            currentVolume++;
        }
    }
    public void setDecreaseVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        }
    }
}


