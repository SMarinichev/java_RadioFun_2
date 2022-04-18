package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setMaxStation() {
        this.currentStation = 9;
    }

    public void setMinStation() {
        this.currentStation = 0;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseStation() {

        if (currentStation < 9) {
            currentStation = currentStation + 1;
            return;
        }

        this.currentStation = 0;
    }

    public void prevStation() {
        if (currentStation > 1) {
            currentStation = currentStation - 1;
        }
        if (currentStation == 0) {
            this.currentStation = 9;
        }
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 10) {
            return;
        }
        if (currentVolume < 0) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}