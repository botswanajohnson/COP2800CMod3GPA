// PalmerPenguinsM3.java
// Botswana Johnson
// 5/28/26
// Calculates Palmer Penguin statistics using if-else and switch.

public class PalmerPenguinsM3 {

   // Constants to represent the species names.
   static final String SP_CHINSTRAP = "Chinstrap";
   static final String SP_GENTOO = "Gentoo";
   static final String SP_ADELIE = "Adelie";

   // Constants to represent the species counts.
   static final int NUM_CHINSTRAP = 68;
   static final int NUM_GENTOO = 123;
   static final int NUM_ADELIE = 151;
   static final int TOTAL_SPECIES = 3;

   public static void main(String[] args) {

      // Calculate total number of penguins in the dataset.
      int totalPenguins =
         NUM_CHINSTRAP + NUM_GENTOO + NUM_ADELIE;

      // Output the species names with introductory text.
      System.out.println("Introducing the Palmer Penguins:");
      System.out.println("\t" + SP_CHINSTRAP + "!");
      System.out.println("\t" + SP_GENTOO + "!");
      System.out.println("and last but not least...");
      System.out.println("\t" + SP_ADELIE + "!");

      System.out.println();

      // Output total species and total penguins.
      System.out.println("There are a total of " + TOTAL_SPECIES
                         + " penguin species in this dataset.");
      System.out.println("There are a total of " + totalPenguins
                         + " penguins in the dataset.");

      // Output each species count and percentage.
      System.out.printf("%s: %d (%.2f%%)\n", SP_CHINSTRAP,
                        NUM_CHINSTRAP,
                        (double) NUM_CHINSTRAP
                        / totalPenguins * 100);

      System.out.printf("%s: %d (%.2f%%)\n", SP_GENTOO,
                        NUM_GENTOO,
                        (double) NUM_GENTOO
                        / totalPenguins * 100);

      System.out.printf("%s: %d (%.2f%%)\n", SP_ADELIE,
                        NUM_ADELIE,
                        (double) NUM_ADELIE
                        / totalPenguins * 100);

      // Determine which penguin species is most populous.
      System.out.println("\nBranching Analysis:");

      if (NUM_CHINSTRAP > NUM_GENTOO
          && NUM_CHINSTRAP > NUM_ADELIE) {

         System.out.println(SP_CHINSTRAP
                            + " penguins are the most populous.");

      }
      else if (NUM_GENTOO > NUM_CHINSTRAP
               && NUM_GENTOO > NUM_ADELIE) {

         System.out.println(SP_GENTOO
                            + " penguins are the most populous.");

      }
      else if (NUM_ADELIE > NUM_CHINSTRAP
               && NUM_ADELIE > NUM_GENTOO) {

         System.out.println(SP_ADELIE
                            + " penguins are the most populous.");

      }
      else {

         System.out.println("There is a tie between species "
                            + "for the most populous.");
      }

      // Choose one species for switch statement analysis.
      String chosenSpecies = SP_GENTOO;

      System.out.println("\nIndividual Species "
                         + "Switch Statement Analysis:");

      switch (chosenSpecies) {

         case SP_CHINSTRAP:

            System.out.printf("%s: %d (%.2f%%)\n",
                              SP_CHINSTRAP,
                              NUM_CHINSTRAP,
                              (double) NUM_CHINSTRAP
                              / totalPenguins * 100);
            break;

         case SP_GENTOO:

            System.out.printf("%s: %d (%.2f%%)\n",
                              SP_GENTOO,
                              NUM_GENTOO,
                              (double) NUM_GENTOO
                              / totalPenguins * 100);
            break;

         case SP_ADELIE:

            System.out.printf("%s: %d (%.2f%%)\n",
                              SP_ADELIE,
                              NUM_ADELIE,
                              (double) NUM_ADELIE
                              / totalPenguins * 100);
            break;

         default:

            System.out.println("Species not recognized.");
            break;
      }
   }
}