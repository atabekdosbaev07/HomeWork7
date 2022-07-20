package com.company;

public class Main {
    public static void main(String[] args) {

        Cow cow = new Cow(400,11,"female","№ 13");
        Cow cow2 = new Cow(300,9,"female","№ 14");
        Cow cow3 = new Cow(500,13,"female","№ 15");
        Cow cow4 = new Cow(250,8,"female","№ 16");
        Cow cow5 = new Cow(500,14,"female","№ 17");

        Horse horse = new Horse(500, 8,"male","№ 22");
        Horse horse2 = new Horse(500, 9,"female","№ 20");

        Sheep sheep = new Sheep(80,5,"female","№ 14");
        Sheep sheep2 = new Sheep(110,7,"female","№ 15");
        Sheep sheep3 = new Sheep(90,6,"female","№ 16");

        Farm1 farm1 = new Farm1("Ozgon", "Kudiret Orozbaev",
                new Cow[]{cow,cow2,cow3,cow4,cow5},new Horse[]{horse,horse2},
                new Sheep[]{sheep,sheep2,sheep3} );
        System.out.println(farm1);
        System.out.println("_____________");

        Farm2 farm2 = new Farm2("Kara Suu","Marat Alymov",
                new Cow[]{cow},new Horse[]{horse}, new Sheep[]{sheep});
        System.out.println(farm2);
    }
}