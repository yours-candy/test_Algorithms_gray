package offer;/**
 * Copyright (C), 2019-2021
 * author  candy_chen
 * date   2021/5/8 11:42
 *
 * @Classname test
 * Description: 测试
 */

/**
 *
 */
public class test {
    //暴力，完全不可取
    //最大的n位数是10n次方 - 1，则先算出最大的那个数，然后进行循环输出
    public int[] printNumbers00(int n){
        int end = (int)Math.pow(10,n) - 1;
        int[] res = new int[end];
        for (int i = 0;i < end;i++){
            res[i] = i + 1;
        }
        return res;
    }
    //大数打印法
    //表示大数的变量类型，大数的表示应该用字符串String类型
    //生成数字的字符串集，生成的列表实际上是n位0-9的全排列
    //递归生成全排列
    StringBuilder res;
    int count = 0,n;
    char[] num,loop = {'0','1','2','3','4','5','6','7','8','9'};
    public String printNumbers(int n) {

        res = new StringBuilder(); //数组字符串集
        num = new char[n];
        dfs(0); //开始全排列递归
        res.deleteCharAt(res.length() - 1); //删除最后多余的逗号
        return res.toString();
    }

    private void dfs(int x) {
        if (x == n){
            res.append(String.valueOf(num)).append(',');
            return;
        }
        for (char i : loop) {
            num[x] = i;
            dfs(x + 1);
        }
    }

    public static void main(String[] args) {

    }

}
