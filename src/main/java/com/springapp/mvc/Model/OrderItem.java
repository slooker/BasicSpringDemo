package com.springapp.mvc.Model;

import java.util.*;

public class OrderItem {
    int sku;
    String name;
    String itemType;

    public int getSku() {
        return sku;
    }

    public void setSku(int sku) {
        this.sku = sku;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public static OrderItem generateRandomItem() {
        List<String> adverbs = Arrays.asList("Cute", "Tacky", "Pretty", "Weird", "Ugly", "Odd", "Beautiful");
        final Map<String , String> nouns = new HashMap<String , String>() {{
            put("Dress", "clothing");
            put("Jeans", "clothing");
            put("Shirt", "clothing");
            put("Blouse", "clothing");
            put("Heels", "shoes");
            put("Sneakers", "shoes");
            put("Sandals", "shoes");
            put("Flip-flops", "shoes");
            put("Blender", "housewares");
            put("Cutting Board", "housewares");
            put("Mixer", "housewares");
            put("Eye-Liner", "beauty");
            put("Mascarra", "beauty");
            put("Eye Shadow", "beauty");
            put("Lipstick", "beauty");
            put("Nail Polish", "beauty");
            put("Beanie", "accessories");
            put("Cowboy Hat", "accessories");
            put("Fitted Cap", "accessories");
            put("Bangles", "accessories");
        }};
        List<String> colors = Arrays.asList("Blue", "Green", "Red", "Orange", "Yellow", "Fuscia", "Black", "Purple");

        OrderItem item = new OrderItem();
        Random rand = new Random();
        String adverb = adverbs.get(rand.nextInt(adverbs.size()));
        String color = colors.get(rand.nextInt(colors.size()));

        Random       random    = new Random();
        List<String> keys      = new ArrayList<String>(nouns.keySet());
        String       randomKey = keys.get( random.nextInt(keys.size()) );
        String       value     = nouns.get(randomKey);

        item.setItemType(value);

        item.setSku(rand.nextInt(+1000000));

        item.setName(adverb + " " + color + " " + randomKey);
        return item;
    }

    @Override
    public String toString() {
        return "OrderItem{" +
                "sku=" + sku +
                ", name='" + name + '\'' +
                ", itemType='" + itemType + '\'' +
                '}';
    }
}
