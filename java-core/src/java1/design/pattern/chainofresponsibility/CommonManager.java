package java1.design.pattern.chainofresponsibility;

/**
 * @Author zhaojw
 * @Date 2017/12/12 22:05
 *
 * 经理
 *
 */
public class CommonManager extends Manager {

    public CommonManager(String name){
        super(name);
    }

    @Override
    public void resquestApplications(Request request) {
        if ("请假".equals(request.getRequestType())&&request.getNumber()<=2){
            System.out.println(name+":"+request.getRequestContent()+"数量"+request.getNumber()+"请假被批准");
        }else {
            if(superior!=null){
                superior.resquestApplications(request);
            }
        }
    }
}
