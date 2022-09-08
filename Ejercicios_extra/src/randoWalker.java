public class randoWalker {
    public static void showPath(int[][] field) {
        int i, j;
        for (i=0;i<field.length;i++){
            for(j=0;j<field.length;j++){
                System.out.print(field[i][j]+" ");
                
            }
            System.out.println("");
        }      
    }

    public static String nextMove(int[][] field, int row, int column) {
        if (row<0 || column<0 || row > field.length-1 || column >field.length-1) return "end";
        else if (field[row][column] == 0) return "free";
        return "occu";   
    }

    public static void whereToMove(int [] actualPos) {
        int res;
        res = (int) (Math.random()*4);
        System.out.println(res);
        switch (res){
            case 0: actualPos[0]++; // down
            case 1: actualPos[0]--; // up
            case 2: actualPos[1]--; // right
            case 3: actualPos[1]++; // left
        }       
    }

    public static void randomWalker(int[][] field, int r, int c){
        String next;
        int[] position = {r,c};       
        
        do{

            field[position[0]][position[1]]=1;

            do{
            whereToMove(position);
            next = nextMove(field, position[0], position[1]);
            } while (!next.equals("end") && !next.equals("free"));

        } while (!next.equals("end"));
        
    }
        
    

    public static void main(String[] args) {
        int [][] field = new int[10][10];
        
        randomWalker(field, 5, 5);
        System.out.println("");
        showPath(field);
    }


    
}
