import java.util.Scanner;

public class chapter12_15 {
    public static void main(String[] args) {
        for(City city : City.values()) {
            city.CityTravel();
        } 
    }

    public enum City {
        PARKVILLE (39.2, -94.7),
        HAVANA (23.1, -82.4),
        KINGSTON (18.0, -76.8),
        NASSAU (25.1, -77.3),
        SAINT_THOMAS (18.3, -64.9);

        public final double latitude;
        public final double longitude;

        private City(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public double getDistance(City destination) {
            final double R = 6371; // Radius of the earth in kilometers.

            double lat1, lon1;
            double lat2, lon2;
            double a;
    
            lat1 = Math.toRadians(this.latitude);
            lon1 = Math.toRadians(this.longitude);
            lat2 = Math.toRadians(destination.latitude);
            lon2 = Math.toRadians(destination.longitude);
    
            a = Math.pow(Math.sin((lat2-lat1) /2), 2) + 
            Math.pow(Math.sin((lon2-lon1) /2), 2) * 
            Math.cos(lat1) * Math.cos(lat2);
            
            return (2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a))) * R;
        }

        public void CityTravel() {
            final double KM_TO_MILES = 0.62137;
            City origin = getCity("origin");
            City destination = getCity("destination");
            double distance = origin.getDistance(destination);

            System.out.printf("%s to %s: %.1f km, or %.1f miles\n", origin, destination, distance, distance * KM_TO_MILES);
        }

        public static City getCity(String originOrDestination) {
            Scanner input = new Scanner(System.in);
            String newCity = "";
            boolean isValid = false;

            while (!isValid) {
                System.out.println("Enter " + originOrDestination + " city. (PARKVILLE, HAVANA, KINGSTON, NASSAU, or SAINT_THOMAS)");
                newCity = input.nextLine();
                for(City city : City.values()) {
                    if (newCity.equalsIgnoreCase(city.name())) {
                        isValid = true;
                        return city;
                    }
                }
                System.out.println("Invalid city. Try again.");
            }
            return null;
        }
    }
}
