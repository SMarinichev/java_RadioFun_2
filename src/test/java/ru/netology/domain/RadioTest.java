package ru.netology.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @Test
    void shouldSetQuantityStation() {
        Radio radio = new Radio(50);
        assertEquals(50, radio.getQuantityStation());
    }

    @Test
    void shouldSetQuantityStationDefault() {
        Radio radio = new Radio();
        assertEquals(10, radio.getQuantityStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(13);
        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityOver() {
        Radio radio = new Radio(12);
        radio.setCurrentStation(13);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantity2() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(13);
        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    void shouldSetCurrentStationWithCustomQuantityBelow() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(-13);
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(13);
        radio.increaseStation();

        assertEquals(14, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithCustomQuantityOverMax() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(49);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantity() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(14);
        radio.prevStation();

        assertEquals(13, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithCustomQuantityBelowMin() {
        Radio radio = new Radio(50);
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(49, radio.getCurrentStation());
    }

    @Test
    void shouldSetPrevStationWithDefaultQuantity() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prevStation();

        assertEquals(9, radio.getCurrentStation());
    }

    @Test
    void shouldSetNextStationWithDefaultQuantity4() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.increaseStation();

        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void shouldCurrentVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(113);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeIncrease() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);
        radio.increaseVolume();

        assertEquals(14, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeIncreaseMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(99);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeOverMax() {
        Radio radio = new Radio();

        radio.setCurrentVolume(100);
        radio.increaseVolume();

        assertEquals(100, radio.getCurrentVolume());
    }

    @Test
    void shouldDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(13);
        radio.decreaseVolume();

        assertEquals(12, radio.getCurrentVolume());
    }

    @Test
    void shouldVolumeBelowMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(0);
        radio.decreaseVolume();

        assertEquals(0, radio.getCurrentVolume());
    }

    @Test
    void shouldCurrentVolumeOverMin() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-13);
        radio.increaseVolume();

        assertEquals(1, radio.getCurrentVolume());
    }
}