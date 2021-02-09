package spinWheel;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

class SpinWheel {
    String[] list;

    public static void main(String[] args) {
        System.out.println("Give a listname to read from");
        try {
            File newList = new File("itemList.txt");
            if (newList.createNewFile()) {

            }
        } catch (IOException e) {
            System.out.println("ERROR: Something happened");
            e.printStackTrace();
        }

    }
}
