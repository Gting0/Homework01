package day05;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 有下列字符串:
 * 销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;前端:green;前端:nick;程序:钱七;销售:alice
 * 分析上述字符串然后统计每个职位总共多少人?
 * 使用Map保存统计的结果，其中key:职位,value为该职位人数
 * 然后分别输出各职位的名称(keySet),各职位人数(entrySet)
 * @author Bonnie
 *
 */
public class Test05 {
    public static void main(String[] args) {
        String str = "销售:张三;财务:李四;销售:王五;财务:赵六;程序:mike;程序:jerry;美工:jackson;" +
                "前端:green;前端:nick;程序:钱七;销售:alice";
        Map map = new HashMap();
        String[] ss = str.split(";");
        int xiaoShou = 0;
        int caiWu = 0;
        int chengXu = 0;
        int qianDuan = 0;
        int meiGong = 0;
        for (int i = 0; i < ss.length; i++) {
            String[] sss = ss[i].split(":");
            if (sss[0].equals("销售")){
                xiaoShou++;
            }
            if (sss[0].equals("财务")){
                caiWu++;
            }
            if (sss[0].equals("程序")){
                chengXu++;
            }
            if (sss[0].equals("前端")){
                qianDuan++;
            }
            if (sss[0].equals("美工")) {
                meiGong++;
            }
        }
        map.put("销售",xiaoShou);
        map.put("财务",caiWu);
        map.put("程序",chengXu);
        map.put("前端",qianDuan);
        map.put("美工",meiGong);
        Set keySet = map.keySet();
        System.out.println(keySet);
        Set entrySet = map.entrySet();
        System.out.println(entrySet);
    }
}
