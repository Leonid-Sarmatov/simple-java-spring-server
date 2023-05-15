package org.example;

/**
 * Класс сообщения, которое сервер возвращает при запросе
 */
public class ParameterMessage {
    private String airHumidity;
    private String airTemperature;
    private String lightingBrightness;
    private String soilMoisture;

    public ParameterMessage(String airHumidity, String airTemperature,
                            String lightingBrightness, String soilMoisture) {
        this.airHumidity = airHumidity;
        this.airTemperature = airTemperature;
        this.lightingBrightness = lightingBrightness;
        this.soilMoisture = soilMoisture;
    }

    public String getLightingBrightness() {
        return lightingBrightness;
    }

    public String getAirHumidity() {
        return airHumidity;
    }

    public String getAirTemperature() {
        return airTemperature;
    }

    public String getSoilMoisture() {
        return soilMoisture;
    }

    public void setLightingBrightness(String lightingBrightness) {
        this.lightingBrightness = lightingBrightness;
    }

    public void setAirHumidity(String airHumidity) {
        this.airHumidity = airHumidity;
    }

    public void setAirTemperature(String airTemperature) {
        this.airTemperature = airTemperature;
    }

    public void setSoilMoisture(String soilMoisture) {
        this.soilMoisture = soilMoisture;
    }
}
