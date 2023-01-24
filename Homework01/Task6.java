//6*.Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
//Если общего префикса нет, вернуть пустую строку "".

public class Task6 {
    public static void main(String[] args) {
        String[] words = new String[]{"qwerty", "qweroop", "qwety", "qwe455", "qwerttt21"};
        String commonPref = words[0];

        for (int i = 1; i < words.length; i++) {
            String cur = words[i];
            int j = 0;
            int lastCommon = 0;
            while (j < commonPref.length() && j < cur.length()) {
                if (commonPref.charAt(j) == cur.charAt(j)) {
                    lastCommon++;
                } else break;
                j++;
            }
            commonPref = commonPref.substring(0, lastCommon);
        }
        System.out.println(commonPref);
    }
}