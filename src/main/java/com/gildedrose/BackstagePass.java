package com.gildedrose;

public class BackstagePass extends Item {
    public BackstagePass(int sellIn, int quality) {
        super("Backstage passes to a TAFKAL80ETC concert", sellIn, quality);
    }

    @Override
    protected void doUpdateQuality() {
        sellIn -= 1;

        if (sellIn < 0) {
            quality = 0;
            return;
        }

        if (quality >= 50) {
            return;
        }

        quality += 1;

        if (sellIn < 10 && quality < 50) {
            quality += 1;
        }

        if (sellIn < 5 && quality < 50) {
            quality += 1;
        }
    }
}
