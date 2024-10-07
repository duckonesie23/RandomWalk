public class RandomWalk{
    public static void main(String[]args){
        int total = 0;
        for(int i = 0;i<50;i++){
            total += simulate();
        }
        double average = total/50;
        System.out.println(total+"\n"+average);
    }
    public static int step(){
        int num = (int)(Math.random()*2);
        if(num == 0){
            return 1;
        }else{
            return -1;
        }
    }
    public static int simulate(){
        double position = 4.5;
        int stepCount = 0;
        while(position > 0 && position <7){
            position += step();
            System.out.println(position + ", " + stepCount);
            stepCount++;
        }
        return stepCount;
    }
}