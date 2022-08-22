package codeExam.kakao.BLIND2018;

import java.util.ArrayList;
import java.util.List;

public class solution {

    int solution(String[] lines) {

        int answer = 0;
        List<Traffic> trafficList = new ArrayList<Traffic>();
        for (String line : lines) {
            trafficList.add(new Traffic(line));
        }
        answer = getCountMax(trafficList, true, answer);
        answer = getCountMax(trafficList, false, answer);
       return answer;
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
