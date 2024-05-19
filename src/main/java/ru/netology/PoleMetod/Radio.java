package ru.netology.PoleMetod;

public class Radio {
    private int currentVolume;
    private int currentStation;
    public int maxVolume = 100;
    public int maxStation = 9;
    public int minVolume;
    public int minStation;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int CurrentVolume) {
        if (CurrentVolume < minVolume) {
            return;
        }
        if (CurrentVolume > maxVolume) {
            return;
        }
        this.currentVolume = CurrentVolume;
    }

    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }
        else
            currentVolume = maxVolume;
        return;
    }

    public void decreaseVolume() {
        if (currentVolume > minVolume) {
            currentVolume = currentVolume - 1;
        }
        else
           this.currentVolume = minVolume;
    }
//////////////////////////////////////////////////////////////
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
        }
        else
            currentStation = maxStation;
    }

    public void setDecreaseStation(int decreaseStation) { //до 0
        if (decreaseStation > minStation) {
            decreaseStation = decreaseStation - 1;
        }
        if (decreaseStation == 0) {
            decreaseStation = 9;
        }
        currentStation = decreaseStation;
    }
}
