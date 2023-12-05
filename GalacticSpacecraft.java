//package com.mycompany.chandrayaan3_tddassesment;

import java.util.Scanner;

public class GalacticSpacecraft {
    private int[] position;
    private String direction;

    public GalacticSpaceCraft(int[] initialPosition, String initialDirection) {
        position = initialPosition;
        direction = initialDirection;
    }

    public int[] getPosition() {
        return position;
    }

    public String getDirection() {
        return direction;
    }

    public void moveForward() {
        switch (direction) {
            case "N":
                position[1]++;
                break;
            case "S":
                position[1]--;
                break;
            case "E":
                position[0]++;
                break;
            case "W":
                position[0]--;
                break;
            case "Up":
                position[2]++;
                break;
            case "Down":
                position[2]--;
                break;
        }
    }

    public void moveBackward() {
        switch (direction) {
            case "N":
                position[1]--;
                break;
            case "S":
                position[1]++;
                break;
            case "E":
                position[0]--;
                break;
            case "W":
                position[0]++;
                break;
            case "Up":
                position[2]--;
                break;
            case "Down":
                position[2]++;
                break;
        }
    }

    public void turnLeft() {
        switch (direction) {
            case "N":
                direction = "W";
                break;
            case "W":
                direction = "S";
                break;
            case "S":
                direction = "E";
                break;
            case "E":
                direction = "N";
                break;
            case "Up":
                direction = "N";
                break;
            case "Down":
                direction = "S";
                break;
        }
    }

    public void turnRight() {
        switch (direction) {
            case "N":
                direction = "E";
                break;
            case "E":
                direction = "S";
                break;
            case "S":
                direction = "W";
                break;
            case "W":
                direction = "N";
                break;
            case "Up":
                direction = "S";
                break;
            case "Down":
                direction = "N";
                break;
        }
    }

    public void turnUp() {
        direction = "Up";
    }

    public void turnDown() {
        direction = "Down";
    }

    public void executeCommands(String[] commands) {
        for (String command : commands) {
            switch (command) {
                case "f":
                    moveForward();
                    break;
                case "b":
                    moveBackward();
                    break;
                case "l":
                    turnLeft();
                    break;
                case "r":
                    turnRight();
                    break;
                case "u":
                    turnUp();
                    break;
                case "d":
                    turnDown();
                    break;
            }
        }
    }

    public void printFinalPositionAndDirection() {
        System.out.println("Final Position: (" + position[0] + ", " + position[1] + ", " + position[2] + ")");
        System.out.println("Final Direction: " + direction);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter initial position (x y z): ");
        int[] initialPosition = new int[3];
        for (int i = 0; i < 3; i++) {
            initialPosition[i] = scanner.nextInt();
        }

        System.out.print("Enter initial direction: ");
        String initialDirection = scanner.next();

        System.out.print("Enter commands: ");
        String input = scanner.next();
        String[] commands = input.split(",");

        GalacticSpaceCraft spacecraft = new GalacticSpaceCraft(initialPosition, initialDirection);
        spacecraft.executeCommands(commands);
        spacecraft.printFinalPositionAndDirection();

        scanner.close();
    }
}
// abc