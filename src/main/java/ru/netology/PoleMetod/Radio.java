package ru.netology.PoleMetod;

public class Radio {
    int currentVolume;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume >= 100) {
            currentVolume = 100;
        }
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void setDecreaseVolume(int newDecreaseVolume) {
        if (newDecreaseVolume > 0) {
            currentVolume = newDecreaseVolume - 1;
        }
        if (newDecreaseVolume == 0) {
            currentVolume = currentVolume;
        }
    }


//////////////////////////////////////////////////////////////


    int currentStation;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            newCurrentStation = 9;
        }
        if (newCurrentStation > 9) {
            newCurrentStation = 0;
        }
        currentStation = newCurrentStation;
    }

    public void increaseStation() { // до 9
        if (currentStation < 9) {
            currentStation = currentStation + 1;
        }
    }

    public void setDecreaseStation(int newDecreaseStation) { //до 0
        if (newDecreaseStation > 0) {
            newDecreaseStation = newDecreaseStation - 1;
        }
        if (newDecreaseStation == 0) {
            newDecreaseStation = 9;
        }
        currentStation = newDecreaseStation;
    }

    public void setStation(int yourStation) {
        if (yourStation >= 0) {
            currentStation = yourStation;
        }
        if (yourStation <= 9) {
            currentStation = yourStation;
        }
    }
}
