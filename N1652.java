import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class N1652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine()); //가로 세로 수 입력
        String[][] arr = new String[n][n]; // 누울자리, 짐 있는 자리 넣기 위한 이중 배열
        String w = ""; // 한 줄마다 누울 자리가 있는지 파악하기 위해 만든 변수
        int count = 0; // 가로 또는 세로에 누울 수 있는 자리를 세기 위한 변수

        for (int i = 0; i < n; i++) { // 비어있는 자리, 짐 있는자리 입력 받음
            arr[i] = br.readLine().split("");
        }

        // 가로
        for (int i = 0; i < n; i++) { // 가로 한줄씩 돌리면서
            for (int j = 0; j < n; j++) { // 한 자리마다
                if (arr[i][j].equals(".")) { // 그 자리가 "."면
                    w = w.concat(arr[i][j]); // 한줄 씩 파악하기 위한 변수에 합쳐준다
                } else if (arr[i][j].equals("X")) { // 그 자리가 "X"면
                    if (w.contains("..")) { // 파악하기 위한 변수에 ".."이 포함되어 있다면
                        count++; // 누울자리 세는 변수 + 1
                    }
                    w = ""; //파악 하는 변수 비워준다
                }
            }
            if (w.contains("..")) { // 한줄에 "X"가 없다면
                count++; // 누울자리 세는 변수 + 1
            }

            w = ""; //누울자리 파악하는 변수 비워주기
        }

        // 가로 결과 출력
        System.out.print(count + " ");

        count = 0; // 누울자리 세는 변수 초기화
        for (int i = 0; i < n; i++) { // 가로 한줄씩 돌리면서
            for (int j = 0; j < n; j++) { // 한 자리마다
                if (arr[j][i].equals(".")) { // 그 자리가 "."면
                    w = w.concat(arr[j][i]); // 한줄 씩 파악하기 위한 변수에 합쳐준다
                } else if (arr[j][i].equals("X")) {// 그 자리가 "X"면
                    if (w.contains("..")) { // 파악하기 위한 변수에 ".."이 포함되어 있다면
                        count++; // 누울자리 세는 변수 + 1
                    }
                    w = ""; //파악 하는 변수 비워준다
                }
            }

            if (w.contains("..")) { // 한줄에 "X"가 없다면
                count++;  // 누울자리 세는 변수 + 1
            }

            w = ""; //누울자리 파악하는 변수 비워주기
        }

        // 세로 결과 출력
        System.out.println(count);

    }
}
