package java1.design.pattern.state;

/**
 * @Author zhaojw
 * @Date 2017/12/10 17:25
 */
public class ForenoonState implements State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour()<12){
            System.out.println("当前时间"+work.getHour()+"点，上午工作，精神百倍");
        }else{
            work.setState(new NoonState());//超过三点，则转中午工作状态
            work.writeProgram();
        }
    }
}
