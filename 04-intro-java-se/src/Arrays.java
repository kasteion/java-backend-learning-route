public class Arrays {
    public static void main(String[] args) {
        String[] androidVersions = new String[17];
        String days[] = new String[7];
        days[0] = "Sunday";
        days[1] = "Monday";
        days[2] = "Tuesday";
        days[3] = "Wensday";
        days[4] = "Thursday";
        days[5] = "Friday";
        days[6] = "Saturday";

        String[][] cities = new String[4][2];
        cities[0][0] = "México";
        cities[0][1] = "CMDX";
        cities[1][0] = "México";
        cities[1][1] = "Guadalajara";
        cities[2][0] = "Colombia";
        cities[2][1] = "Bogotá";
        cities[3][0] = "Colombia";
        cities[3][1] = "Medellín";

        int [][][] numbers = new int[2][2][2];
        int [][][][] numbers4 = new int[2][2][2][2];

        androidVersions[0] = "Apple Pie";
        androidVersions[1] = "Banana Bread";
        androidVersions[2] = "Cupcake";
        androidVersions[3] = "Donut";

        // System.out.println(androidVersions[0]);
        // System.out.println(androidVersions[1]);
        // System.out.println(androidVersions[2]);
        // System.out.println(androidVersions[3]);

        for (int i = 0; i < days.length; i++) {
            System.out.println(i + " " + days[i]);
        }

        for (int i = 0; i < androidVersions.length; i++) {
            if (androidVersions[i] != null)
            {
                System.out.println(i + " " + androidVersions[i]);
        
            }
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                System.out.println(i + "," + j + " " +cities[i][j]);
            }    
        }

        // System.out.println(cities[1][0]);
        // System.out.println(cities[1][1]);
        
        String[][][][] animals = new String[2][3][2][2];
        animals[1][0][0][1] = "Monkey";
        System.out.println(animals[1][0][0][1]);

        for (int i = 0; i < animals.length; i++) {
            for (int j = 0; j < animals[i].length; j++) {
                for (int k = 0; k < animals[i][j].length; k++) {
                    for (int l = 0; l < animals[i][j][k].length; l++) {
                        if (animals[i][j][k][l] != null) {
                            System.out.println(animals[i][j][k][l]);
                        }
                    }
                }
            }
        }

        for (String androidVersion : androidVersions) {
            if (androidVersion != null) {
                System.out.println(androidVersion);
            }
        }

        for (String[] city : cities) {
            for( String c : city){
                System.out.println(c);
            }
        }
    }
}
