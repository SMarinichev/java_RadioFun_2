package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;
    private int volumeMax = 100;
    private int volumeMin = 0;
    private int quantityStation = 10;

    public Radio() {
    }

    public Radio(int quantityStation) {
        this.quantityStation = quantityStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > (quantityStation - 1)) {
            return;
        }
        if (currentStation < 0) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public int getQuantityStation() {
        return quantityStation;
    }

    public void increaseStation() {

        if (currentStation == (quantityStation - 1)) {
            setCurrentStation(0);
            return;
        }
        setCurrentStation(++currentStation);

    }

    public void prevStation() {

        if (currentStation == 0) {
            setCurrentStation(quantityStation - 1);
            return;
        }
        setCurrentStation(--currentStation);

    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > volumeMax) {
            return;
        }
        if (currentVolume < volumeMin) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < volumeMax) {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }
}