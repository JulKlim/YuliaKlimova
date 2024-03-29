package com.epam.helloworld.greenhouse;

public class PlantFactory {
    public static Plants createPlant(String className, String name, String nativeRegion, String specialNeeds, String type, HousePlant.HouseplantCare care) {
        switch (className) {
            case "shrub" -> {
                return new Shrub(name, nativeRegion, specialNeeds, type);
            }
            case "housePlant" -> {
                return new HousePlant(name, nativeRegion, specialNeeds, type, care);
            }
            case "floweringPlant" -> {
                return new FloweringPlant(name, nativeRegion, specialNeeds, type);
            }
            default -> {
                System.err.println("This plant type is not supported in Greenhouse");
                return null;
            }
        }
    }

    public static void updatePlantSpecialNeeds(Plants plant, String newSpecialNeeds) {
        plant.updateInfoAboutPlant(newSpecialNeeds);
    }
}
