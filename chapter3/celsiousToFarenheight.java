import java.util.Scanner;
public class celsiousToFarenheight{
	public static void main(String[] args){
     float celsiousScale , farenHeightScale;
    
		Scanner scr  = new Scanner(System.in);
     celsiousScale = scr.nextInt();
     float divi = 9.0f/5.0f;
     farenHeightScale = (divi * celsiousScale+32.0f);
     System.out.println(farenHeightScale);
	}
}