public class Main {
    public static void main(String[] args) {
        // Любимое время года
        Season favoriteSeason = Season.SUMMER;
        System.out.println("Мое любимое время года: " + favoriteSeason);
        System.out.println("Средняя температура: " + favoriteSeason.getAverageTemperature() + "°C");
        System.out.println("Описание: " + favoriteSeason.getDescription());

        // Тестируем метод с оператором switch
        Season.printSeasonLoveMessage(favoriteSeason);

        // Цикл для вывода информации обо всех временах года
        System.out.println("\nИнформация обо всех временах года:");
        for (Season season : Season.values()) {
            System.out.printf("%s (средняя температура: %d°C) - %s%n",
                    season, season.getAverageTemperature(), season.getDescription());
        }
    }
}
