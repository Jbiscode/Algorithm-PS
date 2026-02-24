import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

/*
2026.02.24 풀이 (https://www.acmicpc.net/problem/23309)
 */
public class Main {
  static CircularLinkedList linkedList;
  static int[] initArr;
  static StringBuilder sb;
  public static void main(String[] args) throws Exception{
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    linkedList = new CircularLinkedList();
    sb = new StringBuilder();
    
    st = new StringTokenizer(br.readLine());

    int N = Integer.parseInt(st.nextToken());
    int M = Integer.parseInt(st.nextToken());

    initArr = new int[N];

    st = new StringTokenizer(br.readLine());
    for (int i = 0; i < N; i++) {
      initArr[i] = Integer.parseInt(st.nextToken());
    }

    linkedList.init(initArr);

    for (int i = 0; i < M; i++) {
      st = new StringTokenizer(br.readLine());
      int idx,data;
      String command = st.nextToken();
      if (command.equals("BP")) {
        idx = Integer.parseInt(st.nextToken());
        data = Integer.parseInt(st.nextToken());
        linkedList.addPrev(idx, data);
      }else if(command.equals("BN")){
        idx = Integer.parseInt(st.nextToken());
        data = Integer.parseInt(st.nextToken());
        linkedList.addNext(idx, data);
      }else if(command.equals("CP")){
        idx = Integer.parseInt(st.nextToken());
        linkedList.removePrev(idx);
      }else if(command.equals("CN")){
        idx = Integer.parseInt(st.nextToken());
        linkedList.removeNext(idx);
      }
    }

    bw.write(sb.toString());
    bw.flush();
  }

  static class CircularLinkedList {
    private Node[] memory = new Node[1000001];

    public CircularLinkedList() {
    }

    void init(int[] startArr){
      for (int i = 0; i < startArr.length; i++) {
        Node newNode = new Node(startArr[i]);
        memory[startArr[i]] = newNode;
    }

      for (int i = 0; i < startArr.length - 1; i++) {
          Node frontNode = memory[startArr[i]];
          Node backNode = memory[startArr[i+1]];

          frontNode.next = backNode;
          backNode.prev = frontNode;
      }

      Node firstNode = memory[startArr[0]];
      Node lastNode = memory[startArr[startArr.length-1]];
      firstNode.prev = lastNode;
      lastNode.next = firstNode;
    }

    void addPrev(int idx, int data){
      Node fNode = memory[idx];

      sb.append(fNode.prev.data).append('\n');

      Node newNode = new Node(data);
      memory[data] = newNode;

      newNode.prev = fNode.prev;
      newNode.next = fNode;

      fNode.prev.next = newNode;
      fNode.prev = newNode;
    }


    void addNext(int idx, int data){
      Node fNode = memory[idx];

      sb.append(fNode.next.data).append('\n');

      Node newNode = new Node(data);
      memory[data] = newNode;

      newNode.prev = fNode;
      newNode.next = fNode.next;

      fNode.next.prev = newNode;
      fNode.next = newNode;

    }


    void removePrev(int idx){
      Node fNode = memory[idx];

      memory[fNode.prev.data] = null;
      sb.append(fNode.prev.data).append('\n');

      fNode.prev.prev.next = fNode;
      fNode.prev = fNode.prev.prev;
        
    }

    void removeNext(int idx){
      Node fNode = memory[idx];

      memory[fNode.next.data] = null;
      sb.append(fNode.next.data).append('\n');

      fNode.next = fNode.next.next;
      fNode.next.prev = fNode;

    }
  }

  // 노스 클래스
  static class Node{
    int data;
    Node prev;
    Node next;

    public Node(int data) {
      this.data = data;
      this.prev = null;
      this.next = null;
    }
  }
}