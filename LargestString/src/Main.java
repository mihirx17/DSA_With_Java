public class Main {
    public static void main(String[] args) {
        String[] cars = {"BMW", "Honda", "Ktm", "Roya"};
        String largest = cars[0];
        String Smallest=cars[0];
        System.out.println(Smallest);

        for (int i = 1; i < cars.length; i++) {
            if (largest.compareTo(cars[i]) < 0) {
                largest = cars[i];
            }
            else if (Smallest.compareTo(cars[i])>0){

                Smallest=cars[i];
            }


        }

        System.out.println("The largest car is: " + largest);
        System.out.println("The Smallest car is: " + Smallest);

    }
}
