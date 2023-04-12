package com.gildedrose;

class GildedRose {
    Item[] items;

    public GildedRose(Item[] items) {
        this.items = items;
    }

    private static void doUpdateQuality(Item item) {
        switch (item.name) {
            case "Aged Brie":
                if (item.quality < 50) {
                    item.quality = item.quality + 1;
                }

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0 && item.quality < 50) {
                    item.quality = item.quality + 1;
                }
                break;
            case "Sulfuras, Hand of Ragnaros":
                return;
            case "Backstage passes to a TAFKAL80ETC concert":
                if (item.quality < 50) {
                    item.quality = item.quality + 1;

                    if (item.sellIn < 11 && item.quality < 50) {
                        item.quality = item.quality + 1;
                    }

                    if (item.sellIn < 6 && item.quality < 50) {
                        item.quality = item.quality + 1;
                    }
                }

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0) {
                    item.quality = 0;
                }
                break;
            default:
                if (item.quality > 0) {
                    item.quality = item.quality - 1;
                }

                item.sellIn = item.sellIn - 1;

                if (item.sellIn < 0 && item.quality > 0) {
                    item.quality = item.quality - 1;
                }
                break;
        }
    }

    public void updateQuality() {
        for (Item item : items) {
            doUpdateQuality(item);
        }
    }

}
