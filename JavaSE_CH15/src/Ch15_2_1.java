import java.io.*;
public class Ch15_2_1 {
	//�D�{��
	public static void main(String [] args){
		//�ŧi�r��}�C
		String[] filenames;
		//�ŧiFile����
		File file = new File(args[0]);
		//�O�_�O�ؿ�
		if (file.isDirectory()){
			filenames = file.list(); //���o�ɮץؿ��M��
			//�ϥΰj����ܲM�椺�e
			for (int i = 0;i<filenames.length;i++)
				System.out.println(filenames[i]);
		}else
			System.out.println("["+file+"]���O�ؿ�!");
		
	}
}
