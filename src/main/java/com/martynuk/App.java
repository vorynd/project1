package com.martynuk;

import java.io.IOException;

import com.martynuk.view.MainMenu;

public class App {

    public static void main(String[] args) throws IOException {
        MainMenu menu = new MainMenu();
        menu.showMenu();
    }

}
