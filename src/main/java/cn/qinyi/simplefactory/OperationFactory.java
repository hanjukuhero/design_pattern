package cn.qinyi.simplefactory;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/1/20
 * @version：1.0
 * @slogan：打铁还需自身硬
 */
public class OperationFactory {
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
            case "/":
                operation = new OperationDiv();
                break;
            default:
                operation = new Operation();
                break;
        }
        return operation;
    }
}
