
package Aeropuertos;

public class aeropuerto {
    private String[]  dineropublico = {"100.000", "100"};

    private String[] dineroprivado = {"200.000"};
private String[] privado = {"pocoyo", "te.mascafe", "menos robos"};
private String[] publico = {"1.000.000.000", "2.000.000.000" , " 1.200.000.000"};
    private String[] aeropuertosPublicos = { "El Dorado", "José María Córdova", "Alfonso Bonilla Aragón" };
    private String[] paispublico = {"colombia-bogota","colombia-santamarta","colombia-barranquilla"};
    private String[] aeropuertosPrivados = { "Guaymaral", "Vanguardia", "Palonegro" };
    private String[] paisprivado = {"venezuela-bogota","venezuela-santamarta","venezuela-barranquilla"};

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


    String[][][][] asientosPublicos = {
            {
                    {{"1A", "2A", "3A", "4A", "5A", "6A", "7A", "8A", "9A"}},
                    {{"1B", "2B", "3B", "4B", "5B", "6B", "7B", "8B", "9B"}},
                    {{"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C"}}
            },
            {
                    {{"1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D"}},
                    {{"1E", "2E", "3E", "4E", "5E", "6E", "7E", "8E", "9E"}},
                    {{"1F", "2F", "3F", "4F", "5F", "6F", "7F", "8F", "9F"}}
            },
            {
                    {{"1G", "2G", "3G", "4G", "5G", "6G", "7G", "8G", "9G"}},
                    {{"1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H"}},
                    {{"1I", "2I", "3I", "4I", "5I", "6I", "7I", "8I", "9I"}}
            },

    };
    String[][][][] asientosPublicos2 = {
            {
                    {{"1M", "2M", "3M", "4M", "5M", "6M", "7M", "8M", "9M"}},
                    {{"1N", "2N", "3N", "4N", "5N", "6N", "7N", "8N", "9N"}},
                    {{"1O", "2O", "3O", "4O", "5O", "6O", "7O", "8O", "9O"}}
            },
            {
                    {{"1P", "2P", "3P", "4P", "5P", "6P", "7P", "8P", "9P"}},
                    {{"1Q", "2Q", "3Q", "4Q", "5Q", "6Q", "7Q", "8Q", "9Q"}},
                    {{"1R", "2R", "3R", "4R", "5R", "6R", "7R", "8R", "9R"}}
            },
            {
                    {{"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S"}},
                    {{"1T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "9T"}},
                    {{"1U", "2U", "3U", "4U", "5U", "6U", "7U", "8U", "9U"}}
            },

    };
    String[][][][] asientosPublicos3 = {
            {
                    {{"1Y", "2Y", "3Y", "4Y", "5Y", "6Y", "7Y", "8Y", "9Y"}},
                    {{"1Z", "2Z", "3Z", "4Z", "5Z", "6Z", "7Z", "8Z", "9Z"}},
                    {{"1Ñ", "2Ñ", "3Ñ", "4Ñ", "5Ñ", "6Ñ", "7Ñ", "8Ñ", "9Ñ"}}
            },
            {
                    {{"1O", "2O", "3O", "4O", "5O", "6O", "7O", "8O", "9O"}},
                    {{"1P", "2P", "3P", "4P", "5P", "6P", "7P", "8P", "9P"}},
                    {{"1Q", "2Q", "3Q", "4Q", "5Q", "6Q", "7Q", "8Q", "9Q"}}
            },
            {
                    {{"1R", "2R", "3R", "4R", "5R", "6R", "7R", "8R", "9R"}},
                    {{"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S"}},
                    {{"1T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "9T"}}
            }
    };
    String[][][][] asientosPrivados = {
            {
                    {{"1A", "2A", "3A", "4A", "5A", "6A", "7A", "8A", "9A"}},
                    {{"1B", "2B", "3B", "4B", "5B", "6B", "7B", "8B", "9B"}},
                    {{"1C", "2C", "3C", "4C", "5C", "6C", "7C", "8C", "9C"}}
            },
            {
                    {{"1D", "2D", "3D", "4D", "5D", "6D", "7D", "8D", "9D"}},
                    {{"1E", "2E", "3E", "4E", "5E", "6E", "7E", "8E", "9E"}},
                    {{"1F", "2F", "3F", "4F", "5F", "6F", "7F", "8F", "9F"}}
            },
            {
                    {{"1G", "2G", "3G", "4G", "5G", "6G", "7G", "8G", "9G"}},
                    {{"1H", "2H", "3H", "4H", "5H", "6H", "7H", "8H", "9H"}},
                    {{"1I", "2I", "3I", "4I", "5I", "6I", "7I", "8I", "9I"}}
            },

    };
    String[][][][] asientosPrivados2 = {
            {
                    {{"1M", "2M", "3M", "4M", "5M", "6M", "7M", "8M", "9M"}},
                    {{"1N", "2N", "3N", "4N", "5N", "6N", "7N", "8N", "9N"}},
                    {{"1O", "2O", "3O", "4O", "5O", "6O", "7O", "8O", "9O"}}
            },
            {
                    {{"1P", "2P", "3P", "4P", "5P", "6P", "7P", "8P", "9P"}},
                    {{"1Q", "2Q", "3Q", "4Q", "5Q", "6Q", "7Q", "8Q", "9Q"}},
                    {{"1R", "2R", "3R", "4R", "5R", "6R", "7R", "8R", "9R"}}
            },
            {
                    {{"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S"}},
                    {{"1T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "9T"}},
                    {{"1U", "2U", "3U", "4U", "5U", "6U", "7U", "8U", "9U"}}
            },

    };
    String[][][][] asientosPrivados3 = {
            {
                    {{"1Y", "2Y", "3Y", "4Y", "5Y", "6Y", "7Y", "8Y", "9Y"}},
                    {{"1Z", "2Z", "3Z", "4Z", "5Z", "6Z", "7Z", "8Z", "9Z"}},
                    {{"1Ñ", "2Ñ", "3Ñ", "4Ñ", "5Ñ", "6Ñ", "7Ñ", "8Ñ", "9Ñ"}}
            },
            {
                    {{"1O", "2O", "3O", "4O", "5O", "6O", "7O", "8O", "9O"}},
                    {{"1P", "2P", "3P", "4P", "5P", "6P", "7P", "8P", "9P"}},
                    {{"1Q", "2Q", "3Q", "4Q", "5Q", "6Q", "7Q", "8Q", "9Q"}}
            },
            {
                    {{"1R", "2R", "3R", "4R", "5R", "6R", "7R", "8R", "9R"}},
                    {{"1S", "2S", "3S", "4S", "5S", "6S", "7S", "8S", "9S"}},
                    {{"1T", "2T", "3T", "4T", "5T", "6T", "7T", "8T", "9T"}}
            }
    };

    public String[] getDineropublico() {
        return dineropublico;
    }

    public void setDineropublico(String[] dineropublico) {
        this.dineropublico = dineropublico;
    }

    public String[] getDineroprivado() {
        return dineroprivado;
    }

    public void setDineroprivado(String[] dineroprivado) {
        this.dineroprivado = dineroprivado;
    }

    public String[] getPrivado() {
        return privado;
    }

    public void setPrivado(String[] privado) {
        this.privado = privado;
    }

    public String[] getPublico() {
        return publico;
    }

    public void setPublico(String[] publico) {
        this.publico = publico;
    }

    public String[] getPaispublico() {
        return paispublico;
    }

    public void setPaispublico(String[] paispublico) {
        this.paispublico = paispublico;
    }

    public String[] getPaisprivado() {
        return paisprivado;
    }

    public void setPaisprivado(String[] paisprivado) {
        this.paisprivado = paisprivado;
    }

    public String[][][][] getAsientosPublicos2() {
        return asientosPublicos2;
    }

    public void setAsientosPublicos2(String[][][][] asientosPublicos2) {
        this.asientosPublicos2 = asientosPublicos2;
    }

    public String[][][][] getAsientosPublicos3() {
        return asientosPublicos3;
    }

    public void setAsientosPublicos3(String[][][][] asientosPublicos3) {
        this.asientosPublicos3 = asientosPublicos3;
    }

    public String[][][][] getAsientosPrivados2() {
        return asientosPrivados2;
    }

    public void setAsientosPrivados2(String[][][][] asientosPrivados2) {
        this.asientosPrivados2 = asientosPrivados2;
    }

    public String[][][][] getAsientosPrivados3() {
        return asientosPrivados3;
    }

    public void setAsientosPrivados3(String[][][][] asientosPrivados3) {
        this.asientosPrivados3 = asientosPrivados3;
    }

    public String[][][][] getAsientosPublicos() {
        return asientosPublicos;
    }

    public void setAsientosPublicos(String[][][][] asientosPublicos) {
        this.asientosPublicos = asientosPublicos;
    }

    public String[][][][] getAsientosPrivados() {
        return asientosPrivados;
    }

    public void setAsientosPrivados(String[][][][] asientosPrivados) {
        this.asientosPrivados = asientosPrivados;
    }

    public String[] getAeropuertosPublicos() {
        return aeropuertosPublicos;
    }

    public void setAeropuertosPublicos(String[] aeropuertosPublicos) {
        this.aeropuertosPublicos = aeropuertosPublicos;
    }

    public String[] getAeropuertosPrivados() {
        return aeropuertosPrivados;
    }

    public void setAeropuertosPrivados(String[] aeropuertosPrivados) {
        this.aeropuertosPrivados = aeropuertosPrivados;
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
}