import java.util.Arrays;

public class Hospital {

    public static float[] generatePatientsTemperatures(int patientsCount) {

        //TODO: напишите метод генерации массива температур пациентов
        double min = 32.0;
        double max = 40.0;
        float[] patientsTemperatures = new float[patientsCount];

        for (int i = 0; i < patientsTemperatures.length; i++) {
            patientsTemperatures[i] = (float) ((Math.random() * (max - min)) + min);
            patientsTemperatures[i] = (float) (Math.round(patientsTemperatures[i] * 10.0) / 10.0);
        }
        return patientsTemperatures;
    }

    public static String getReport(float[] temperatureData) {
        /*
        TODO: Напишите код, который выводит среднюю температуру по больнице,количество здоровых пациентов,
            а также температуры всех пациентов.
        */
        String regex = "[^0-9.\\s]";
        int healthyPatientsCounts = 0;
        float average = 0;

        for (float temperatureDatum : temperatureData) {
            average = average + temperatureDatum;
            if (temperatureDatum >= 36.2F && temperatureDatum <= 36.9F) {
                healthyPatientsCounts++;
            }
        }

        return  "Температуры пациентов: " + Arrays.toString(temperatureData).replaceAll(regex, "") +
                        "\nСредняя температура: " +
                        (Math.round((average / temperatureData.length) * 100.0) / 100.0) +
                        "\nКоличество здоровых: " + healthyPatientsCounts;
    }
}
