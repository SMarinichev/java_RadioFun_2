package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetCurrentStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        int expected = 7;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationOverMax() {
        Radio radio = new Radio();
        radio.setCurrentStation(13);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentStationBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentStation(-13);
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(7);
        radio.increaseStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldNextMaxStation() {
        Radio radio = new Radio();
        radio.setMaxStation();
        radio.increaseStation();
        int expected = 0;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.prevStation();
        int expected = 8;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }
    @Test
    void shouldPrevMinStation() {
        Radio radio = new Radio();
        radio.setMinStation();
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentStation();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetCurrentVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeOverMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(13);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldSetVolumeBelowMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-13);
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.increaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(8);
        radio.decreaseVolume();
        int expected = 7;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldIncreaseMaxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    void shouldDecreaseMinVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }
}