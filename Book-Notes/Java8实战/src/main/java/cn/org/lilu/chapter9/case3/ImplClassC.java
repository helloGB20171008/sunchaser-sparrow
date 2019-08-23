package cn.org.lilu.chapter9.case3;

import cn.org.lilu.chapter9.case1.InterfaceA;
import cn.org.lilu.chapter9.case1.InterfaceB;

/**
 * @Auther: lilu
 * @Date: 2019/8/23
 * @Description: 实现类ImplClassC继承了ImplClassD实现类，并实现了InterfaceA和InterfaceB接口
 */
public class ImplClassC extends ImplClassD implements InterfaceA, InterfaceB {
    /**
     * ImplClassC类中未重写hello方法
     * ImplClassD类中重写了hello方法
     * 根据原则第一条：类或父类中声明的方法的优先级高于任何声明为默认方法的优先级。
     *
     * 故输出如下
     *
     * hello implements D
     */
    public static void main(String[] args) {
        new ImplClassC().hello();
    }
}
