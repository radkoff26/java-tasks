package ru.mail.polis.homework.simple;


/**
 * Возможно вам понадобится класс Math с его методами. Например, чтобы вычислить квадратный корень, достаточно написать
 * Math.sqrt(1.44)
 * Чтобы увидеть все методы класса Math, достаточно написать Math. и среда вам сама покажет возможные методы.
 * Для просмотра подробной документации по выбранному методу нажмите Ctrl + q
 */
public class IntegerAdvancedTask {

    private static final double EPS = 1e-10;

    // Function-helpers
    public static char getDigitInHex(int n) {
        char digitInHex = Character.forDigit(n, 16);
        if (n >= 10) {
            return Character.toUpperCase(digitInHex);
        } else {
            return digitInHex;
        }
    }

    public static boolean isOnTheGrass(int x, int y, int grassX, int grassY) {
        return x >= grassX && y >= grassY;
    }

    /**
     * Сумма первых n-членов геометрической прогрессии с первым элементом a и множителем r
     * a + aq + aq^2 + ... + aq^(n-1)
     * <p>
     * Пример: (1, 2, 3) -> 7
     */
    public static long progression(int a, double q, int n) {
        double result = 0;
        for (int i = 0; i < n; i++) {
            result += a * Math.pow(q, i);
        }
        return (long) result;
    }

    /**
     * Гусеница ползает по столу квадратами по часовой стрелке. За день она двигается следующим образом:
     * сначала наверх на up, потом направо на right. Ночью она двигается вниз на down и налево на left.
     * Сколько суток понадобится гусенице, чтобы доползти до поля с травой?
     * Считаем, что на каждой клетке с координатами >= grassX или >= grassY находится трава
     * Если она этого никогда не сможет сделать, Верните число Integer.MAX_VALUE;
     * Пример: (10, 3, 5, 5, 20, 11) -> 2
     */
    public static int snake(int up, int right, int down, int left, int grassX, int grassY) {
        return 0;
    }

    /**
     * Дано число n в 10-ном формате и номер разряда order.
     * Выведите цифру стоящую на нужном разряде для числа n в 16-ом формате
     * Нельзя пользоваться String-ами
     * Пример: (454355, 2) -> D
     */

    public static char kDecimal(int n, int order) {
        int currentOrder = 1;
        while (currentOrder < order) {
            n /= 16;
            currentOrder++;
        }
        int nthOrder = n % 16;
        return getDigitInHex(nthOrder);
    }

    /**
     * Дано число в 10-ном формате.
     * Нужно вывести номер минимальной цифры для числа в 16-ном формате. Счет начинается справа налево,
     * выводим номер первой минимальной цифры (если их несколько)
     * Нельзя пользоваться String-ами
     * (6726455) -> 2
     */
    public static byte minNumber(long a) {
        int minDigit = (int) (a % 16);
        int currentDigit;

        a /= 16;

        byte minDigitOrder = 1;
        byte currentOrder = 2;

        while (a > 0) {
            currentDigit = (int) (a % 16);
            if (currentDigit < minDigit) {
                minDigit = currentDigit;
                minDigitOrder = currentOrder;
            }
            a /= 16;
            currentOrder++;
        }

        return minDigitOrder;
    }

}
