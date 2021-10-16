package main.java.td1.original.refractor.client;

import main.java.td1.original.api.general.*;
import main.java.td1.original.refractor.api.general.BurgerAdvisor;
import main.java.td1.original.refractor.restaurant.BigBurgerRestaurant;
import main.java.td1.original.refractor.restaurant.MacDeauRestaurant;

import java.util.Arrays;
import java.util.List;

import static main.java.td1.original.api.general.Meat.MeatType.BEEF;
import static main.java.td1.original.api.general.Sauce.SauceType.*;

public class App {
    public static void main(String args[]) {
        //c'est un dictionnaire
        BurgerAdvisor.register(CHEAP, MacDeauRestaurant.queue()); //Renvoie un restaurant
        BurgerAdvisor.register(EXPENSIVE, BigBurgerRestaurant.queue());

        //Typiquement de Factory
        BurgerAdvisor advisor = BurgerAdvisor.instance();
        // A regular burger
        Burger alice_dinner = advisor
                .select(CHEAP)//Renvoie un BurgerRestaurant
                .order_menu(FISH_MENU) //Renvoie un builder
                .cook();//Renvoie un Burger
        // A burger with extra onions and cheese
        Burger bob_dinner = advisor
                .select(CHEAP)
                .order_menu(MEAT_MENU)
                .with_onions()
                .with_cheese()
                .cook();
        // Cholesterol Burger
        Burger charles_dinner = advisor
                .select(EXPENSIVE)
                .order_personal(BIG, BEEF)
                .with_onions()
                .with_cheese()
                .with_sauce(BARBECUE)
                .with_sauce(BEARNAISE)
                .with_sauce(BURGER)
                .with_cheese()
                .cook();
        List<Burger> dinners = Arrays.asList(
                alice_dinner,
                bob_dinner,
                charles_dinner
        );
        for (Burger dinner : dinners) {
            System.out.println(dinner);
        }
    }
}

//MAP reduce ? avec .stream dans la classe Burger.java pour éviter les boucles for
//FAIRE DES toString dans les classes pour affichage. Utiliser .append au lieu de String + String mauvais car String est une classe immuable

//Quand une classe ne porte pas de visibilité sur son constructeur alors le constructeur n'est acessible que par les classes du package
//En priorité BUILDER ET SINGLETON (burger)