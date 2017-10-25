public int[] insertionSort(int [] list){
	int i,j,key,temp;

	 for(i=1;i<list.size(),i++){
	 	key = list.get(i);
	 	j = i-1;
	 	
	 	while(j>=0 && key<list.get(j))
	 	{
	 		temp = list.get(j);
	 		list.set(j,list.get(j+1));
	 		list.set(j+1,temp);
	 		j--;
	 	}
	 }

	 return list;
}