package ru.netology;

public class Radio {
    private int radioStation;
    private int currentVolume;
    private int numberOfRadioStationsInfo = 10;

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

    public void setRadioStation() {
        if (radioStation < 0) {
            radioStation = 0;
        }
        if (radioStation > numberOfRadioStationsInfo - 1) {
            radioStation = numberOfRadioStationsInfo - 1;
        }
        return;
    }

    public void setNextRadioStation() {
        radioStation++;
        if (radioStation > numberOfRadioStationsInfo - 1) {
            radioStation = 0;
        }
    }

    public void setPrevRadioStation() {
        radioStation--;
        if (radioStation < 0) {
            radioStation = numberOfRadioStationsInfo - 1;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int setCurrentVolume() {
        this.currentVolume = currentVolume;
        return currentVolume;
    }

    public void setIncreaseVolume() {
        if (currentVolume < numberOfRadioStationsInfo) {
            currentVolume++;
        }
    }

    public void setDecreaseVolume() {
        if (currentVolume > 1) {
            currentVolume--;
        }
    }

    public int getNumberOfRadioStationsInfo() {
        return numberOfRadioStationsInfo;
    }

    public void setNumberOfRadioStationsInfo() {
        if (numberOfRadioStationsInfo < 0) {
            numberOfRadioStationsInfo = 0;
        }
        this.numberOfRadioStationsInfo = numberOfRadioStationsInfo;
    }
}


