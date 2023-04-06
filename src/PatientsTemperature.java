import java.text.DecimalFormat;

public class PatientsTemperature {

    public static void avgTemperature() {

        final float MAX_TEMP = 40F;
        final float MIN_TEMP = 32F;
        final float MAX_HEALTHY_TEMP = 36.9F;
        final float MIN_HEALTHY_TEMP = 36.2F;
        final int PATIENT_AMOUNT = 30;
        float tempCounter = 0;
        int healthyCounter = 0;
        DecimalFormat df = new DecimalFormat();
        df.setMaximumFractionDigits(1);
        float[] patientsTemp = new float[PATIENT_AMOUNT];

        System.out.println("Температуры пациентов: ");
        for (int i = 0; i < PATIENT_AMOUNT; i++) {

            float patientsTemperature = (float) (32F + (Math.random() * (MAX_TEMP - MIN_TEMP)));

            if (patientsTemperature >= MIN_HEALTHY_TEMP && patientsTemperature <= MAX_HEALTHY_TEMP) {
                healthyCounter++;
            }
            patientsTemp[i] = patientsTemperature;
            tempCounter += patientsTemperature;

            System.out.print(df.format(patientsTemp[i]) + " | ");

        }

        System.out.println("\nСредняя температура по палате: " + tempCounter / PATIENT_AMOUNT);
        System.out.println("Здоровых пациентов: " + healthyCounter);

    }
}
