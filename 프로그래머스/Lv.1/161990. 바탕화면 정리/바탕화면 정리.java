import java.util.Arrays;

class Solution {
    public int[] solution(String[] wallpaper) {
        int[] answer = {};
        int lux = -1;
        int luy = -1;
        int rdx = -1;
        int rdy = -1;

        for (int i = 0; i < wallpaper.length; i++) {
            for (int j = 0; j < wallpaper[i].length(); j++) {
                if (wallpaper[i].charAt(j) == '#') {
                    if (lux == -1) {
                        lux = i;
                        luy = j;
                    }
                    if (lux > i) {
                        lux = i;
                    }
                    if (luy > j) {
                        luy = j;
                    }


                    if (rdx <= i) {
                        rdx = i + 1;
                    }

                    if (rdy <= j) {
                        rdy = j + 1;
                    }

                }
            }
        }
        if (rdx > wallpaper.length) {
            rdx = wallpaper.length;
        }
        if (rdy > wallpaper[0].length()) {
            rdy = wallpaper[0].length();
        }
        answer = new int[]{lux, luy, rdx, rdy};
        return answer;
    }
}