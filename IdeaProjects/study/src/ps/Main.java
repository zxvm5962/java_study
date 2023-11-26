package ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    private static int ans = 0;
    private static int M, N;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    private static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        for (int i = 0; i < N; i++) {
            loop :
            for (int j = 0; j < M; j++) {
                if (board[i][j] != 0) continue;

                boolean[][] visit = new boolean[N][M];
                ArrayDeque<Node> deque = new ArrayDeque<>();

                deque.addLast(new Node(i, j, 0));
                visit[i][j] = true;

                while (!deque.isEmpty()) {
                    Node cur = deque.pollFirst();

                    if (board[cur.x][cur.y] == 1) {
                        ans = Math.max(cur.distance, ans);
                        continue loop;
                    }

                    for (int k = 0; k < 4; k++) {
                        int nx = cur.x + dx[k];
                        int ny = cur.y + dy[k];

                        if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;

                        if (visit[nx][ny]) continue;
                        if (board[nx][ny] == -1) continue;

                        visit[nx][ny] = true;
                        deque.addLast(new Node(nx, ny, cur.distance + 1));
                    }
                }

                System.out.println(-1);
                return;

            }
        }

        System.out.println(ans);

    }

    private static class Node {
        int x, y;
        int distance;

        public Node(int x, int y, int distance) {
            this.x = x;
            this.y = y;
            this.distance = distance;
        }
    }
}

