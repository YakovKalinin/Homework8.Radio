package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    @Test
    public void setRadioStationNine() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationMinNine() {
        Radio radio = new Radio();
        radio.setRadioStation(-9);
        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationZero() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setRadioStationTen() {
        Radio radio = new Radio();
        radio.setRadioStation(10);
        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setNextRadioStationNum9() {
        Radio radio = new Radio();
        radio.setRadioStation(8);
        radio.setNextRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setNextRadioStationNum0() {
        Radio radio = new Radio();
        radio.setRadioStation(9);
        radio.setNextRadioStation();
        int expected = 0;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setPrevRadioStationNum0() {
        Radio radio = new Radio();
        radio.setRadioStation(0);
        radio.setPrevRadioStation();
        int expected = 9;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setPrevRadioStationNum5() {
        Radio radio = new Radio();
        radio.setRadioStation(6);
        radio.setPrevRadioStation();
        int expected = 5;
        int actual = radio.getRadioStation();
        assertEquals(expected, actual);
    }
    @Test
    public void setIncreaseVolumeAfter10() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.setIncreaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.setIncreaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.setDecreaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
    @Test
    public void setDecreaseVolumeUnder0() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.setDecreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}