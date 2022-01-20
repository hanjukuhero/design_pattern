package cn.qinyi.simplefactory;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/1/20
 * @version：1.0
 * @slogan：打铁还需自身硬
 */
public class OperationDiv extends Operation {
    @Override
    double getResult() throws Exception {
        if (numberB == 0) {
            throw new Exception("被除数不能为0");
        }
        return numberA / numberB;
    }
}
