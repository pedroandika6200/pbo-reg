package com.pbo;

public class latihanOOP2 {
    public static void main(String[] args) {
        // membuat object player
        Player player1 = new Player("ucup",100);
        Player player2 = new Player("otong",50);

        // membuat object weapon
        Weapon pedang = new Weapon("pedang",15);
        Weapon ketapel = new Weapon("ketapel",1);

        // membuat object armor
        Armor bajuBesi = new Armor("baju besi",10);
        Armor kaos = new Armor("kaos",0);

        // player 1
        player1.equipWeapon(pedang);
        player1.equipArmor(bajuBesi);
        player1.display();

        // player 2
        player2.equipWeapon(ketapel);
        player2.equipArmor(kaos);
        player2.display();

        System.out.println("\nPERTEMPURAAAN");
        System.out.println("\nEpisode - 1\n");
        player1.attack(player2);
        player1.display();
        player2.display();
        System.out.println("\nEpisode - 2\n");
        player2.attack(player1);
        player1.display();
        player2.display();
    }
}
