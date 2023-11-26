package ps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main2 {
    private static int ans = 0;
    private static int M, N;
    private static int[] dx = {1, -1, 0, 0};
    private static int[] dy = {0, 0, 1, -1};

    private static int[][] board;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ArrayDeque<P> dequeRipped = new ArrayDeque<>();

        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        board = new int[N][M];

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                board[i][j] = Integer.parseInt(st.nextToken());
                if (board[i][j] == 1) {
                    dequeRipped.add(new P(i, j));
                }
            }
        }

        while (!dequeRipped.isEmpty()) {

            P cur = dequeRipped.pollFirst();

            for (int i = 0; i < 4; i++) {
                int nx = cur.x + dx[i];
                int ny = cur.y + dy[i];

                if (nx < 0 || ny < 0 || nx >= N || ny >= M) continue;
                if (board[nx][ny] != 0) continue;

                board[nx][ny] = board[cur.x][cur.y] + 1;
                dequeRipped.addLast(new P(nx, ny));
            }
        }

        for (int[] ints : board) {
            for (int i : ints) {
                if (i == 0){
                    System.out.println(-1);
                    return;
                }
                ans = Math.max(i, ans);
            }
        }

        System.out.println(ans - 1);
    }

    private static class P {
        int x, y;

        public P(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
