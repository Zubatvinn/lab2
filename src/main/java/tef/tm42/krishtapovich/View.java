package tef.tm42.krishtapovich;

class View {
    // Text's constants
    public static final String INI_DATA = "Угадайте число в диапазоне [";
    public static final String SPACE = " ";
    public static final String INI_DATA_P2 = "] = ";
    public static final String WRONG_TYPE_DATA = "Неправильный ввод.";
    public static final String WRONG_INPUT_INT_DATA_LESS = "Не попали в диапазон, попробуйте число побольше.";
    public static final String WRONG_INPUT_INT_DATA_MORE = "Не попали в диапазон, попробуйте число поменьше.";
    public static final String OUR_INT = "Вы угадали число ";
    public static final String YOUR_WAY = "Ваши старания = ";
    public static final String TRIES = "Количество попыток = ";
    public static final String ACCURACY = "Точность = ";
    public static final String PERCENT = "%";


    public void printMessage(String message) {
        System.out.println(message);
    }

    public String concatenationString(String... message) {
        StringBuilder concatString = new StringBuilder();
        for (String v : message) {
            concatString = concatString.append(v);
        }
        return new String(concatString);
    }
}
