package chap05_object;
/**
 * 
 * @ClassName:  HanoiTower   
 * @Description:汉诺塔问题 		  
 * @author: 谢洪伟 
 * @date:   2018年8月14日 下午4:21:42   
 *     
 * @Copyright: 2018 www.tydic.com Inc. All rights reserved. 
 *
 */
public class HanoiTower {
	public static void moveDish(int level, char from,char inter, char to){//level 盘子个数
		if (level==1) {
			System.out.println("从"+ from +"移动1号盘子到" +to);
		}else{
			moveDish(level-1, from, to, inter);
			System.out.println("从"+ from +"移动"+level+"号盘子到" +to);
			moveDish(level-1, inter, from, to);
		}
	}
	
	public static void main(String[] args) {
		moveDish(3, 'A', 'B', 'C');
	}
}
