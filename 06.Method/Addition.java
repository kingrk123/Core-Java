class Addition 
{

	public static void main(String[] arg){
	
	int[] arr=new int[]{1,2,1,2,8};
		
	String result="false";
		for(int i=0;i<5/2;i++){
		
		if(arr[i]==arr[i+(5/2)]){
			result="true";
		}else{
			result="false";
		}
	}
		System.out.println(result);

	}

}
