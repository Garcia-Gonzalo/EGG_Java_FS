public class reverseWordArray {
    
    public static void main(String[] args) {
        int i;
        String temp;
        String [] word={"P","E","R","A","S"};
        

        for (i=0; i< (word.length)/2;i++){
            temp = word[i];
            word[i]= word[(word.length)-1-i];
            word[(word.length)-1-i]= temp;
        }
        for (i = 0; i < word.length; i++) {
            System.out.print(word[i]);
            
        }

        
    }
}
