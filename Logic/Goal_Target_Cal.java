//목표 칼로리와 섭취 칼로리 비교
public class CaloriesComparison
{
    public CaloriesComparison(){}

    //섭취 칼로리와 목표 섭취 칼로리 비교
    public boolean ComparisonIntakeCalories(MealTargetReq mealTargetDto, AddRecordReqDto recordDto){
        필요 변수(총 섭취 칼로리, 목표 섭취 칼로리)
        int cal = recordDto.calories;
        int targetCal = mealTargetDto.targetCalories;
        
        //최대 섭취 칼로리(목표 섭취 칼로리의 +10%)
        float maxRate = targetCal * 1.1f;
        
        //최소 섭취 칼로리(목표 섭취 칼로리의 -10%)
        float minRate = targetCal * 0.9f;

        if(cal > maxRate || cal < minRate){    //목표 달성률 110% 초과 or 목표 달성률 90% 미만
            return false;
        }
        else{  //목표 달성률 110% 이하 & 90% 이상
            return true;
        }
    }
}