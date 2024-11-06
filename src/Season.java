public enum Season {
    WINTER(-10),
    SPRING(10),
    SUMMER(25),
    AUTUMN(5);

    private final int averageTemperature;

    // Константа для определения "теплого" или "холодного" времени года
    private static final int WARM_THRESHOLD = 20;

    // Конструктор принимает среднюю температуру
    Season(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    // Геттер для средней температуры
    public int getAverageTemperature() {
        return averageTemperature;
    }

    // Метод getDescription для получения описания сезона
    public String getDescription() {
        return (this == SUMMER) ? "Теплое время года" : "Холодное время года";
    }

    // Метод, возвращающий сообщение о любви к сезону
    public static void printSeasonLoveMessage(Season season) {
        switch (season) {
            case WINTER:
                System.out.println("Я люблю зиму");
                break;
            case SPRING:
                System.out.println("Я люблю весну");
                break;
            case SUMMER:
                System.out.println("Я люблю лето");
                break;
            case AUTUMN:
                System.out.println("Я люблю осень");
                break;
        }
    }
}
