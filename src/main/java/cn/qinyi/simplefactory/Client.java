package cn.qinyi.simplefactory;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/1/20
 * @version：1.0
 * @slogan：打铁还需自身硬
 */
public class Client {
    public static void main(String[] args) {
        Operation operation = OperationFactory.createOperation("/");
        operation.setNumberA(12);
        operation.setNumberB(0);
        try {
            System.out.println(operation.getResult());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
