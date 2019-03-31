package cn.test;

import java.util.Arrays;

public class TestJava {

	/**
	 * Description :asZ
	 * 
	 * @author :WDH
	 * @date :2019��2��16�� ����5:55:11
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
	 * Description :һ��ʮ�Ľ׳˺�   
	 * @author     :WDH
	 * @date       :2019��3��23�� ����5:11:29
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
	 * Description :��������
	 * 
	 * @author :WDH
	 * @date :2019��2��19�� ����22:37:41
	 * @param arr
	 */
	public static void quickSort(int[] arr,int start,int end) {
       if(start<end) {
    	  //�������еĵ�0��������Ϊ��׼��
    	  int stard=arr[start];
    	  //��¼��Ҫ������±�
    	  int low=start;
    	  int heigh=end;
    	 //ѭ���ұȱ�׼����ĺͱȱ�׼��С����  
    	 while (low<heigh) {
    		 //�ұߵ����ֱ�׼���ִ�
    		 while (low<heigh&&stard<=arr[heigh]) {
    			 heigh--;
    		 }
    		 //ʹ���ұߵ����滻��ߵ���
    		 arr[low]=arr[heigh];
    		 //�����ߵ����ֱȱ�׼��С
    		 while (low<heigh&&arr[low]<=stard) {
    			 low++;
    		 }
    		 arr[heigh]=arr[low];
		 }
    	 //�ѱ�׼�������͵�����λ�õ�Ԫ��
    	 arr[low]= stard;
    	 //��������С������
    	 quickSort(arr,start,low);
    	 //�������д������
    	 quickSort(arr,low+1,end);
       }
	}
	
	
	
	/**
	 * Description :ϣ������
	 * 
	 * @author :WDH
	 * @date :2019��2��16�� ����5:51:41
	 * @param arr
	 */
	public static void shellSort(long[] arr) {
		//�������в���
		for (int d = arr.length/2; d >0; d/=2) {
			//��������Ԫ��
			for (int i = d; i < arr.length; i++) {
				//�������ڵ�����Ԫ��
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
	 * Description :ð������
	 * 
	 * @author :WDH
	 * @date :2019��2��16�� ����5:51:41
	 * @param arr
	 */
	public static void maoPaoSort(int[] arr) {
		int tmp = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = arr.length - 1; j > i; j--) {
				if (arr[j] < arr[j - 1]) {
					// ���н���
					tmp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = tmp;
				}
			}
		}
	}

	/**
	 * Description :ѡ������
	 * 
	 * @author :WDH
	 * @date :2019��2��16�� ����5:52:00
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
	 * Description :��������
	 * 
	 * @author :WDH
	 * @date :2019��2��16�� ����5:52:00
	 * @param arr
	 */
	public static void insertSort(int[] arr) {
		int temp = 0;
		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];// ����ÿ����Ҫ������Ǹ���
			int j;
			for (j = i; j > 0 && arr[j - 1] > temp; j--) {// �����������һ�����Ż�
				arr[j] = arr[j - 1];// �Ѵ�����Ҫ������������ƶ�����󲻴���temp�����Ϳճ���j
			}
			arr[j] = temp;// ����Ҫ��������������λ��
		}
	}

}
