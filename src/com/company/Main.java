package com.company;

public class Main {
    public static class Animal{
        String animm;
        String food;
        String location;
        String name;
        public Animal(String food, String location, String name, String animm){
            this.food = food;
            this.location = location;
            this.name = name;
            this.animm = animm;
        }
        public void makeNoise(){
            System.out.println("Издает звуки");
        }
        public void  eat(){
            System.out.println("Животное ест");
        }
        public void sleep(){
            System.out.println("Животное спит");
        }
    }
    public static class Raven extends Animal {
        public Raven (String name, String food, String location, String animm){
            super(food,location,name,animm);

        }
        @Override
        public void makeNoise() {
            System.out.println("Кар-Кар");
        }

        @Override
        public void eat() {
            System.out.println("Ворон ест");
        }
    }
    public static class Raccoon extends Animal {
        public Raccoon (String name, String food, String location,String animm){
            super(food,location,name,animm);

        }
        @Override
        public void makeNoise() {
            System.out.println("Хрум-Хрум");
        }

        @Override
        public void eat() {
            System.out.println("Енот ест");
        }
    }
    public static class Rabbit extends Animal {
        public Rabbit (String name, String food, String location,String animm){
            super(food,location,name,animm);

        }
        @Override
        public void makeNoise() {
            System.out.println("Писк");
        }

        @Override
        public void eat() {
            System.out.println("Кролик ест");
        }
    }
    public static class Veterinarian{
        void treatAnimal(Animal animal){
            System.out.println("На приёме у ветеринара");
            System.out.println("Животное: " + animal.animm);
            System.out.println("Кличка: " + animal.name);
            System.out.println ("Питается: " + animal.food );
            System.out.println("Ареал обитания: " + animal.location);
            System.out.println();

        }
    }





    public static void main(String[] args) {
        Veterinarian vet = new Veterinarian();
        Animal[] animal = new Animal[3];
        animal[0] = new Raven("Вася", "Fresh Meat", "Самарская область","Ворон");
        animal[1] = new Raccoon("Орео", "Хрумки", "Самарская область","Енот");
        animal[2] = new Rabbit("Валера", "Морковь", "Вальер 1","Кролик");



        for (Animal animal1 : animal){
            vet.treatAnimal(animal1);
        }



    }
}
