package ru.netology.PoleMetod;

public class Radio {
    private int currentVolume;
    private int currentStation;
    private int maxVolume = 100;
    private int maxStation;
    private int minVolume;
    private int minStation;

    public Radio() {
    }

    public Radio(int stations) {
        this.maxStation = stations;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        } else {
            currentVolume = maxVolume;
        }
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        } else {
            this.currentVolume = minVolume;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < minStation) {
            currentStation = maxStation;
        }
        if (currentStation > maxStation) {
            currentStation = minStation;
        }
        this.currentStation = currentStation;
        return;
    }

    public void increaseStation() { // до 9
        if (currentStation < maxStation) {
            currentStation = currentStation + 1;
        } else {
            currentStation = maxStation;
        }
    }

    public void decreaseStation() {
        if (currentStation > minStation) {
            currentStation = currentStation - 1;
        } else {
            currentStation = minStation;
        }
    }
}