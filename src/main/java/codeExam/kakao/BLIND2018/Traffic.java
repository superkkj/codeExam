package codeExam.kakao.BLIND2018;

import java.text.SimpleDateFormat;

public class Traffic {

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
