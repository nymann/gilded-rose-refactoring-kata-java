package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConjuredTest {

    @Test
    void doUpdateQualityNormal() {
        Item item = Item.createItem("Conjured", 5, 5);
        item.doUpdateQuality();
        assert item.quality == 3;
        assert item.sellIn == 4;
    }
    @Test
    void doUpdateQualityTwiceAsFast() {
        Item item = Item.createItem("Conjured", 0, 5);
        item.doUpdateQuality();
        assert item.quality == 1;
        assert item.sellIn == -1;
    }

    @Test
    void doUpdateQualityNeverNegative() {
        Item item = Item.createItem("Conjured", 5, 0);
        item.doUpdateQuality();
        assert item.quality == 0;
        assert item.sellIn == 4;
    }
}
