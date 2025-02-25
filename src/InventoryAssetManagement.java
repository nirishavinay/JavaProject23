package src;

import java.util.Scanner;

class Asset {
    String assetName;
    String assetType;
    double assetCost;

    public Asset(String assetName, String assetType, double assetCost) {
        this.assetName = assetName;
        this.assetType = assetType;
        this.assetCost = assetCost;
    }

    public void displayAssetDetails() {
        System.out.println(" \n Enter Asset Details: ");
        System.out.println("Asset Name: " + assetName);
        System.out.println("Asset Type: " + assetType);
        System.out.println("Asset Cost: $" + assetCost);
    }

    public void maintenanceService() {

        System.out.println("No maintenance service defined.");
    }
}

class ClassroomMaterial extends Asset {
    String materialCondition;

    public ClassroomMaterial(String assetName, double assetCost, String materialCondition) {
        super(assetName, "Classroom Material", assetCost);
        this.materialCondition = materialCondition;
    }

    @Override
    public void maintenanceService() {
        System.out.println("Maintenance Service for " + assetName + ": Condition is " + materialCondition);
    }
}

class LabEquipment extends Asset {
    boolean isCalibrated;

    public LabEquipment(String assetName, double assetCost, boolean isCalibrated) {
        super(assetName, "Lab Equipment", assetCost);
        this.isCalibrated = isCalibrated;
    }

    @Override
    public void maintenanceService() {
        if (isCalibrated) {
            System.out.println("Lab equipment " + assetName + " is calibrated and ready for use.");
        } else {
            System.out.println("Lab equipment " + assetName + " needs calibration.");
        }
    }
}

class ITLabEquipment extends Asset {
    String softwareVersion;

    public ITLabEquipment(String assetName, double assetCost, String softwareVersion) {
        super(assetName, "IT Lab Equipment", assetCost);
        this.softwareVersion = softwareVersion;
    }

    @Override
    public void maintenanceService() {
        System.out.println("IT Lab Equipment " + assetName + " has software version: " + softwareVersion);
    }
}

public class InventoryAssetManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Inventory Asset Management System.");

        System.out.print("Enter the number of assets you want to manage: ");
        int inventorySize = scanner.nextInt();
        scanner.nextLine();

        Asset[] inventory = new Asset[inventorySize];

        for (int i = 0; i < inventorySize; i++) {
            System.out.println("\nEnter details for Asset " + (i + 1));

            System.out.print("Enter Asset Name: ");
            String assetName = scanner.nextLine();

            System.out.print("Enter Asset Cost: ");
            double assetCost = scanner.nextDouble();
            scanner.nextLine();

            System.out.println("Choose Asset Type: 1. Classroom Material  2. Lab Equipment  3. IT Lab Equipment");
            int assetTypeChoice = scanner.nextInt();
            scanner.nextLine();

            switch (assetTypeChoice) {
                case 1:
                    System.out.print("Enter the Condition of the Classroom Material: ");
                    String materialCondition = scanner.nextLine();
                    inventory[i] = new ClassroomMaterial(assetName, assetCost, materialCondition);
                    break;
                case 2:
                    System.out.print("Is the Lab Equipment calibrated (true/false): ");
                    boolean isCalibrated = scanner.nextBoolean();
                    inventory[i] = new LabEquipment(assetName, assetCost, isCalibrated);
                    scanner.nextLine(); // consume newline character after boolean input
                    break;
                case 3:
                    System.out.print("Enter Software Version of IT Lab Equipment: ");
                    String softwareVersion = scanner.nextLine();
                    inventory[i] = new ITLabEquipment(assetName, assetCost, softwareVersion);
                    break;
                default:
                    System.out.println("Invalid option! No asset added.");
                    break;
            }
        }

        System.out.println("\n--- Inventory List ---");
        for (Asset asset : inventory) {
            asset.displayAssetDetails();
        }

        System.out.println("\n--- Maintenance Service ---");
        for (Asset asset : inventory) {
            asset.maintenanceService();
        }

        scanner.close();
    }
}
