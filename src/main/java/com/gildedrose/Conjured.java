package com.gildedrose;

public class Conjured extends Item {
    Conjured(int sellIn, int quality) {
        super("Conjured", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        sellIn -= 1;
        quality -= 2;
        if (sellIn < 0) {
            quality -= 2;
        }
        quality = Math.max(quality, 0);
    }
}
