class Solution {
    public int[] solution(String[] park, String[] routes) {
        // S의 위치를 찾는다.
        int[] start = new int[2];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[i].length(); j++) {
                if (park[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }

        // routes를 순회하며 각각의 방향에 따라 이동한다.
        for (int i = 0; i < routes.length; i++) {
            int[] dir = new int[2];
            String[] route = routes[i].split(" ");
            loop:
            switch (route[0]) {
                case "E":
                    dir[1] = route[1].charAt(0) - '0';
                    int[] tmp = start.clone();
                    for (int j = 0; j < dir[1]; j++) {
                        int[] next = new int[2];
                        next[0] = tmp[0];
                        next[1] = tmp[1] + 1;
                        // 이동할수없다면 이전 위치를 반환한다.
                        // 도착지점만이 아니라 가는길에 X가 있으면 이동할 수 없다.
                        if (next[0] < 0 || next[0] >= park.length || next[1] < 0 || next[1] >= park[0].length() || park[next[0]].charAt(next[1]) == 'X') {
                            tmp[0] = start[0];
                            tmp[1] = start[1];
                            break loop;
                        }
                        // 이동한다.
                        tmp[0] = next[0];
                        tmp[1] = next[1];
                    }
                    start[0] = tmp[0];
                    start[1] = tmp[1];
                    break;
                case "W":
                    dir[1] = route[1].charAt(0) - '0';
                    tmp = start.clone();
                    for (int j = 0; j < dir[1]; j++) {
                        int[] next = new int[2];
                        next[0] = tmp[0];
                        next[1] = tmp[1] - 1;
                        // 이동할수없다면 이전 위치를 반환한다.
                        // 도착지점만이 아니라 가는길에 X가 있으면 이동할 수 없다.
                        if (next[0] < 0 || next[0] >= park.length || next[1] < 0 || next[1] >= park[0].length() || park[next[0]].charAt(next[1]) == 'X') {
                            tmp[0] = start[0];
                            tmp[1] = start[1];
                            break loop;
                        }
                        // 이동한다.
                        tmp[0] = next[0];
                        tmp[1] = next[1];
                    }
                    start[0] = tmp[0];
                    start[1] = tmp[1];
                    break;
                case "S":
                    dir[0] = route[1].charAt(0) - '0';
                    tmp = start.clone();
                    for (int j = 0; j < dir[0]; j++) {
                        int[] next = new int[2];
                        next[0] = tmp[0]+1;
                        next[1] = tmp[1];
                        // 이동할수없다면 이전 위치를 반환한다.
                        // 도착지점만이 아니라 가는길에 X가 있으면 이동할 수 없다.
                        if (next[0] < 0 || next[0] >= park.length || next[1] < 0 || next[1] >= park[0].length() || park[next[0]].charAt(next[1]) == 'X') {
                            tmp[0] = start[0];
                            tmp[1] = start[1];
                            break loop;
                        }
                        // 이동한다.
                        tmp[0] = next[0];
                        tmp[1] = next[1];
                    }
                    start[0] = tmp[0];
                    start[1] = tmp[1];
                    break;
                case "N":
                    dir[0] = route[1].charAt(0) - '0';
                    tmp = start.clone();
                    for (int j = 0; j < dir[0]; j++) {
                        int[] next = new int[2];
                        next[0] = tmp[0] - 1;
                        next[1] = tmp[1] ;
                        // 이동할수없다면 이전 위치를 반환한다.
                        // 도착지점만이 아니라 가는길에 X가 있으면 이동할 수 없다.
                        if (next[0] < 0 || next[0] >= park.length || next[1] < 0 || next[1] >= park[0].length() || park[next[0]].charAt(next[1]) == 'X') {
                            tmp[0] = start[0];
                            tmp[1] = start[1];
                            break loop;
                        }
                        // 이동한다.
                        tmp[0] = next[0];
                        tmp[1] = next[1];
                    }
                    start[0] = tmp[0];
                    start[1] = tmp[1];
                    break;
            }
            
        }


        return start;
    }
}