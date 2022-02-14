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
        Radio radio = new Radio();
        radio.setRadioStation (0);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationOverMax() {
        Radio radio = new Radio();
        radio.setRadioStation (20);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationZero() {
        Radio radio = new Radio(0, 20, 20);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationUnderZero() {
        Radio radio = new Radio();
        radio.setRadioStation(-9);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setRadioStationTen() {
        Radio radio = new Radio();
        radio.setRadioStation (10);
        assertEquals(0, radio.getRadioStation());
    }
    @Test
    public void setNextRadioStationNum9() {
        Radio radio = new Radio(8, 20, 10);
        radio.setNextRadioStation();
        assertEquals(9, radio.getRadioStation());
    }
    @Test
    public void setNextRadioStationNum0() {
        Radio radio = new Radio(10, 20);
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
        Radio radio = new Radio(6, 20);
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
    public void setIncreaseVolume() {
        Radio radio = new Radio(1, 5);
        radio.setIncreaseVolume();
        assertEquals(6, radio.getCurrentVolume());
    }
    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio(0, 8);
        radio.setDecreaseVolume();
        assertEquals(7, radio.getCurrentVolume());
    }
    @Test
    public void setDecreaseVolumeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseVolume();
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setIncreaseVolumeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(99);
        radio.setIncreaseVolume();
        assertEquals(99, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeOver99() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolumeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-9);
        assertEquals(0, radio.getCurrentVolume());
    }
    @Test
    public void setCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(40);
        assertEquals(40, radio.getCurrentVolume());
    }
    @Test
    public void setNumberOfRadioStationsInfo() {
        Radio radio = new Radio(10);
        assertEquals(9, radio.getMaxRadioStation());
    }
    @Test
    public void setNumberOfRadioStationsInfo500() {
        Radio radio = new Radio(500);
        assertEquals(499, radio.getMaxRadioStation());
    }
    @Test
    public void setNumberOfRadioStationsUnderZero() {
        Radio radio = new Radio(-10);
        assertEquals(9, radio.getMaxRadioStation());
    }
    @Test
    public void setNumberOfRadioStationsZero() {
        Radio radio = new Radio(0);
        assertEquals(9, radio.getMaxRadioStation());
    }
    @Test
    public void setNumberOfRadioStationsUnderLimit() {
        Radio radio = new Radio(1000);
        assertEquals(9, radio.getMaxRadioStation());
    }
}