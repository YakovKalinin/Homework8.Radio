package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setRadioStationNine() {
        Radio radio = new Radio(9, 20, 20);
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setRadioStationMin() {
        Radio radio = new Radio(-9, 20);
        radio.setRadioStation();
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationOverMax() {
        Radio radio = new Radio(11, 20, 10);
        radio.setRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setRadioStationZero() {
        Radio radio = new Radio(0, 20, 20);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationTen() {
        Radio radio = new Radio(10, 20, 10);
        radio.setRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setNextRadioStationNum9() {
        Radio radio = new Radio(8, 20, 10);
        radio.setNextRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setNextRadioStationNum0() {
        Radio radio = new Radio(10, 20, 10);
        radio.setNextRadioStation();
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setPrevRadioStationNum0() {
        Radio radio = new Radio(0, 20, 10);
        radio.setPrevRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setPrevRadioStationNum5() {
        Radio radio = new Radio(6, 20, 10);
        radio.setPrevRadioStation();
        assertEquals(5, radio.getRadioStation());
    }
    @Test
    public void setRadioStationWithoutNumber() {
        Radio radio = new Radio(6, 20);
        radio.setPrevRadioStation();
        assertEquals(5, radio.getRadioStation());
    }
    @Test
    public void setIncreaseVolumeAfter10() {
        Radio radio = new Radio(0, 10, 10);
        radio.setIncreaseVolume();
        assertEquals(10, radio.getCurrentVolume());
    }
    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio(1, 5, 10);
        radio.setIncreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio(0, 8, 10);
        radio.setDecreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }
    @Test
    public void setDecreaseVolumeUnder0() {
        Radio radio = new Radio(0, 0, 10);
        radio.setDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio(5, 5);
        radio.setCurrentVolume();
        assertEquals(5, radio.setCurrentVolume());
    }
    @Test
    public void getRadioConstructor() {
        Radio radio = new Radio();
        radio.getNumberOfRadioStationsInfo();
        assertEquals(10, radio.getNumberOfRadioStationsInfo());
    }
    @Test
    public void setNumberOfRadioStationsInfo() {
        Radio radio = new Radio();
        radio.setNumberOfRadioStationsInfo();
        assertEquals(10, radio.getNumberOfRadioStationsInfo());
    }
    @Test
    public void setNumberOfRadioStationsUnderZero() {
        Radio radio = new Radio(4, 12, -9);
        radio.setNumberOfRadioStationsInfo();
        assertEquals(0, radio.getNumberOfRadioStationsInfo());
    }
}