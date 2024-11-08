
package Aeropuertos;

public class aeropuerto {

    private String[] aeropuertosPublicos = { "El Dorado", "José María Córdova", "Alfonso Bonilla Aragón" };
    private String[] aeropuertosPrivados = { "Guaymaral", "Vanguardia", "Palonegro" };

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
                    { "Bogotá - Medellín", "Bogotá - Cali", "Bogotá - Barranquilla" },
                    { "Bogotá - Cartagena", "Bogotá - Bucaramanga", "Bogotá - Pereira" },
                    { "Bogotá - Montería", "Bogotá - San Andrés", "Bogotá - Villavicencio" }
            },
            {
                    { "Medellín - Bogotá", "Medellín - Cali", "Medellín - Barranquilla" },
                    { "Medellín - Cartagena", "Medellín - Bucaramanga", "Medellín - Pereira" },
                    { "Medellín - Montería", "Medellín - San Andrés", "Medellín - Villavicencio" }
            },
            {
                    { "Cali - Bogotá", "Cali - Medellín", "Cali - Barranquilla" },
                    { "Cali - Cartagena", "Cali - Bucaramanga", "Cali - Pereira" },
                    { "Cali - Montería", "Cali - San Andrés", "Cali - Villavicencio" }
            }
    };

    private String[][][] vuelosPrivados = {
            {
                    { "Guaymaral - Medellín", "Guaymaral - Cali", "Guaymaral - Barranquilla" },
                    { "Guaymaral - Cartagena", "Guaymaral - Bucaramanga", "Guaymaral - Pereira" },
                    { "Guaymaral - Montería", "Guaymaral - San Andrés", "Guaymaral - Villavicencio" }
            },
            {
                    { "Vanguardia - Bogotá", "Vanguardia - Cali", "Vanguardia - Barranquilla" },
                    { "Vanguardia - Cartagena", "Vanguardia - Bucaramanga", "Vanguardia - Pereira" },
                    { "Vanguardia - Montería", "Vanguardia - San Andrés", "Vanguardia - Villavicencio" }
            },
            {
                    { "Palonegro - Bogotá", "Palonegro - Medellín", "Palonegro - Barranquilla" },
                    { "Palonegro - Cartagena", "Palonegro - Bucaramanga", "Palonegro - Pereira" },
                    { "Palonegro - Montería", "Palonegro - San Andrés", "Palonegro - Villavicencio" }
            }
    };

    String[][][][][] asientosPublicos = {
            {
                    {{{"1A 2A 3A", "1B 2B 3B", "1C 2C 3C"}}},
                    {{{"1D 2D 3D", "1E 2E 3E", "1F 2F 3F"}}},
                    {{{"1G 2G 3G", "1H 2H 3H", "1I 2I 3I"}}}
            },
            {
                    {{{"1J 2J 3J", "1K 2K 3K", "1L 2L 3L"}}},
                    {{{"1M 2M 3M", "1N 2N 3N", "1O 2O 3O"}}},
                    {{{"1P 2P 3P", "1Q 2Q 3Q", "1R 2R 3R"}}}
            },
            {
                    {{{"1S 2S 3S", "1T 2T 3T", "1U 2U 3U"}}},
                    {{{"1V 2V 3V", "1W 2W 3W", "1X 2X 3X"}}},
                    {{{"1Y 2Y 3Y", "1Z 2Z 3Z", "1A 2A 3A"}}}
            }
    };

    String[][][][][] asientosPrivados = {
            {
                    {{{"1A 2A 3A", "1B 2B 3B", "1C 2C 3C"}}},
                    {{{"1D 2D 3D", "1E 2E 3E", "1F 2F 3F"}}},
                    {{{"1G 2G 3G", "1H 2H 3H", "1I 2I 3I"}}}
            },
            {
                    {{{"1J 2J 3J", "1K 2K 3K", "1L 2L 3L"}}},
                    {{{"1M 2M 3M", "1N 2N 3N", "1O 2O 3O"}}},
                    {{{"1P 2P 3P", "1Q 2Q 3Q", "1R 2R 3R"}}}
            },
            {
                    {{{"1S 2S 3S", "1T 2T 3T", "1U 2U 3U"}}},
                    {{{"1V 2V 3V", "1W 2W 3W", "1X 2X 3X"}}},
                    {{{"1Y 2Y 3Y", "1Z 2Z 3Z", "1A 2A 3A"}}}
            }
    };



    public String[][][][][] getAsientosPublicos() {
        return asientosPublicos;
    }

    public void setAsientosPublicos(String[][][][][] asientosPublicos) {
        this.asientosPublicos = asientosPublicos;
    }

    public String[][][][][] getAsientosPrivados() {
        return asientosPrivados;
    }

    public void setAsientosPrivados(String[][][][][] asientosPrivados) {
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