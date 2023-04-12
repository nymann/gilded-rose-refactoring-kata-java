package com.gildedrose;

public class AgedBrie extends Item {
    public AgedBrie(int sellIn, int quality) {
        super("Aged Brie", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        sellIn -= 1;
        if (quality < 50) {
            quality = quality + 1;
        }
        if (sellIn < 0 && quality < 50) {
            quality = quality + 1;
        }
    }
}
