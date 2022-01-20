package cn.qinyi.simplefactory;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/1/20
 * @version：1.0
 * @slogan：打铁还需自身硬
 */
public class OperationSub extends Operation {
    @Override
    double getResult() {
        return numberA - numberB;
    }
}
