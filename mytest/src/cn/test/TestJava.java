package cn.test;

import java.util.Arrays;

public class TestJava {

	/**
	 * Description :123
	 * 
	 * @author :WDH
	 * @date :2019年2月16日 下午5:55:11
	 * @param args
	 */
	public static void main(String[] args) {

//		int[] arr = { 12, 23, 41, 32, 13,78,32,45,54,65,32,43 };
//
//		quickSort(arr,0,arr.length-1);
//
//		System.out.println(Arrays.toString(arr));
		
//	   System.out.println("ct".hashCode());
//	   System.out.println("tc".hashCode());
	   System.out.println(jieChen());
	}

	
	/**
	 * Description :一到十的阶乘和   
	 * @author     :WDH
	 * @date       :2019年3月23日 下午5:11:29
	 * @return   
	 */
	public static int jieChen() {
		int   sum =0;
		for (int i = 1; i <= 10; i++) {
			int  mun =1;
		   for (int j = 1; j <= i; j++) {
			   System.out.println(j);
			   mun=mun*j;
		   }
		   sum+=mun;
		}
		return sum;
	}
	
	/**
	 * Description :快速排序
	 * 
	 * @author :WDH
	 * @date :2019年2月19日 下午22:37:41
	 * @param arr
	 */
	public static void quickSort(int[] arr,int start,int end) {
       if(start<end) {
    	  //把数组中的第0个数字做为标准数
    	  int stard=arr[start];
    	  //记录需要排序的下标
    	  int low=start;
    	  int heigh=end;
    	 //循环找比标准数大的和比标准数小的数  
    	 while (low<heigh) {
    		 //右边的数字标准数字大
    		 while (low<heigh&&stard<=arr[heigh]) {
    			 heigh--;
    		 }
    		 //使用右边的数替换左边的数
    		 arr[low]=arr[heigh];
    		 //如果左边的数字比标准数小
    		 while (low<heigh&&arr[low]<=stard) {
    			 low++;
    		 }
    		 arr[heigh]=arr[low];
		 }
    	 //把标准数赋给低的所在位置的元素
    	 arr[low]= stard;
    	 //处理所有小的数字
    	 quickSort(arr,start,low);
    	 //处理所有大的数字
    	 quickSort(arr,low+1,end);
       }
	}
	
	
	
	/**
	 * Description :希尔排序
	 * 
	 * @author :WDH
	 * @date :2019年2月16日 下午5:51:41
	 * @param arr
	 */
	public static void shellSort(long[] arr) {
		//遍历所有步长
		for (int d = arr.length/2; d >0; d/=2) {
			//遍历所有元素
			for (int i = d; i < arr.length; i++) {
				//遍历组内的素有元素
				for (int j = i-d; j >=0; j-=d) {
					if(arr[j]>arr[j+d]) {
						long tamp=arr[j];
						arr[j]=arr[j+d];
						arr[j+d]=tamp;
					}
				}
			}
		}
	}

	/**
	 * Description :冒泡排序
	 * 
	 * @author :WDH
	 * @date :2019年2月16日 下午5:51:41
	 * @param arr
	 */
	public static void maoPaoSort(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					// 进行交换
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}

	/**
	 * Description :选择排序
	 * 
	 * @author :WDH
	 * @date :2019年2月16日 下午5:52:00
	 * @param arr
	 */
	public static void selectionSort(int[] arr) {
		int k = 0;
		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			k = i;
			for (int j = i; j < arr.length; j++) {
				if (arr[j] < arr[k]) {
					k = j;
				}
			}
			tmp = arr[i];
			arr[i] = arr[k];
			arr[k] = tmp;
		}
	}

	/**
	 * Description :插入排序
	 * 
	 * @author :WDH
	 * @date :2019年2月16日 下午5:52:00
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];// 保存每次需要插入的那个数
			int j;
			for (j = i; j > 0 && arr[j - 1] > temp; j--) {// 这个较上面有一定的优化
				arr[j] = arr[j - 1];// 把大于需要插入的数往后移动。最后不大于temp的数就空出来j
			}
			arr[j] = temp;// 将需要插入的数放入这个位置
		}
	}

}
