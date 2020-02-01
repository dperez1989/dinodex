class Dinodex {
  public static void main(String args[]){
    System.out.println("Creating a Stegosaurus");
    Dinosaur stegosaurus = new Dinosaur("Stegosaurus");

    if (stegosaurus.getSteps() == 0) {
      System.out.println("Dinosaur Steps is 0");
    }

    System.out.println("Walk your dinosaur");
    stegosaurus.walk();

    if (stegosaurus.getSteps() == 1) {
      System.out.println("Dinosaur walked!");
    } else {
      System.out.println("Dinosaur did not walk");
    }

    if (stegosaurus.isHerbivore()) {
      System.out.println("Dinosaur is an Herbivore!");
    }else{
      System.out.println("Dinosaur is a Carnivore!");
    }

    stegosaurus.display();
  }
}
