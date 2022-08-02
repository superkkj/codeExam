package codeExam.kakao.BLIND2018;

import codeExam.codeExam.CodeExamApplication;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

@SpringBootTest(classes = CodeExamApplication.class)

class trafficTest {


    private String[] input1 = {"2016-09-15 01:00:04.001 2.0s", "2016-09-15 01:00:07.000 2s"};
    private String[] input2 = {"2016-09-15 01:00:04.002 2.0s", "2016-09-15 01:00:07.000 2s"};
    private String[] input3 = {
            "2016-09-15 20:59:57.421 0.351s",
            "2016-09-15 20:59:58.233 1.181s",
            "2016-09-15 20:59:58.299 0.8s",
            "2016-09-15 20:59:58.688 1.041s",
            "2016-09-15 20:59:59.591 1.412s",
            "2016-09-15 21:00:00.464 1.466s",
            "2016-09-15 21:00:00.741 1.581s",
            "2016-09-15 21:00:00.748 2.31s",
            "2016-09-15 21:00:00.966 0.381s",
            "2016-09-15 21:00:02.066 2.62s"
    };


    @Test
    void solution() {

        int answer = 0;
        List<Traffic> trafficList = new ArrayList<Traffic>();
        for (String line : input3) {
            trafficList.add(new Traffic(line));
        }
        answer = getCountMax(trafficList, true, answer);
        answer = getCountMax(trafficList, false, answer);
        System.out.println(answer);
    }

   //startSection에 startTime 넣은 구간의 최대 카운트를 answer에 넣고나 endTime넣은구간 최대 카운트를 넣어줌
    private int getCountMax(List<Traffic> trafficList, boolean isStart, int maxCount) {
        for (int i = 0; i < trafficList.size(); ++i) {
            int count = 0;
            long startSection = isStart ? trafficList.get(i).startTime : trafficList.get(i).endTime;
            long endSection = startSection + 1000;
            for (int j = 0; j < trafficList.size(); ++j) {
                if ((startSection <= trafficList.get(j).startTime && trafficList.get(j).startTime < endSection)
                 || (startSection <= trafficList.get(j).endTime && trafficList.get(j).endTime < endSection)
                 || (trafficList.get(j).startTime <= startSection && endSection <= trafficList.get(j).endTime))
                {
                    count++;
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}

   //시작시간과 끝 시간을 분리해 준다.
    class Traffic {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss.SSS");
        long startTime;
        long endTime;
        float processingTime;

        Traffic(String line) {
            parseLog(line);
        }

        private void parseLog(String line) {
            String[] logs = line.split(" ");
            this.processingTime = Float.parseFloat(logs[2].split("s")[0]);
            try {
                this.endTime = dateFormat.parse(logs[0] + " " + logs[1]).getTime();
                this.startTime = endTime - (long) (processingTime * 1000) + 1;
            } catch (Exception e) {
                System.out.println("데이터 포맷 에러");
                e.printStackTrace();
            }
        }
    }
