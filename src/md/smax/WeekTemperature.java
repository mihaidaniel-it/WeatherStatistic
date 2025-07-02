package md.smax;

public class WeekTemperature {
    public static void main(String[] args) {
//        Создаем двухмерный массив с данными о погоде
        double[][] weekTemperature = {
                {18.5, 24.1, 20.3}, // Пн
                {17.8, 23.5, 21.0}, // Вт
                {19.0, 25.2, 22.3}, // Ср
                {20.1, 26.4, 23.1}, // Чт
                {18.3, 24.7, 21.5}, // Пт
                {17.9, 22.5, 20.0}, // Сб
                {16.8, 21.9, 19.3} // Вс
        };

//        Рассчет средней температуры по дням
        String[] weekDays = {"Понедельник", "Вторник", "Среда", "Четверг", "Пятница", "Суббота", "Воскресенье"};

        for (int i = 0; i < weekTemperature.length; i++) {
            double sumDay = 0;
            for (int j = 0; j < weekTemperature[i].length; j++) {
                sumDay += weekTemperature[i][j];
            }
            double averageDay = sumDay / weekTemperature[i].length;
            System.out.println("В " + weekDays[i] + " средняя температура - " + averageDay);
        }

//        Расчет средней температуры по утрам/днем/вечером в течении недели
        double sum = 0;
        for (int el = 0; el < weekTemperature.length; el++) {
            sum += weekTemperature[el][0];
        }
        double middleMorningTemperature = sum / 7;
        System.out.println("Средния температура по утра - " + middleMorningTemperature);

        double sum1 = 0;
        for (int el = 0; el < weekTemperature.length; el++) {
            sum1 += weekTemperature[el][1];
        }
        double middleDayTemperature = sum1 / 7;
        System.out.println("Средния температура днем - " + middleDayTemperature);

        double sum2 = 0;
        for (int el = 0; el < weekTemperature.length; el++) {
            sum2 += weekTemperature[el][2];
        }
        double middleNightemperature = sum2 / 7;
        System.out.println("Средняя температура ночью - " +  middleNightemperature);

//        Нахождение максимальной и минимальной теспературы за неделю
        double minTemperature = weekTemperature[0][0];
        double maxTemperature = weekTemperature[0][0];

        for (int i = 0; i < weekTemperature.length; i++) {
            for (int j = 0; j < weekTemperature[i].length; j++) {
                if (weekTemperature[i][j] < minTemperature) {
                    minTemperature = weekTemperature[i][j];
                }

                if (weekTemperature[i][j] > maxTemperature) {
                    maxTemperature = weekTemperature[i][j];
                }
            }
        }
        System.out.println("Самая низкая температура за неделю - " + minTemperature);
        System.out.println("Самая высокая температура за неделю - " + maxTemperature);
    }
}
