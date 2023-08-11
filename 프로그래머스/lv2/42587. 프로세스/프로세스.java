import java.util.*;
class Solution{
    public int solution(int[] priorities, int location) {
        int answer = 0;
        LinkedList<Integer> list = new LinkedList<>();
        int prior;
        int first;

        for (int num :
                priorities) {
            list.add(num);
        }

        prior = Collections.max(list);    

        while (!list.isEmpty()) {
            first = list.removeFirst();
            if (first >= prior) {
                if(!list.isEmpty()){
                    prior = Collections.max(list);   
                }
                answer++;
                if (location == 0) {
                    break;
                } else {
                    location--;
                }
            } else {
                list.addLast(first);
                if (location == 0) {
                    location = list.size() - 1;
                } else {
                    location--;
                }
            }
        }
        return answer;
    }
}

// 푸는방법은 머릿속으로 생각했는데 구현을 하는데 어려움이 있어서 찾아보고 했다.
// 일단 시간이 좀 지난후에 다시 생각대로 구현할수있는지 다시해보자