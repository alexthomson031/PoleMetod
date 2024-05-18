package ru.netology.PoleMetod;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void TestMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(100);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(-1);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestBiggerVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(101);

        int expected = 100;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMinMaxVolume() {
        Radio rad = new Radio();
        rad.setCurrentVolume(0);

        int expected = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increaseVolume() {
        Radio rad = new Radio();
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolume() {
        Radio rad = new Radio();
        rad.setDecreaseVolume(0);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decrease0Volume() {
        Radio rad = new Radio();
        rad.setDecreaseVolume(0);

        int expected = 0;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void decreaseVolumeAbove0() {
        Radio rad = new Radio();
        rad.setDecreaseVolume(5);

        int expected = 4;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void increase100Volume() {
        Radio rad = new Radio();
        rad.increaseVolume();

        int expected = 1;
        int actual = rad.currentVolume;

        Assertions.assertEquals(expected, actual);
    }

    ////////////////////////////////////////////////////////////////////
    @Test
    public void TestMinStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(-1);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestMaxStation() {
        Radio rad = new Radio();
        rad.setCurrentStation(10);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestChoosingStationAbove() {
        Radio rad = new Radio();
        rad.increaseStation();

        int expected = 1;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestChoosingStationBelow0() {
        Radio rad = new Radio();
        rad.setDecreaseStation(5);

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestChoosingStation0() {
        Radio rad = new Radio();
        rad.setDecreaseStation(0);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestChoosingStationBelow9() {
        Radio rad = new Radio();
        rad.setDecreaseStation(5);

        int expected = 4;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingStationManual() {
        Radio rad = new Radio();
        rad.setStation(8);

        int expected = 8;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingStationManual0() {
        Radio rad = new Radio();
        rad.setStation(0);

        int expected = 0;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ChoosingStationManual9() {
        Radio rad = new Radio();
        rad.setStation(9);

        int expected = 9;
        int actual = rad.getCurrentStation();

        Assertions.assertEquals(expected, actual);
    }
}

