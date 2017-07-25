package cn.bdqn.bean;

/**
 * Created by lzh on 2017/7/25.
 */
public class HelloWorld {
        public static void main(String[] args){
            int [] nums={10,5,8,2,3,50,5000,500,30,65,98};
            /**
             * 外层循环控制轮数     数组的长度-1
             * 外层循环每执行一次， 内层循环执行一遍
             *
             * 无论多少个数字相比
             * 都是相邻的两个数字进行比较，
             * 数值小的元素会交换前面的位置
             * 代码：
             * 外层循环 : 数组长度-1
             * 内层循环： 数组长度-1-i
             *
             */
            for (int i = 0; i < nums.length-1; i++) {
                //内层循环    数组的长度-1-i
                for (int j = 0; j < nums.length-i-1; j++) {
                    if (nums[j]>nums[j+1]) { //相当于 第一个元素大于下一个元素 ，那么需要和下个元素换位置
                        //等量转换
                        int  temp=nums[j];
                        nums[j]=nums[j+1];
                        nums[j+1]=temp;
                    }
                }
            }
            //遍历数组中的元素
            for (int i : nums) {
                System.out.println(i);
            }
        }


}
