package SelectionSort;

class Selection_Sort {

    public static void sort (int[] numbers){
        int min,temp ;
        for (int i = 0; i < numbers.length; i++ ){
            //find position of min value 
            min = i;
            for(int k = i+1; k< numbers.length; k++){
                if (numbers[k] < numbers[min])
                    min = k;
            }
            //swap the values in positions "min" and "i"
            
            temp = numbers[min];
            numbers[min] = numbers[i];
            numbers[i] = temp;

        }
    } 
}
