package com.jaiaxn.design.pattern.created.prototype;

import com.jaiaxn.design.pattern.created.prototype.bravo.AKaLi;
import com.jaiaxn.design.pattern.created.prototype.bravo.Bravo;
import com.jaiaxn.design.pattern.created.prototype.bravo.Jie;
import com.jaiaxn.design.pattern.created.prototype.bravo.KaiNan;

/**
 * @author: wang.jiaxin
 * @date: 2019年08月21日
 * @description: 原型模式
 **/
public class PrototypeDemoTest {
    public static void main(String[] args) {
        Bravo jie = new Jie();
        jie.setName("jie");
        BravoCache.bravoMap.put(jie.getName(),jie);

        Bravo kaiNan = new KaiNan();
        kaiNan.setName("kaiNan");
        BravoCache.bravoMap.put(kaiNan.getName(),kaiNan);

        Bravo aKaLi = new AKaLi();
        aKaLi.setName("aKaLi");
        BravoCache.bravoMap.put(aKaLi.getName(),aKaLi);

        Bravo cloneJie = BravoCache.getBravo("jie");
        cloneJie.play();

        Bravo cloneKaiNan = BravoCache.getBravo("kaiNan");
        cloneKaiNan.play();

        Bravo cloneAKaLi = BravoCache.getBravo("aKaLi");
        cloneAKaLi.play();
    }
    // 输出
    // 劫大招：禁奥义！瞬狱影杀阵
    // 凯南大招：秘奥义！万雷天牢引
    // 阿卡丽大招：我流秘奥义！表里杀缭乱
}
