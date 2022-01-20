package cn.qinyi.simplefactory;

import lombok.Setter;

/**
 * @description:
 * @author：yi.qin
 * @date：2022/1/20
 * @version：1.0
 * @slogan：打铁还需自身硬
 */
@Setter
public class Operation {
    /**
     * 操作数A
     */
    double numberA;

    /**
     * 操作数B
     */
    double numberB;

     double getResult() throws Exception {
         // 因为这个父类方法都要重写，所以直接返回0即可
         return 0;
     }

}
