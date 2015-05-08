import java.io.*;
public class Ch15_2_1 {
	//主程式
	public static void main(String [] args){
		//宣告字串陣列
		String[] filenames;
		//宣告File物件
		File file = new File(args[0]);
		//是否是目錄
		if (file.isDirectory()){
			filenames = file.list(); //取得檔案目錄清單
			//使用迴圈顯示清單內容
			for (int i = 0;i<filenames.length;i++)
				System.out.println(filenames[i]);
		}else
			System.out.println("["+file+"]不是目錄!");
		
	}
}
