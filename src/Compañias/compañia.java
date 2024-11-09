package Compañias;

public class compañia {
    private String[][] companiasPublicas = {
            { "Avianca", "LATAM", "Viva Air" },
            { "Copa Airlines", "EasyFly", "SATENA" },
            { "American Airlines", "Delta", "United Airlines" }
    };

    private String[][] companiasPrivadas = {
            { "CharterX", "FlyPrivate", "JetSet" },
            { "LuxuryAir", "VIPWings", "SkyElite" },
            { "PrestigeJets", "EliteAviation", "PrimeAir" }
    };

    private String[][][] vuelosPublicos = {
            {
                    { "ID 223 Bogotá - Medellín", "ID 674 Bogotá - Cali", "ID 591 Bogotá - Barranquilla" },
                    { "ID 983 Bogotá - Cartagena", "ID 457 Bogotá - Bucaramanga", "ID 328 Bogotá - Pereira" },
                    { "ID 114 Bogotá - Montería", "ID 752 Bogotá - San Andrés", "ID 485 Bogotá - Villavicencio" }
            },
            {
                    { "ID 321 Medellín - Bogotá", "ID 264 Medellín - Cali", "ID 875 Medellín - Barranquilla" },
                    { "ID 699 Medellín - Cartagena", "ID 553 Medellín - Bucaramanga", "ID 402 Medellín - Pereira" },
                    { "ID 168 Medellín - Montería", "ID 733 Medellín - San Andrés", "ID 284 Medellín - Villavicencio" }
            },
            {
                    { "ID 495 Cali - Bogotá", "ID 677 Cali - Medellín", "ID 833 Cali - Barranquilla" },
                    { "ID 501 Cali - Cartagena", "ID 912 Cali - Bucaramanga", "ID 785 Cali - Pereira" },
                    { "ID 249 Cali - Montería", "ID 370 Cali - San Andrés", "ID 654 Cali - Villavicencio" }
            }
    };

    private String[][][] vuelosPrivados = {
            {
                    { "ID 128 Guaymaral - Medellín", "ID 345 Guaymaral - Cali", "ID 293 Guaymaral - Barranquilla" },
                    { "ID 432 Guaymaral - Cartagena", "ID 901 Guaymaral - Bucaramanga", "ID 572 Guaymaral - Pereira" },
                    { "ID 163 Guaymaral - Montería", "ID 284 Guaymaral - San Andrés", "ID 745 Guaymaral - Villavicencio" }
            },
            {
                    { "ID 456 Vanguardia - Bogotá", "ID 631 Vanguardia - Cali", "ID 710 Vanguardia - Barranquilla" },
                    { "ID 843 Vanguardia - Cartagena", "ID 953 Vanguardia - Bucaramanga", "ID 278 Vanguardia - Pereira" },
                    { "ID 391 Vanguardia - Montería", "ID 674 Vanguardia - San Andrés", "ID 542 Vanguardia - Villavicencio" }
            },
            {
                    { "ID 750 Palonegro - Bogotá", "ID 923 Palonegro - Medellín", "ID 635 Palonegro - Barranquilla" },
                    { "ID 413 Palonegro - Cartagena", "ID 286 Palonegro - Bucaramanga", "ID 597 Palonegro - Pereira" },
                    { "ID 301 Palonegro - Montería", "ID 734 Palonegro - San Andrés", "ID 462 Palonegro - Villavicencio" }
            }
    };

    public String[][][] getVuelosPublicos() {
        return vuelosPublicos;
    }

    public void setVuelosPublicos(String[][][] vuelosPublicos) {
        this.vuelosPublicos = vuelosPublicos;
    }

    public String[][][] getVuelosPrivados() {
        return vuelosPrivados;
    }

    public void setVuelosPrivados(String[][][] vuelosPrivados) {
        this.vuelosPrivados = vuelosPrivados;
    }

    public String[][] getCompaniasPublicas() {
        return companiasPublicas;
    }

    public void setCompaniasPublicas(String[][] companiasPublicas) {
        this.companiasPublicas = companiasPublicas;
    }

    public String[][] getCompaniasPrivadas() {
        return companiasPrivadas;
    }

    public void setCompaniasPrivadas(String[][] companiasPrivadas) {
        this.companiasPrivadas = companiasPrivadas;
    }
}
