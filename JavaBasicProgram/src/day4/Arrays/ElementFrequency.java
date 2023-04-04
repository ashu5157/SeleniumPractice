package day4.Arrays;

public class ElementFrequency {

	public static void main(String[] args) {
		int age[]={10,25,10,30,10,25,10,20,10,30,45};
		// to store frequency of the array elements
		int fre[]=new int[age.length];
		
		int visited=0-1;
		for(int i=0;i<age.length;i++) {
			int count=1;
			for(int j=i+1;j<age.length;j++) {
				
				if(age[i]==age[j]) {
					count++;
					fre[j]=visited;
				}
			}
			if(fre[i]!=visited) {
				fre[i]=count;
			}
		}
		System.out.println("****************************");
		for(int i=0;i<fre.length;i++) {
			if(fre[i]!=visited) {
				System.out.println(age[i]+" : "+fre[i]);
			}
		}
	}

}