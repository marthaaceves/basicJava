package gNumericTypes;

import libs.Input;

public class botelladeagua {

    public static void main(String[] args) {
        System.out.println("cuantos minutos en bañarse");
        int minutos = Input.get_int();
        minutos = minutos *12;

        System.out.println("tu gastas X botellas de agua al bañarte", + minutos);


    }
}
